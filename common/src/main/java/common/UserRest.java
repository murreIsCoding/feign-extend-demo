package common;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @Author LMY
 * @Date 2022/4/20 15:49
 * @Version 1.0
 */

/**
 * 这里不可以使用RequestMapping，所有路径都放到方法上。不然会报错，我认为这带来的不便是可以接受的
 * 如果需要共存，请查阅https://github.com/spring-cloud/spring-cloud-netflix/issues/466
 */
public interface UserRest {
    @GetMapping("/user/findById")
    String findById(@RequestParam Integer id);
}
