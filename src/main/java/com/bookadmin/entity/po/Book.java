package com.bookadmin.entity.po;

import lombok.Data;
@Data
public class Book {
    private Integer id;
    private String bName;
    private String bAuthor;
    private String bPublisher;
    private int bCount;
    private int available;
}
