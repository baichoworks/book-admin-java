package com.bookadmin.service.impl;

import com.bookadmin.entity.po.Book;
import com.bookadmin.entity.po.UserBook;
import com.bookadmin.entity.vo.OrderBook;
import com.bookadmin.mapper.OrderBookMapper;
import com.bookadmin.service.OrderBookService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class OrderBookServiceImpl implements OrderBookService {
    @Resource
    OrderBookMapper orderBookMapper;


    @Override
    public List<Book> selectAvailableBook() {
        return orderBookMapper.selectAvailableBook();
    }

    @Override
    public List<OrderBook> selectOrderBookByUser(Integer id) {
        return orderBookMapper.selectOrderBookByUser(id);
    }

    @Override
    public void deleteOrderBook(Integer id) {
        orderBookMapper.deleteOrderBook(id);
    }

    @Override
    public void addOrderBookWithUser(UserBook po) {
        orderBookMapper.addOrderBookWithUser(po);
    }
}
