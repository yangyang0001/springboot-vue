package com.deepblue.controller.entity;

import lombok.*;

/**
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
public class Article {

    // 文章ID
    private String art_id;

    // 文章标题
    private String title;

    // 作者ID
    private String aut_id;

    // 评论数量
    private Long comm_count;

    // 发布时间
    private String pub_date;

    // 作者名字
    private String aut_name;

    // 是否置顶
    private Integer is_top;

    // 文章封面
    private Cover cover;

}
