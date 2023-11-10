package com.codevui.component.core;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Component
public class Girl {

    public IOutfit outfit;


    public Girl(@Qualifier("bikini") IOutfit outfit) {
        System.out.println("Constructor");
        this.outfit = outfit;
    }
    @PostConstruct
    public void postContructFunction(){
        System.out.println("Bean vua duoc tao xong");
    }

    //thằng này sẽ được chạy trước khi Bean bị xóa khỏi ApplicationContext
    @PreDestroy
    public void preDestroyFunction(){
        System.out.println("Truoc khi Bean bi xoa");
   }

}
