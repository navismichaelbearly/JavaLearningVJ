package com.n2s;


import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/restcore")
public class RESTCore {
	
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String textHello() {
		System.out.println("Running as a text");
		return "Hello";
	}
	
	@GET
	@Produces(MediaType.TEXT_XML)
	public String xmlHello() {
		System.out.println("Running as a XML");
		return "<?xml version=\"1.0\"?>" + "<hello> Hello friend" + "</hello>";
	}
	
	@GET
	@Produces(MediaType.TEXT_HTML)
	public String htmlHello() {
		System.out.println("Running as a HTML");
		return "<html> " + "<title>" + "Hello" + "</title>"
	            + "<body><h1>" + "Hello" + "</body></h1>" + "</html> ";
	}
	

}
