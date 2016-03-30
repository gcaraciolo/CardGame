package br.unicap.cardgame.ws;

import br.unicap.cardgame.engine.BattleField;
import br.unicap.cardgame.model.Char;
import br.unicap.cardgame.model.Player;
import javax.inject.Inject;
import javax.validation.constraints.NotNull;
import javax.ws.rs.FormParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/leave")
public class LeaveGameWS {
    
    @Inject
    private BattleField battleField;    
    
    @POST    
    @Produces(MediaType.APPLICATION_JSON)    
    public Response leave(@FormParam("username") @NotNull String username) {        
        Player player = new Player(username);
        battleField.removePlayer(player);
        return Response.status(200).entity(username + " did leave with sucessfull").build();
    }   
    
}