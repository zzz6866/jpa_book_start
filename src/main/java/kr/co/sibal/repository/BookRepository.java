package kr.co.sibal.repository;

import kr.co.sibal.entity.Book;
import org.springframework.data.querydsl.QueryDslPredicateExecutor;
import org.springframework.data.repository.PagingAndSortingRepository;

/**
 * Created by pjh on 2017-12-12.
 */
public interface BookRepository extends PagingAndSortingRepository<Book, Long>, QueryDslPredicateExecutor<Book> {

}
