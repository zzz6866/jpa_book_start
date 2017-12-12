package kr.co.sibal.entity;

/**
 * Created by pjh on 2017-12-07.
 */

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Entity
public class Cart {

    @Id
    Integer id;

    String title;
}
