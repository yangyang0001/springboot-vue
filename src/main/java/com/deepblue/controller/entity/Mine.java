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
public class Mine {

    private Long id;

    private String username;

    private String password;
}
