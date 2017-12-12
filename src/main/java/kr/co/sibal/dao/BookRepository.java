package kr.co.sibal.dao;

import kr.co.sibal.entity.Book;
import kr.co.sibal.entity.Cart;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.Collection;

/**
 * Created by pjh on 2017-12-12.
 */
public interface BookRepository extends PagingAndSortingRepository<Book, Long> {

}
