package my.pkg.hello;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by asamba on 7/27/19.
 */
@RestController
public class HelloController {

    @GetMapping(path="/hello")
    public String sayHello(){

        return "Hello World2!";
    }
}
