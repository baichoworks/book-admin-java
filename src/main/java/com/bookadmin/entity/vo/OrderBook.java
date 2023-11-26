package com.bookadmin.entity.vo;

import com.bookadmin.entity.po.Book;
import lombok.Data;

@Data
public class OrderBook {
    private Integer id;
    private String bName;
    private String bAuthor;
    private String bPublisher;
}
