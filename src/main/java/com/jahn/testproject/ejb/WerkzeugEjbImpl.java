package com.jahn.testproject.ejb;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import com.jahn.testproject.entities.Werkzeug;

@Stateless
public class WerkzeugEjbImpl implements WerkzeugEjb {
	@Inject
	private EntityManager entityManager;

	@Override
	public List<Werkzeug> list() {
		TypedQuery<Werkzeug> createQuery = entityManager.createQuery(
				"select w from Werkzeug w", Werkzeug.class);

		return createQuery.getResultList();
	}

	@Override
	public Werkzeug add(Werkzeug toAdd) {
		entityManager.persist(toAdd);
		return toAdd;
	}
}
