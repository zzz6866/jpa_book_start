package kr.co.sibal.dto.entity;

/**
 * Created by pjh on 2017-12-07.
 */

import lombok.Data;
import lombok.ToString;

import java.util.function.Predicate;

@Data
@ToString
public class CartDTO {

    Long id;

    String title;

    public Predicate searchCart() {
        return null;
    }
}
