package ${package}.application.greet;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import javax.json.Json;
import javax.json.JsonObject;
import javax.ws.rs.core.Response;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GreetResourceTest {

    private GreetResource resource;

    @BeforeEach
    public void setUp() {
        this.resource = new GreetResource();
    }

    @Test
    public void getGreet() {

        JsonObject expectedResponse = Json.createObjectBuilder()
            .add("greeting", "hello").build();

        Response response = this.resource.getGreet();

        assertEquals(response.getStatus(), Response.Status.OK.getStatusCode());
        assertEquals(expectedResponse, response.getEntity());
    }
}
