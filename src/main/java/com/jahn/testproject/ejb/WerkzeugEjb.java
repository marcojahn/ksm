package com.jahn.testproject.ejb;

import java.util.List;

import com.jahn.testproject.entities.Werkzeug;

public interface WerkzeugEjb {

	public abstract List<Werkzeug> list();

	public abstract Werkzeug add(Werkzeug toAdd);

}