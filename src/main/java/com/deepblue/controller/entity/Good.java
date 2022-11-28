package com.deepblue.controller.entity;

import lombok.*;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
public class Good {

    private Long id;

    private String goods_name;

    private String goods_img;

    private Long goods_price;

    private Long goods_count;

    private boolean goods_state;

}
