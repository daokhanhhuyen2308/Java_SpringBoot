package com.codevui.component.core;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.codevui.component.external.Boy;

@SpringBootApplication
@ComponentScan("com.codevui.component.*")
public class App {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(App.class, args);
		//ApplicationContext chính là container, Bean chính là dependency
		//tìm trong container xem có kiểu dependency nào là bikini hay k thì lấy ra
		// IOutfit outfit = context.getBean(IOutfit.class);
		// System.out.println("Outfit: "+outfit);
		
		Girl girl = context.getBean(Girl.class);
		System.out.println("Girl instance: "+girl);

		Boy boy = context.getBean(Boy.class);
		System.out.println("Boy instance: "+boy);

		System.out.println("Outfit of girl: "+girl.outfit);

		girl.outfit.wear();

	}

}
