import org.junit.jupiter.api.Test;

/**
 * @ClassName UploadTest
 * @Author kg
 * @Description TODO
 * @Date 2022/8/6 12:38
 * @Version 1.0
 */
public class UploadTest {

    @Test
    public void test1() {
        String fileName = "ererewe.jpg";
        String suffix = fileName.substring(fileName.lastIndexOf("."));
        System.out.println(suffix);
    }
}
