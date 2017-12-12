package kr.co.sibal.service;


import kr.co.sibal.entity.Book;

public interface BookService {

    public Book findBookBy(Long id);

    public Iterable<Book> findBookAll();
}
