package com.kg.reggie;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.cache.annotation.EnableCaching;

/**
 * @ClassName ReggieApplication
 * @Author kg
 * @Description TODO
 * @Date 2022/8/1 19:51
 * @Version 1.0
 */

@Slf4j
@SpringBootApplication
@ServletComponentScan
@EnableCaching // 开启缓存注解功能
public class ReggieApplication {

    public static void main(String[] args) {
        SpringApplication.run(ReggieApplication.class, args);
        log.info("项目启动成功...");
    }
}
