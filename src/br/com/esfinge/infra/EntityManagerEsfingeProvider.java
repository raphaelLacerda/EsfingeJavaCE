package br.com.esfinge.infra;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import org.esfinge.querybuilder.jpa1.EntityManagerProvider;

public class EntityManagerEsfingeProvider implements EntityManagerProvider {

	private static EntityManagerFactory	emf	= Persistence.createEntityManagerFactory("esfinge");

	@Override
	public EntityManager getEntityManager() {

		return emf.createEntityManager();
	}

	@Override
	public EntityManagerFactory getEntityManagerFactory() {

		return emf;
	}
}
