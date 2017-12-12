package kr.co.sibal.entity;

/**
 * Created by pjh on 2017-12-07.
 */

import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
public class Cart {

    @Id
    Integer id;

    String title;
}
