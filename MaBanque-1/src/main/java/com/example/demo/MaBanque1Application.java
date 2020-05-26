package com.example.demo;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

import com.example.dao.ClientRepository;

@SpringBootApplication
@ComponentScan({"com.example.demo","com.example.dao"})

public class MaBanque1Application implements CommandLineRunner {

	@Autowired
	
	private  ClientRepository clientRepository;
	@Bean
	public static void main(String[] args) {
	 SpringApplication.run(MaBanque1Application.class, args);
			
	}

	@Override
	public void run(String... arg0) throws Exception {
	Client c1 =	clientRepository.save(new Client("abderrahmane","abdo.abdo@gmail.com"));
	Client c2 =	clientRepository.save(new Client("Rguibi","Rguibi.abdo@gmail.com"));

	}

}
