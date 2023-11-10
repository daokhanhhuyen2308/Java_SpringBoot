package com.codevui.com;

import org.springframework.stereotype.Component;

@Component
public class Bikini implements IOutfit{
    @Override
    public void wear() {
        System.out.println("Dang mac bikini");
    }
    
}
