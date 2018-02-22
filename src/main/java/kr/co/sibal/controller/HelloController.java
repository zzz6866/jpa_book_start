package kr.co.sibal.controller;

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

    @RequestMapping("/greeting/{id}")
    public String greeting(@PathVariable(value = "id", required = false) long id, Model model) {
        model.addAttribute("id", id);
        //model.addAttribute("entity", cartService.getCart(id));
        log.trace("trace");
        log.debug("debug");
        log.info("info");
        log.warn("warn");
        log.error("error");

        return "greeting";
    }
}

