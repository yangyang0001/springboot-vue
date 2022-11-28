package com.deepblue.controller.entity;

import lombok.*;

import java.util.List;

/**
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
public class Cover {

    // type 表示有几张封面, 0: 表示0张封面; 1: 表示1张封面; ... 3: 表示3张封面;
    private Integer type;

    private List<String> images;
}
