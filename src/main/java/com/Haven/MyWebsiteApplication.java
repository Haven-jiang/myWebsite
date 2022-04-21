package com.Haven;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.Haven.mapper")
public class MyWebsiteApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyWebsiteApplication.class, args);
	}

}
