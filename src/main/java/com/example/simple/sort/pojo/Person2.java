package com.example.simple.sort.pojo;

import lombok.Data;


@Data
public class Person2 {
    private String name;
    private int age;
    private Long num;

    public String getName() {
        return "我就是我";
    }
}
