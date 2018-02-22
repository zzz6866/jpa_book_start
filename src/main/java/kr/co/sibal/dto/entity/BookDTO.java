package kr.co.sibal.dto.entity;

import com.querydsl.core.BooleanBuilder;
import com.querydsl.core.types.Predicate;
import kr.co.sibal.entity.QBook;
import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class BookDTO {

    private Long id;

    private String title;

    private String author;

    private Integer pages;


    public Predicate searchBook() {
        QBook book = QBook.book;
        BooleanBuilder builder = new BooleanBuilder();
        if (this.id != null) {
            builder.and(book.id.eq(this.id));
        }

        if (this.title != null) {
            builder.and(book.title.eq(this.title));
        }

        if (this.author != null) {
            builder.and(book.author.eq(this.author));
        }
        return builder;
    }
}
