package com.example.rest;

import javax.ws.rs.ApplicationPath;

import org.glassfish.jersey.server.ResourceConfig;


@ApplicationPath("/test")
public class MyResourceConfig extends ResourceConfig {

	public MyResourceConfig() {
		register(EmployeeResource.class); 	// JAX-RS creates objects of those resources per request.
		register(new EmployeeResource()); 	// JAX-RS creates only one singleton object of the class throughout.
	}

}
