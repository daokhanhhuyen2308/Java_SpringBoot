package com.codevui.todoapp;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
@Getter
@Setter
@Builder
@ToString
public class User {
    private int id;
    private String name;
    private int age;
    private double salary;

}
