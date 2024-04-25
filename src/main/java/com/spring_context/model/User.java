package com.spring_context.model;

import lombok.*;


@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
@Setter
public class User {

    private Integer id;
    private String name;
}
