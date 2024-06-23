package com.ika.SpringJDBC;

import com.ika.SpringJDBC.model.Alien;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringJdbcApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringJdbcApplication.class, args);
		Alien alien1 = context.getBean(Alien.class);
		alien1.setId(111);
		alien1.setName("Ishita");
		alien1.setTech("Java");
	}

}
