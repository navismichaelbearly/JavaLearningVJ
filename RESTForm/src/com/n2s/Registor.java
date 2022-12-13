package com.n2s;

import javax.ws.rs.FormParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

@Path("/registor")
public class Registor {
	
	@POST
	@Path("/add")
	public Response addUser(@FormParam("fname") String fname, @FormParam("lname") String lname, @FormParam("age")int age) {
		System.out.println(fname + " " + lname + " " + age);
		return Response.status(200).entity("Registered Successfully").build();
	}
	
	
}
