package kr.co.sibal.service;


import kr.co.sibal.dto.entity.BookDTO;
import kr.co.sibal.entity.Book;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface BookService {

    public Page<Book> findBookBy(BookDTO bookDTO, Pageable pageable);

    public Iterable<Book> findBookAll();
}
