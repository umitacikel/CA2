/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Rest;

import com.google.gson.Gson;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Produces;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.core.MediaType;
import facade.FacadePersonCA;
import javax.persistence.Persistence;


@Path("person")
public class GenericResource {

    @Context
    private UriInfo context;

    FacadePersonCA fp;
    
    public GenericResource() {
       fp = new FacadePersonCA( Persistence.createEntityManagerFactory( "caunit" ) );
    }

 
    @GET
    @Produces(MediaType.APPLICATION_XML)
    @Path("getAll")
    public String getPersons() {
        return new Gson().toJson(fp.getPersons());
    }

  
    @PUT
    @Consumes(MediaType.APPLICATION_XML)
    public void putXml(String content) {
    }
}
