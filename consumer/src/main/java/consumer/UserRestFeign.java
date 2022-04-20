package consumer;

import common.UserRest;
import org.springframework.cloud.openfeign.FeignClient;

/**
 * @Author LMY
 * @Date 2022/4/20 16:04
 * @Version 1.0
 */
//现实中，这里只需要name设置为提供者的application-id就可以自动发现，不需要提供url
@FeignClient(name = "producer",url = "localhost:8080")
public interface UserRestFeign extends UserRest {
}
