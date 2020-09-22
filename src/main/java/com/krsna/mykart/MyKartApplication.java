package com.krsna.mykart;

import org.slf4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MyKartApplication {
	
	Logger logger = org.slf4j.LoggerFactory.getLogger(MyKartApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(MyKartApplication.class, args);
	}

}
