package com.ahari.reciperecommendation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

//@SpringBootApplication
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class RecipeRecommendationApplication {

	public static void main(String[] args) {
		SpringApplication.run(RecipeRecommendationApplication.class, args);
	}

}
