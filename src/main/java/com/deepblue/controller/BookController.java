package com.deepblue.controller;

import com.alibaba.fastjson.JSON;
import com.deepblue.controller.entity.Book;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;


/**
 *
 */
@CrossOrigin
@RestController
public class BookController {

    @RequestMapping("/getBooks")
    public String getBooks() {
        List<Book> bookList = new ArrayList<>();

        Book book0 = new Book(1L, "《 Vue.js 实战》", "梁澈");
        Book book1 = new Book(2L, "《 JavaScript 语言精粹》", "Douglas Crockford");
        Book book2 = new Book(3L, "《 JavaScript 高级程序设计》", "Nicholas C. Zakas");

        bookList.add(book0);
        bookList.add(book1);
        bookList.add(book2);

        return JSON.toJSONString(bookList);

    }
}
