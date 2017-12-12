package kr.co.sibal.controller;

import kr.co.sibal.entity.Book;
import kr.co.sibal.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller("bookController")
@RequestMapping(value = "/books")
public class BookController {

    @Autowired
    private BookService bookService;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String main() {
        return "main";
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public String getBookById(@PathVariable("id") Long id, Model model) {
        model.addAttribute("id", id);
        model.addAttribute("entity", bookService.findBookBy(id));
        return "greeting";
    }

}
