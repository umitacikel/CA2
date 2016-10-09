/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Rest;

import Entity.HobbyCA;
import Entity.PersonCA;
import com.google.gson.Gson;
import facade.FacadeHobbyCA;
import facade.FacadePersonCA;
import java.util.ArrayList;
import javax.persistence.Persistence;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Produces;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.MediaType;



@Path("person")
public class GenericResource_1 {

    @Context
    private UriInfo context;

      FacadePersonCA fp;
      FacadeHobbyCA hc;
    
    
    public GenericResource_1() {
        fp = new FacadePersonCA( Persistence.createEntityManagerFactory( "caunit" ) );
        hc = new FacadeHobbyCA(Persistence.createEntityManagerFactory("caunit"));
    }

  
 
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("complete")
    public String getJson() {        
       return new Gson().toJson(fp.getPersons());
    }
    
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("{id}")
    public String getJsonById(@PathParam("id") int id) {        
       PersonCA p = fp.getPerson(id);
       return new Gson().toJson(p);
    }

    
    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    public void putJson(String content) {
        
    }
}
