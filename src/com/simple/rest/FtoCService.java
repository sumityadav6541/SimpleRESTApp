package com.simple.rest;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.json.JSONException;
import org.json.JSONObject;

@Path("/ftocservice")
public class FtoCService {
 
	  @GET
	  @Produces("application/json")
	  public Response convertFtoC() throws JSONException {
 
		JSONObject jsonObject = new JSONObject();
		Double fahrenheit = 98.24;
		Double celsius;
		celsius = (fahrenheit - 32)*5/9; 
		jsonObject.put("Method Type", "GET");
		jsonObject.put("F Value", fahrenheit); 
		jsonObject.put("C Value", celsius);
 
		//String result = "@Produces(\"application/json\") Output: \n\nF to C Converter Output: \n\n" + jsonObject;
		String result = jsonObject.toString();
		return Response.status(200).entity(result).build();
	  }
 
	  @Path("{f}")
	  @GET
	  @Produces("application/json")
	  public Response convertFtoCfromInput(@PathParam("f") float f) throws JSONException {
 
		JSONObject jsonObject = new JSONObject();
		float celsius;
		celsius =  (f - 32)*5/9; 
		jsonObject.put("Method Type", "GET");
		jsonObject.put("F Value", f); 
		jsonObject.put("C Value", celsius);
 
		//String result = "@Produces(\"application/json\") Output: \n\nF to C Converter Output: \n\n" + jsonObject;
		return Response.status(200).entity(jsonObject.toString()).build();
	  }
	  
	  @POST
	  @Path("/post")
	  @Produces(MediaType.APPLICATION_JSON)
	  public Response convertFtoCPOST(){
		  JSONObject jsonObject = new JSONObject();
			Double fahrenheit = 98.24;
			Double celsius;
			celsius = (fahrenheit - 32)*5/9; 
			jsonObject.put("Method Type", "POST");
			jsonObject.put("F Value", fahrenheit); 
			jsonObject.put("C Value", celsius);
	 
			//String result = "@Produces(\"application/json\") Output: \n\nF to C Converter Output: \n\n" + jsonObject;
			String result = jsonObject.toString();
			return Response.status(200).entity(result).build();
	  }
	  
	  @Path("/post/{f}")
	  @POST
	  @Produces(MediaType.APPLICATION_JSON)
	  public Response convertFtoCfromInputPOST(@PathParam("f") float f) throws JSONException {
 
		JSONObject jsonObject = new JSONObject();
		float celsius;
		celsius =  (f - 32)*5/9; 
		jsonObject.put("Method Type", "POST");
		jsonObject.put("F Value", f); 
		jsonObject.put("C Value", celsius);
		
		//String result = "@Produces(\"application/json\") Output: \n\nF to C Converter Output: \n\n" + jsonObject;
		return Response.status(200).entity(jsonObject.toString()).build();
	  }
	  
	  @PUT
	  @Produces("application/json")// this is a PUT method example
	  public Response convertFtoCPUT() throws JSONException {
 
		JSONObject jsonObject = new JSONObject();
		Double fahrenheit = 98.24;
		Double celsius;
		celsius = (fahrenheit - 32)*5/9; 
		jsonObject.put("Method Type", "PUT");
		jsonObject.put("F Value", fahrenheit); 
		jsonObject.put("C Value", celsius);
 
		//String result = "@Produces(\"application/json\") Output: \n\nF to C Converter Output: \n\n" + jsonObject;
		String result = jsonObject.toString();
		return Response.status(200).entity(result).build();
	  }
}
