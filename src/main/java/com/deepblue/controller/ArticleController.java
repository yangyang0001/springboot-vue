package com.deepblue.controller;

import com.alibaba.fastjson.JSON;
import com.deepblue.controller.entity.Article;
import com.deepblue.controller.entity.Cover;
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
public class ArticleController {

    @RequestMapping("/articles")
    public String articles(int page, int limit) {

        List<Article> articleList = new ArrayList<>();

        List<String> images0 = new ArrayList<>();
        images0.add("favicon.ico");
        images0.add("favicon.ico");
        Cover cover0 = new Cover(2, images0);
        Article article0 = new Article("0000", "0000", "0000", 0L, "2022-11-28 00:00:00", "0000", 0, cover0);

        List<String> images1 = new ArrayList<>();
        Cover cover1 = new Cover(0, images1);
        Article article1 = new Article("0001", "0001", "0001", 100L, "2022-11-28 01:00:00", "0001", 0, cover1);

        List<String> images2 = new ArrayList<>();
        images2.add("favicon.ico");
        images2.add("favicon.ico");
        images2.add("favicon.ico");
        Cover cover2 = new Cover(3, images2);
        Article article2 = new Article("0002", "0002", "0002", 200L, "2022-11-28 02:00:00", "0002", 0, cover2);

        List<String> images3 = new ArrayList<>();
        images3.add("favicon.ico");
        Cover cover3 = new Cover(1, images3);
        Article article3 = new Article("0003", "0003", "0003", 300L, "2022-11-28 03:00:00", "0003", 0, cover3);

        List<String> images4 = new ArrayList<>();
        images4.add("favicon.ico");
        Cover cover4 = new Cover(1, images4);
        Article article4 = new Article("0004", "0004", "0004", 400L, "2022-11-28 04:00:00", "0004", 0, cover4);

        List<String> images5 = new ArrayList<>();
        images5.add("favicon.ico");
        Cover cover5 = new Cover(1, images5);
        Article article5 = new Article("0005", "0005", "0005", 500L, "2022-11-28 05:00:00", "0005", 0, cover5);

        List<String> images6 = new ArrayList<>();
        images6.add("favicon.ico");
        Cover cover6 = new Cover(1, images6);
        Article article6 = new Article("0006", "0006", "0006", 600L, "2022-11-28 06:00:00", "0006", 0, cover6);

        List<String> images7 = new ArrayList<>();
        images7.add("favicon.ico");
        Cover cover7 = new Cover(1, images7);
        Article article7 = new Article("0007", "0007", "0007", 700L, "2022-11-28 07:00:00", "0007", 0, cover7);

        List<String> images8 = new ArrayList<>();
        images8.add("favicon.ico");
        Cover cover8 = new Cover(1, images8);
        Article article8 = new Article("0008", "0008", "0008", 800L, "2022-11-28 08:00:00", "0008", 0, cover8);

        List<String> images9 = new ArrayList<>();
        images9.add("favicon.ico");
        Cover cover9 = new Cover(1, images9);
        Article article9 = new Article("0009", "0009", "0009", 900L, "2022-11-28 09:00:00", "0009", 0, cover9);

        List<String> images10 = new ArrayList<>();
        images10.add("favicon.ico");
        Cover cover10 = new Cover(1, images10);
        Article article10 = new Article("0010", "0010", "0010", 1000L, "2022-11-28 10:00:00", "0010", 0, cover10);

        List<String> images11 = new ArrayList<>();
        Cover cover11 = new Cover(0, images11);
        Article article11 = new Article("0011", "0011", "0011", 1100L, "2022-11-28 11:00:00", "0011", 0, cover11);

        List<String> images12 = new ArrayList<>();
        images12.add("favicon.ico");
        images12.add("favicon.ico");
        images12.add("favicon.ico");
        Cover cover12 = new Cover(3, images12);
        Article article12 = new Article("0012", "0012", "0012", 1200L, "2022-11-28 12:00:00", "0012", 0, cover12);

        List<String> images13 = new ArrayList<>();
        images13.add("favicon.ico");
        Cover cover13 = new Cover(1, images13);
        Article article13 = new Article("0013", "0013", "0013", 1300L, "2022-11-28 13:00:00", "0013", 0, cover13);

        List<String> images14 = new ArrayList<>();
        images14.add("favicon.ico");
        Cover cover14 = new Cover(1, images14);
        Article article14 = new Article("0014", "0014", "0014", 1400L, "2022-11-28 14:00:00", "0014", 0, cover14);

        List<String> images15 = new ArrayList<>();
        images15.add("favicon.ico");
        Cover cover15 = new Cover(1, images15);
        Article article15 = new Article("0015", "0015", "0015", 1500L, "2022-11-28 15:00:00", "0015", 0, cover15);

        List<String> images16 = new ArrayList<>();
        images16.add("favicon.ico");
        Cover cover16 = new Cover(1, images16);
        Article article16 = new Article("0016", "0016", "0016", 1600L, "2022-11-28 16:00:00", "0016", 0, cover16);

        List<String> images17 = new ArrayList<>();
        images17.add("favicon.ico");
        Cover cover17 = new Cover(1, images17);
        Article article17 = new Article("0017", "0017", "0017", 1700L, "2022-11-28 17:00:00", "0017", 0, cover17);

        List<String> images18 = new ArrayList<>();
        images18.add("favicon.ico");
        Cover cover18 = new Cover(1, images18);
        Article article18 = new Article("0018", "0018", "0018", 1800L, "2022-11-28 18:00:00", "0018", 0, cover18);

        List<String> images19 = new ArrayList<>();
        images19.add("favicon.ico");
        Cover cover19 = new Cover(1, images19);
        Article article19 = new Article("0019", "0019", "0019", 1900L, "2022-11-28 19:00:00", "0019", 0, cover19);

        List<String> images20 = new ArrayList<>();
        images20.add("favicon.ico");
        Cover cover20 = new Cover(1, images20);
        Article article20 = new Article("0020", "0020", "0020", 2000L, "2022-11-28 20:00:00", "0020", 0, cover20);

        List<String> images21 = new ArrayList<>();
        images21.add("favicon.ico");
        Cover cover21 = new Cover(1, images21);
        Article article21 = new Article("0021", "0021", "0021", 2100L, "2022-11-28 21:00:00", "0021", 0, cover21);


        articleList.add(article0);
        articleList.add(article1);
        articleList.add(article2);
        articleList.add(article3);
        articleList.add(article4);
        articleList.add(article5);
        articleList.add(article6);
        articleList.add(article7);
        articleList.add(article8);
        articleList.add(article9);
        articleList.add(article10);
        articleList.add(article11);
        articleList.add(article12);
        articleList.add(article13);
        articleList.add(article14);
        articleList.add(article15);
        articleList.add(article16);
        articleList.add(article17);
        articleList.add(article18);
        articleList.add(article19);
        articleList.add(article20);
        articleList.add(article21);

        if(limit <= 0) {
            limit = 10;
        }

        int total = articleList.size();
        int pages = (total + limit - 1) / limit;

        if(page <= 0) {
            page = 1;
        }
        if(page > pages) {
            System.out.println("page is :" + page + ", pages is :" + pages + ", the page > pages");
            return JSON.toJSONString(new ArrayList<>());
        };

        int start = (page - 1) * limit;
        int end   = page * limit > total ? total : page * limit;
        System.out.println("total is :" + total + ", pages is :" + pages + ", page is :" + page + ", limit is :" + limit);

        List<Article> articles = articleList.subList(start, end);

        return JSON.toJSONString(articles);
    }
}
