package kr.co.sibal.service.impl;

import kr.co.sibal.dto.entity.BookDTO;
import kr.co.sibal.entity.Book;
import kr.co.sibal.repository.BookRepository;
import kr.co.sibal.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service("bookService")
public class BookServiceImpl implements BookService {
    @Autowired
    private BookRepository bookRepository;

    @Override
    public Page<Book> findBookBy(BookDTO bookDTO, Pageable pageable) {
        //return bookRepository.findOne(bookDTO.getId());
        return bookRepository.findAll(bookDTO.searchBook(), pageable);
    }

    @Override
    public Iterable<Book> findBookAll() {
        return bookRepository.findAll();
    }
}
