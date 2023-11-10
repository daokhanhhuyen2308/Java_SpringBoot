package com.codevui.component.core;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Component
public class Girl {
    public IOutfit outfit;
    String name;

    public Girl(@Qualifier("bikini") IOutfit outfit) {
        System.out.println("Contructor: ");
        this.outfit = outfit;
    }
    
    // @Autowired
    // public void setOutfit(IOutfit outfit) {
    //     System.out.println("Setter: ");
    //     this.outfit = outfit;
    // }
    
    @PostConstruct
    public void postContructFunction(){
        System.out.println("Bean vua duoc tao xong");
    }

    //thằng này sẽ bị xóa trước khi mà Bean bị xóa khỏi Applicantion Context
    @PreDestroy
    public void preDestroyFuntion(){
        System.out.println("Truoc khi bi xoa khoi ApplicationContext");
    }

}
