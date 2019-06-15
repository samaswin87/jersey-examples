package com.authendicate.controller;

import javax.ws.rs.FormParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import com.authendicate.service.UserService;
import com.authendicate.service.UserService.User;

@Path("signin")
public class Login {

	@POST
    @Produces(MediaType.APPLICATION_JSON)
    public Response login(@FormParam("username") String username, @FormParam("password") String password){
		UserService service = new UserService();
		Status status = Status.BAD_REQUEST;
		String message = "Failed to login";
		if (username != null) {
			User user = service.findByName(username);
			if (user != null && password.equals(user.getPassword())) {
				status = Status.OK;
				message = "Login Success";
			}	
		}
			
		return Response.status(status).entity(message).build();
    }

}
