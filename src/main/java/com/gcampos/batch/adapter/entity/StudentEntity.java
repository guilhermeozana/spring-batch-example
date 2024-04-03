package com.gcampos.batch.adapter.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "STUDENT")
@Data
public class StudentEntity {

    @Id
    @GeneratedValue
    private Integer id;

    private String firstname;

    private String lastname;

    private int age;
}
