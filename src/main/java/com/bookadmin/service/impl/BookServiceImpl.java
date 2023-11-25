package com.bookadmin.service.impl;

import com.bookadmin.entity.po.Book;
import com.bookadmin.mapper.BookMapper;
import com.bookadmin.service.BookService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class BookServiceImpl implements BookService {
    @Resource
    BookMapper bookMapper;

    @Override
    public List<Book> selectAllBook() {
        return bookMapper.selectAllBook();
    }

    @Override
    public void updateBook(Book po) {
        bookMapper.updateBook(po);
    }

    @Override
    public void addBook(Book po) {
        bookMapper.addBook(po);
    }

    @Override
    public void deleteBook(Integer id) {
        bookMapper.deleteBook(id);
    }
}
