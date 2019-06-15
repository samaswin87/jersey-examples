package com.jersey.application.auth;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("auth")
public class Login {
	
	@GET
	@Path("signin")
    @Produces(MediaType.APPLICATION_JSON)
    public String login(){
        return "Login Success";
    }
	
	@POST
	@Path("signout")
	@Consumes(MediaType.APPLICATION_JSON)
    public String signout(String username){
		System.out.println(username);
        return "Logout Success";
    }

}
