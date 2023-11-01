package com.example.store.entity;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDateTime;

@Getter
@Setter
@ToString
@Builder
public class User {
    private Integer id;
    private String userName;
    private String password;
    private String email;
    private LocalDateTime created;
    private LocalDateTime updated;
}
