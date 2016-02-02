package hu.bme.aut.gergelyszaz.bgs;

import java.util.UUID;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import hu.bme.aut.gergelyszaz.BGS.core.GameManager;

/**
 * Root resource (exposed at "boardgameservice" path)
 */
@Path("boardgameservice")
public class BoardgameService {
	GameManager gm=new GameManager();

	
    /**
     * Method handling HTTP GET requests. The returned object will be sent
     * to the client as "text/plain" media type.
     *
     * @return String that will be returned as a text/plain response.
     */
    @GET
    @Path("join/{game_id}/{client_name}")
    @Produces(MediaType.TEXT_PLAIN)
    public Response Join(@PathParam("game_id") String gameName,@PathParam("client_name") String client_name) {
    	String clientID=UUID.randomUUID().toString();
    	try {
			gm.JoinGame(clientID, gameName);
		} catch (Exception e) {
			System.err.println(e.getMessage());
			return Response.status(Response.Status.NOT_FOUND).entity("Game "+gameName+" not found!").build();
		}
        return Response.ok(clientID,MediaType.TEXT_PLAIN).build();
    }
    
    @GET
    @Path("get/{client_id}")
    @Produces(MediaType.TEXT_PLAIN)
    public String Get(@PathParam("client_id") String client_id) {
    	
        return "OK";
    }
    
    @GET
    @Path("init")
    @Produces(MediaType.TEXT_PLAIN)
    public String Init() {
    	gm.Initialize();
        return "OK";
    }
    
    
    
    @GET
    @Path("statistic")
    @Produces(MediaType.TEXT_PLAIN)
    public String Get() {
    	
        return "Running games: "+gm.runningGames.size()+"\n"+
        		"Connected clients: "+gm.playerConnections.size()+"\n"+
        		"Waiting for players: "+gm.availableGames.size()+"\n"+
        		"Available models: "+gm.mm.AvailableModels().get(0)+" "+gm.mm.AvailableModels().get(1)+"\n"
        		;
    }
    
    @POST
    @Path("action")
    @Produces(MediaType.TEXT_PLAIN)
    @Consumes(MediaType.APPLICATION_JSON)
    public String Action(String action) {
    	
        return "OK";
    }
    
}
