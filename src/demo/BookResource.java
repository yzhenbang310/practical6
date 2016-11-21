package demo;

/**
 * Created by 152595y on 11/14/2016.
 */
import com.google.gson.Gson;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/book")
public class BookResource {
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public String getResource() {
        Gson gson = new Gson();
        return gson.toJson(new Book());
    }
}