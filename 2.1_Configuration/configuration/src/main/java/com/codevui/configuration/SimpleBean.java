package com.codevui.configuration;

public class SimpleBean {
    String name;

    public SimpleBean(String name){
        this.name = name;
    }
    public void showSimpleBean(){
        System.out.println("[Simple Bean]: "+this.name);
    }
    

}
