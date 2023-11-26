package com.bookadmin.entity.po;

import lombok.Data;

import java.util.List;

@Data
public class User {
    private Integer id;
    private String username;
    private String password;
    private String role;
    private List<Book> bookList;
}
