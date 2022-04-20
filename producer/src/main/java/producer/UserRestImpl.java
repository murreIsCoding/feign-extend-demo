package producer;
import common.UserRest;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author LMY
 * @Date 2022/4/20 15:50
 * @Version 1.0
 */
@RestController
public class UserRestImpl implements UserRest {
    @Override
    public String findById(Integer id) {
        return "Murre";
    }
}
