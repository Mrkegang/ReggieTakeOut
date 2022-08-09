package com.kg.reggie.controller;

import com.kg.reggie.common.R;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.util.UUID;

/**
 * @ClassName CommonController
 * @Author kg
 * @Description 文件的上传和下载
 * @Date 2022/8/6 11:32
 * @Version 1.0
 * @RestController注解，代表返回的是json格式的数据，这个注解是Spring4之后新加的注解，
 * 原来返回json格式的数据需要@ResponseBody配合@Controller一起使用；
 *
 * 如果我们在项目中使用的是@Conrtroller注解的话，不加@Response注解，则当直接返回一个字符串的时候，就好比返回的是一个模板页面，
 * 类似我们返回一个jsp页面一样。所以我们需要加上模板引擎（这种返回html一类的模板的开发方式现在一般不会再用了，
 * 因为现在都是前后端分离式的开发，后台服务器一般只需要返回json格式的数据即可，所以了解即可）
 */
@RestController
@RequestMapping("/common")
@Slf4j
public class CommonController {

    @Value("${reggie.path}")
    private String basePath;

    /**
     * 文件上传
     * @param file
     * @return
     */
    @PostMapping("/upload")
    public R<String> upload(MultipartFile file) {
        // file是一个临时文件，需要转存到指定位置，否则本次请求完成后临时文件会删除
        log.info(file.toString());

        // 原始文件名
        String originalFilename = file.getOriginalFilename(); // abc.png
        String suffix = originalFilename.substring(originalFilename.lastIndexOf(".")); // 截取文件后缀

        // 使用UUID重新生成文件名，防止文件名重复造成文件覆盖
        String fileName = UUID.randomUUID().toString() + suffix; // sadfsadfasdf.png

        // 创建一个目录对象
        File dir = new File(basePath);
        // 判断当前目录是否存在
        if (!dir.exists()) {
            // 目录不存在，需要创建
            dir.mkdir();
        }

        try {
            // 将文件转存到指定位置
            file.transferTo(new File(basePath + fileName));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return R.success(fileName);
    }

    /**
     * 文件下载
     * @param name
     * @param response
     */
    @GetMapping("/download")
    public void download(String name, HttpServletResponse response) {

        try {
            // 输入流，通过出入刘读取文件内容
            FileInputStream fileInputStream = new FileInputStream(new File(basePath + name));

            // 输出流，通过输出流将文件写回浏览器，在浏览器展示图片了
            ServletOutputStream outputStream = response.getOutputStream();

            response.setContentType("image/jpeg");

            int len = 0;
            byte[] bytes = new byte[1024];
            while ((len = fileInputStream.read(bytes)) != -1) {
                outputStream.write(bytes, 0, len);
                outputStream.flush();
            }

            // 关闭资源
            outputStream.close();
            fileInputStream.close();
        } catch (Exception e) {
            e.printStackTrace();
        }



    }
}
