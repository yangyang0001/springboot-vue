package com.deepblue.test;

import com.alibaba.fastjson.JSON;
import com.deepblue.controller.entity.Book;
import org.apache.tomcat.jni.Time;

import java.util.ArrayList;
import java.util.List;

/**
 *
 */
public class Main {

    public static void main(String[] args) {

//        List<Integer> list = new ArrayList<>();
//        list.add(0);
//        list.add(1);
//        list.add(2);
//
//        System.out.println(list.get(list.size()));

//        getOS("zhaoliu");

//        Book book = new Book(1L, "vue", "hello");
//        update(book);
//        System.out.println(book);

//        breakMethod();

        execute(100, "zhangsan", "lisi");


    }


    public static void getOS(String username) {


        switch (username) {
            case "zhangsan":
                System.out.println("this is zhangsan");
                break;
            case "lisi":
                System.out.println("this is lisi");
                break;
            case "wangwu":
                System.out.println("come here wangwu");
                break;
            case "zhaoliu":
                System.out.println("come here zhaoliu");
                break;
            default:
                System.out.println("there is none thing");
        }

    }

    public static void update(Book book) {

        book.setId(100L);
        book.setName("go");
        book.setAuthor("world");

    }

    public static void breakMethod() {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (i == 1) {
                    continue;
                } else {
                    System.out.println("i = " + i + ", j = " + j);
                }
            }
        }
    }

    public static void execute(int a, String ... strings) {
        System.out.println("a = " + a);
        String[] params = strings.clone();
        System.out.println("params = " + JSON.toJSONString(params));
    }
}
