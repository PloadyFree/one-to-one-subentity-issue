package com.example.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Bean
    public CommandLineRunner test(MainEntityRepository repo) {
	    return args -> {
            MainEntity main = new MainEntity();
            main.setSubEntity(new SubEntity());
            repo.save(main);

            repo.findAll().forEach(System.out::println);
        };
    }
}
