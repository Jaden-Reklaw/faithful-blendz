package com.fb.faithfulblendzbe;

import com.fb.faithfulblendzbe.configuration.AppProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties(AppProperties.class)
public class FaithfulblendzBeApplication {

	public static void main(String[] args) {
		SpringApplication.run(FaithfulblendzBeApplication.class, args);
	}

}
