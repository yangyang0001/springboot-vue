package com.deepblue.controller.entity;

import lombok.*;

/**
 * books: [
 *     {
 *         id: 1,
 *         name : '《 Vue.js 实战》',
 *         author : '梁澈'
 *     },
 *     {
 *         id: 2,
 *         name : '《 JavaScript 语言精粹》',
 *         author : 'Douglas Crockford'
 *     },
 *     {
 *         id: 3,
 *         name : '《 JavaScript 高级程序设计》',
 *         author : 'Nicholas C. Zakas'
 *     },
 * ],
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
public class Book {

    private Long id;

    private String name;

    private String author;
}
