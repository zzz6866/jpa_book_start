package kr.co.sibal001;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by pjh on 2017-11-28.
 */
@RestController
public class HelloController {
    @RequestMapping("/")
    public String hello() {
        return "Hello, Spring Boot!";
    }
}

