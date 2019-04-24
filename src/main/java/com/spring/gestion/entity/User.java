package com.spring.gestion.entity;

import javax.persistence.*;

//https://shujatweb.wordpress.com/2018/07/12/spring-mvc-registration-login-example-using-hibernate-mysql-bootstrap-4/
@Entity
@Table(name = "user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column(name = "firstname")
    private String firstname;
    @Column(name = "lasteName")
    private String lasteName;
    @Column(name = "email")
    private String email;
    @Column(name = "password")
    private String password;
    @Column(name = "active")
    private int active;

    @ManyToMany(cascade = cascadeType.all)

}
