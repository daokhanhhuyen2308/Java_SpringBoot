package com.codevui.onetoone;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
import lombok.ToString;

@ToString
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int age;
    private String emailAddress;
    private String firstName;
    private String lastName;
    @OneToOne // quan hệ 1-1 mỗi 1 person chỉ có 1 address
    //tạo ra khóa ngoại address_id nằm trong bảng Person link đến khóa chính của address trong bảng Address
    @JoinColumn(name="address_id")
    private Address address;
    
}
