package com.popeye.test;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@Slf4j
@SpringBootApplication
public class TestApplication {

	public static void main(String[] args) {
		log.info("### Popeye Application Start args : {} ###", args);
		SpringApplication.run(TestApplication.class, args);
	}

}
