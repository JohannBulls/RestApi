package edu.escuelaing.RestApi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * HealthController is a REST controller responsible for handling health check requests.
 * It provides an endpoint to verify that the API is functioning correctly.
 */
@RestController
public class HealthController {

    /**
     * Handles GET requests to the /health endpoint.
     * This method returns a simple HTML message indicating that the API is working as expected.
     *
     * @return A String containing an HTML message: "<h1>The API is working ok!</h1>"
     */
    @GetMapping("/health")
    public String checkAPI() {
        return "<h1>The API is working ok!</h1>";
    }
}
