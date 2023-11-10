package com.codevui.todoapp.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "Todo")//tên bảng trong DB 
//thằng này sẽ mô tả đối tượng todo sẽ chứa những thuộc tính nào
public class Todo {
    //định nghĩa id là khóa chính sử dùng annotation là @Id
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    //muốn mapping với trường id thì đánh dấu là @Column(name = "id")
    @Column(name = "id")
    private int id;
     @Column(name = "title")
    private String title;
    // @Column(name = "completed")
    private boolean completed;
    
}
