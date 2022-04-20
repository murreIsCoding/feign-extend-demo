package common;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author LMY
 * @Date 2022/4/20 15:49
 * @Version 1.0
 */

public interface UserRest {
    @GetMapping("/user/findById")
    String findById(@RequestParam Integer id);
}
