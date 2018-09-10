package com.leandrovilares.magnetto;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.JdbcTemplate;




@SpringBootApplication(scanBasePackages={"com.leandrovilares.magnetto"})// same as @Configuration @EnableAutoConfiguration @ComponentScan combined
public class SpringBootRestApiApp implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootRestApiApp.class, args);

	}


	@Autowired
	JdbcTemplate jdbcTemplate;
	@Override
	public void run(String... strings) throws Exception {
		System.out.println("Creating tables");

		jdbcTemplate.execute("DROP TABLE DNA IF EXISTS");
		jdbcTemplate.execute("CREATE TABLE DNA(id INT PRIMARY KEY,dna VARCHAR(255))");
		jdbcTemplate.execute("TRUNCATE TABLE DNA");



		// Split up the array of whole names into an array of first/last names





	}


}
