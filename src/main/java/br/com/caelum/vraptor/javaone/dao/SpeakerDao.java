package br.com.caelum.vraptor.javaone.dao;

import br.com.caelum.vraptor.javaone.model.Speaker;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import java.util.List;

@RequestScoped
public class SpeakerDao {

	@Inject
	private EntityManager em;

	public void save(Speaker speaker) {
		em.persist(speaker);
	}

	public List<Speaker> list() {
		return em.createQuery("select s from Speaker s").getResultList();
	}
}
