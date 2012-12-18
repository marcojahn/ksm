package com.jahn.testproject.cdi;

import javax.enterprise.inject.Produces;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

public class EntitiyManagerProducer {
	@Produces
	@PersistenceContext(unitName = "testprojectPu")
	private EntityManager entityManager;
}
