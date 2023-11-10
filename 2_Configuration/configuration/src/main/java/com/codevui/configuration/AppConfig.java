package com.codevui.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    
    @Bean
   public SimpleBean creatBean(){
    SimpleBean simpleBean = new SimpleBean("Ngoc Trinh");
    return simpleBean;
    
   }

}
