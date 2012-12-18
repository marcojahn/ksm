package com.jahn.testproject.rest;

import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.jahn.testproject.ejb.WerkzeugEjb;
import com.jahn.testproject.entities.Werkzeug;

@Path("/werkzeug")
public class WerkzeugServiceImpl implements WerkzeugService {
	@Inject
	private WerkzeugEjb werkzeugEjb;

	@Override
	@Produces(MediaType.APPLICATION_JSON)
	@GET
	public List<Werkzeug> list() {
		return this.werkzeugEjb.list();
	}

	@Override
	@POST
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Werkzeug add(Werkzeug toAdd) {
		return this.werkzeugEjb.add(toAdd);
	}
}
