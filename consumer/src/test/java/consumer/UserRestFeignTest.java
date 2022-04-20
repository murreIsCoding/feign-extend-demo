package consumer;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @Author LMY
 * @Date 2022/4/20 16:07
 * @Version 1.0
 */
@SpringBootTest
class UserRestFeignTest {
    @Autowired
    UserRestFeign feign;

    @Test
    void contextLoads() {
    }

    @Test
    void use() {

        System.out.println("收到调用结果" + feign.findById(1));
    }
}
