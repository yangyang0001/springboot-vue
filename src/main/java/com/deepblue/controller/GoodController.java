package com.deepblue.controller;

import com.alibaba.fastjson.JSON;
import com.deepblue.controller.entity.Good;
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
public class GoodController {

    @RequestMapping("/initGoods")
    public String initGoods() {
        List<Good> goods = new ArrayList<Good>();
        Good good0 = new Good(1L, "笔记本", "favicon.ico", 198L, 1L, false);
        Good good1 = new Good(2L, "钢笔", "favicon.ico", 80L, 1L, false);
        goods.add(good0);
        goods.add(good1);

        return JSON.toJSONString(goods);
    }
}
