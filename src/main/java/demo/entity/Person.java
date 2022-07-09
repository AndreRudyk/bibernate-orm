package demo.entity;

import bibernate.annotation.Column;
import lombok.Data;

@Data
public class Person {

    private Long id;

    @Column("fist_name")
    private String firstName;

    @Column("last_name")
    private String lastName;
}
