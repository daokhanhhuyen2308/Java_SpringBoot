package com.codevui.com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class ComApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(ComApplication.class, args);
		//Bikini bikini = context.getBean(Bikini.class);
		//System.out.println("Bikini"+bikini);
		IOutfit outfit = context.getBean(IOutfit.class);
		System.out.println("Outfit"+outfit);
		Girl girl = context.getBean(Girl.class);
		//Girl girl = new Girl();
		System.out.println("Outfit of girl"+girl.outfit);
		girl.outfit.wear();
	}

}
