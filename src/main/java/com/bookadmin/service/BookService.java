package com.bookadmin.service;

import com.bookadmin.entity.po.Book;

import java.util.List;

public interface BookService {
    /**
     * 查询所有图书
     * @return
     */
    List<Book> selectAllBook();

    /**
     * 修改图书
     * @param po
     */
    void updateBook(Book po);

    /**
     * 添加图书
     * @param po
     */
    void addBook(Book po);

    /**
     * 删除图书
     * @param id
     */
    void deleteBook(Integer id);
}
