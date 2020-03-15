package ${package}.application.greet;

import javax.enterprise.context.RequestScoped;
import javax.json.Json;
import javax.json.JsonObject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("greet")
@Produces(MediaType.APPLICATION_JSON)
@RequestScoped
public class GreetResource {

    @GET
    public Response getGreet() {

        JsonObject jsonResponse = Json.createObjectBuilder()
            .add("greeting", "hello").build();

        return Response.ok(jsonResponse).build();
    }
}
