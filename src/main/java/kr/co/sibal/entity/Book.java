package kr.co.sibal.entity;

import lombok.Data;
import lombok.Setter;
import lombok.Getter;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Entity
public class Book {

    @Id
    private Long id;

    private String title;

    private String author;

    private Integer pages;


}
