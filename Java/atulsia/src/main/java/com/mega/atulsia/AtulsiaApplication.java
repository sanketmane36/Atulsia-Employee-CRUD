package com.mega.atulsia;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AtulsiaApplication {

	public static void main(String[] args) {
		System.out.println("Start Megastores");
		SpringApplication.run(AtulsiaApplication.class, args);
		System.out.println("End Megastores");
	}

}
