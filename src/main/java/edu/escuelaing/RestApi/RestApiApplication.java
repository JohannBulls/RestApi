package edu.escuelaing.RestApi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * RestApiApplication is the entry point of the Spring Boot application.
 * This class contains the main method which starts the application.
 */
@SpringBootApplication
public class RestApiApplication {

    /**
     * The main method that serves as the entry point for the Spring Boot application.
     * It initializes the application by invoking SpringApplication.run.
     *
     * @param args Command line arguments passed to the application.
     */
    public static void main(String[] args) {
        SpringApplication.run(RestApiApplication.class, args);
    }
}
