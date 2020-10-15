package com.example.rest;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("employees")
public class EmployeeResource {
	
	public EmployeeResource() {
		System.out.println("Constructing EmployeeResource");
	}

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Employee> getAllEmployees() {
		List<Employee> emps = new ArrayList<>();
		
		Employee e1 = new Employee();
		e1.setId(100);
		e1.setFirstName("bruce");
		e1.setLastName("lee");
		emps.add(e1);
		
		return emps;
	}
	
}
