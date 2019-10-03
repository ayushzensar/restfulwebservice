package com.zensar.webservice;

import javax.ws.rs.FormParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

@Path("/user")
public class UserProfileService {
	
	@POST
	@Path("/add")
	@Produces("text/html")
	public Response responseAddUser(@FormParam("clientName")String clientName, @FormParam("gender")String gender, @FormParam("age")int age) {
		return Response.status(200).entity("<p>New user record is added </p><br>Name: "+clientName+"<br>Gender: "+gender+"<br>Age: "+age).build();
	}
}
