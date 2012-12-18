package com.jahn.testproject.rest;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.jahn.testproject.entities.Werkzeug;

public interface WerkzeugService {

	@Produces(MediaType.APPLICATION_JSON)
	@GET
	public abstract List<Werkzeug> list();

	@POST
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public abstract Werkzeug add(Werkzeug toAdd);

}