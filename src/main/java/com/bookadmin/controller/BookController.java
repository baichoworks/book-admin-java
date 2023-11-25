package com.bookadmin.controller;

import com.bookadmin.entity.po.Book;
import com.bookadmin.service.BookService;
import com.bookadmin.util.Result;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/book")
public class BookController {

    @Resource
    BookService bookService;

    /**
     * 查询所有图书
     * @return
     */
    @GetMapping("/getAllBook")
    public Result getAllBook(){
        List<Book> bookList = bookService.selectAllBook();
        return Result.getInstance()
                .setData(bookList);
    }

    /**
     * 修改图书
     * @param vo
     * @return
     */
    @PostMapping("/updateBook")
    public Result updateBook(@RequestBody Book vo){
        bookService.updateBook(vo);
        return Result.getInstance()
                .setMessage("修改成功");
    }

    /**
     * 添加图书
     * @param vo
     * @return
     */
    @PostMapping("/addBook")
    public Result addBook(@RequestBody Book vo){
        bookService.addBook(vo);
        return Result.getInstance()
                .setMessage("添加成功");
    }

    @PostMapping("/deleteBook")
    public Result deleteBook(@RequestBody Book vo){
        bookService.deleteBook(vo.getId());
        return Result.getInstance()
                .setMessage("删除成功");
    }
}
