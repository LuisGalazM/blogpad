
package blogpad.templates;

import javax.json.JsonArray;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 *
 * @author airhacks.com
 */
@Path("templates")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public interface TemplatesResourceClient {

    @GET
    public JsonArray all();

    @GET
    @Path("{name}")
    public Response getTemplateByName(@PathParam("name") String name);

    @PUT
    @Path("{fileName}")
    public Response save(@PathParam("fileName") String fileName, String content);

}
