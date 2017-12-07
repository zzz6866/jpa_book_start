package kr.co.sibal001;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by pjh on 2017-11-28.
 */
//@RestController
@Controller
public class HelloController {
    private static final Logger log = LoggerFactory.getLogger(HelloController.class);

    @RequestMapping("/")
    public String hello() {
        return "main";
    }

    @RequestMapping("/greeting/{name}")
    public String greeting(@PathVariable(value = "name", required = false) String name, Model model) {
        model.addAttribute("name", name);
        log.debug("name = " + name);
        return "greeting";
    }
}

