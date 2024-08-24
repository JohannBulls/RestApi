package edu.escuelaing.RestApi;

import edu.escuelaing.RestApi.controller.HealthController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

/**
 * HealthControllerTest is a test class for the HealthController.
 * It verifies the behavior of the /health endpoint using Spring's MockMvc framework.
 */
@WebMvcTest(controllers = HealthController.class)
public class HealthControllerTest {

    @Autowired
    private MockMvc mockMvc;

    /**
     * Test the /health endpoint to ensure it returns the expected HTML response.
     * This test simulates a GET request to the /health endpoint and checks that
     * the response status is 200 OK and the content matches the expected string.
     *
     * @throws Exception If there is an error during the request execution.
     */
    @Test
    public void testCheckAPI() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.get("/health"))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().string("<h1>The API is working ok!</h1>"));
    }
}
