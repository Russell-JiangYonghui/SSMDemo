package com.ssm;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@MapperScan("com.ssm.dao")

@EnableCaching
public class SsmApplication {

	public static void main(String[] args) {

		SpringApplication.run(SsmApplication.class, args);
	}
}
