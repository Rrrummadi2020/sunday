package com.chandu.spring.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Data
@Table(name = "EMPLOYEE")
public class Employee {
    @Id
    @GeneratedValue
    private Long id;

    private String name;

    private Long salary;
}
