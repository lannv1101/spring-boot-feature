package io.spring.training.boot.jdbcboot;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.core.JdbcTemplate;

@SpringBootApplication
public class SpringBootFeatureApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootFeatureApplication.class, args);
    }


    @Bean
    CommandLineRunner commandLineRunner(JdbcTemplate jdbcTemplate) {
        String QUERY = "SELECT count(*) FROM T_ACCOUNT";

        // Use Lambda expression to display the result
        return args -> System.out.println("Hello, There are "
                + jdbcTemplate.queryForObject(QUERY, Integer.class)
                + " accounts in the database");
    }
}
