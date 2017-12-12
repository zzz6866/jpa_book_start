package kr.co.sibal.service.impl;

import kr.co.sibal.dao.BookRepository;
import kr.co.sibal.entity.Book;
import kr.co.sibal.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("bookService")
public class BookServiceImpl implements BookService {
    @Autowired
    private BookRepository bookRepository;

    @Override
    public Book findBookBy(Long id) {
        return bookRepository.findOne(id);
    }

    @Override
    public Iterable<Book> findBookAll() {
        return bookRepository.findAll();
    }
}
