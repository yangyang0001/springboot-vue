package com.deepblue.controller;

import com.alibaba.fastjson.JSON;
import com.deepblue.controller.entity.Mine;
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
public class MineProfilerController {

    @RequestMapping("/profiler")
    public String profiler() {

        List<Mine> mineList = new ArrayList<>();

        Mine mine0 = new Mine(0L, "name-0", "pass-0");
        Mine mine1 = new Mine(1L, "name-1", "pass-1");
        Mine mine2 = new Mine(2L, "name-2", "pass-2");
        Mine mine3 = new Mine(3L, "name-3", "pass-3");

        mineList.add(mine0);
        mineList.add(mine1);
        mineList.add(mine2);
        mineList.add(mine3);

        // 测试 JProfiler 的使用
        for(long i = 4; i < Long.MAX_VALUE; i++) {
            mineList.add(new Mine(i, "name-" + i, "pass-" + i));
        }

        return JSON.toJSONString(mineList);
    }
}
