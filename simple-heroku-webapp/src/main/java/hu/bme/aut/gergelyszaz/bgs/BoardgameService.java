package hu.bme.aut.gergelyszaz.bgs;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * Root resource (exposed at "boardgameservice" path)
 */
@Path("boardgameservice")
public class BoardgameService {

    /**
     * Method handling HTTP GET requests. The returned object will be sent
     * to the client as "text/plain" media type.
     *
     * @return String that will be returned as a text/plain response.
     */
    @GET
    @Path("join/{game_id}/{client_id}/{client_name}")
    @Produces(MediaType.TEXT_PLAIN)
    public String Join(@PathParam("game_id") int game_id,@PathParam("client_id") int client_id,@PathParam("client_name") String client_name) {
    	
        return "OK";
    }
    
    @GET
    @Path("get/{game_id}/{client_id}")
    @Produces(MediaType.TEXT_PLAIN)
    public String Get(@PathParam("game_id") int game_id,@PathParam("client_id") int client_id) {
    	
        return "OK";
    }
    
    @GET
    @Path("update/{game_id}/{client_id}")
    @Produces(MediaType.TEXT_PLAIN)
    public String Update(@PathParam("game_id") int game_id,@PathParam("todo") int client_id) {
    	
        return "OK";
    }
    @POST
    @Path("action")
    @Produces(MediaType.TEXT_PLAIN)
    @Consumes(MediaType.APPLICATION_JSON)
    public String Action(String action) {
    	
        return "OK";
    }
    
}
