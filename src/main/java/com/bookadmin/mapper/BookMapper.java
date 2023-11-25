package com.bookadmin.mapper;

import com.bookadmin.entity.po.Book;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface BookMapper {

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
