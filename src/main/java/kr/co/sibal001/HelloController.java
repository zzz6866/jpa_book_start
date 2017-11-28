package kr.co.sibal001;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

/**
 * Created by pjh on 2017-11-28.
 */
//@RestController
@Controller
public class HelloController {
    @RequestMapping("/")
    public String hello() {
        return "Hello, Spring Boot!";
    }

    @RequestMapping("/greeting/{name}")
    public String greeting(@PathVariable(value = "name", required = false) String name, Model model) {
        model.addAttribute("name", name);
        return "greeting";
    }
}

