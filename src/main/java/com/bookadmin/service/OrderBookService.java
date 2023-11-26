package com.bookadmin.service;

import com.bookadmin.entity.po.Book;
import com.bookadmin.entity.po.UserBook;
import com.bookadmin.entity.vo.OrderBook;

import java.util.List;

public interface OrderBookService {

    /**
     * 查询所有可订阅图书
     * @return
     */
    List<Book> selectAvailableBook();

    /**
     * 根据用户查询订阅图书
     * @param id
     * @return
     */
    List<OrderBook> selectOrderBookByUser(Integer id);

    /**
     * 删除已订阅图书
     * @param id
     */
    void deleteOrderBook(Integer id);

    /**
     * 根据用户添加图书
     * @param po
     */
    void addOrderBookWithUser(UserBook po);
}
