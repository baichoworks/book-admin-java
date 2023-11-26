package com.bookadmin.controller;

import com.bookadmin.entity.po.Book;
import com.bookadmin.entity.po.User;
import com.bookadmin.entity.po.UserBook;
import com.bookadmin.entity.vo.OrderBook;
import com.bookadmin.service.OrderBookService;
import com.bookadmin.util.Result;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/order")
public class OrderController {

    @Resource
    OrderBookService orderBookService;

    /**
     * 查询所有可订阅图书
     * @return
     */
    @GetMapping("/getAvailableBook")
    public Result getAvailableBook(){
        List<Book> availableBook = orderBookService.selectAvailableBook();
        return Result.getInstance()
                .setData(availableBook);
    }

    /**
     * 根据用户查询已订阅图书
     * @return
     */
    @PostMapping("/getOrderBookByUser")
    public Result getOrderBookByUser(@RequestBody User vo){
        List<OrderBook> orderBook = orderBookService.selectOrderBookByUser(vo.getId());
        return Result.getInstance()
                .setData(orderBook);
    }

    /**
     * 删除已订阅图书
     * @param vo
     * @return
     */
    @PostMapping("/deleteOrderBook")
    public Result deleteOrderBook(@RequestBody OrderBook vo){
        orderBookService.deleteOrderBook(vo.getId());
        return Result.getInstance()
                .setMessage("删除成功");
    }

    /**
     * 根据用户添加图书
     * @param vo
     * @return
     */
    @PostMapping("/addOrderBookWithUser")
    public Result addOrderBookWithUser(@RequestBody UserBook vo){
        orderBookService.addOrderBookWithUser(vo);
        return Result.getInstance()
                .setMessage("添加成功");
    }
}
