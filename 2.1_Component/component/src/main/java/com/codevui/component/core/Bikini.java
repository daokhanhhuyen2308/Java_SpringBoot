package com.codevui.component.core;

import org.springframework.stereotype.Component;

@Component("bikini")
//Component dùng để đánh dấu đây là 1 dependency và được đưa vào ApplicationContext cho Spring quản lý
public class Bikini implements IOutfit{
    public void wear(){
        System.out.println("Dang mac Bikini");
    }
}
