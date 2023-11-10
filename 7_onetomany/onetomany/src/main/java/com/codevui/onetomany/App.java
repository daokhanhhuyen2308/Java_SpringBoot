package com.codevui.onetomany;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class App {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(App.class, args);
		PersonRepository personRepository = context.getBean(PersonRepository.class);
		AddressRepository addressRepository = context.getBean(AddressRepository.class);
		//repository.findByFirstNameContainingAndLastNameContaining("1","2").forEach(System.out::println);
		//repository.findByFirstNameOrLastNameContaining("%1%").forEach(System.out::println);
		
		List<Person> listPersons = new ArrayList<>();

		Person p1 = Person.builder().firstName("Dao").lastName("Huyen").
		emailAddress("daokhanhhuyen2308@gmail.com").age(20).
		build();
		Person p2 = Person.builder().firstName("Quynh").lastName("Huong").
		emailAddress("quynhhuong2001@gmail.com").age(30).
		build();
		Person p3 = Person.builder().firstName("Mai").lastName("Mai").
		emailAddress("maimai0810@gmail.com").age(30).
		build();
		Address address = Address.builder().address("Ha Noi").build();
		p1.setAddress(address);
		p2.setAddress(address);
		p3.setAddress(address);
		listPersons.add(p1);
		listPersons.add(p2);
		listPersons.add(p3);

		address.setPersons(listPersons);
		
		addressRepository.save(address);
		// personRepository.save(p1);
		// personRepository.save(p2);
		// personRepository.save(p3);

		//lấy ra tất cả các cái address select * from address

		// List<Person> lisPersons = personRepository.findAll();
		// for (Person a : lisPersons) {
		// 	System.out.println(a.getAddress());
		// }

		//mỗi 1 address nó lấy thêm được 1 listPersons kèm theo 

		//Spring JPA nó tự động gen cũng tự động lấy những cái bản ghi tương ứng
		//có address_id = với address_id của Address
		List<Address> listAddresses = addressRepository.findAll();
		for (Address address2 : listAddresses) {
			System.out.println(address2.getAddress());
			System.out.println(address2.getPersons());
		}
		
		//addressRepository.deleteById(3);
		
		// for(int i = 1; i <= 100; i++){
		// 	Person person = Person.builder().firstName("firstName"+i).
		// 	lastName("lastName"+i).
		// 	emailAddress("emailAddress"+i).
		// 	age(i).
		// 	address_id(i).
		// 	build();
		// 	repository.save(person);
		// }
	}

}
