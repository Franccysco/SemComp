package br.com.semComp.util;

import java.io.Serializable;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JpaUtil implements Serializable {
	

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static EntityManagerFactory factory;
	
	static {
		factory = Persistence.createEntityManagerFactory("SemComp");

	}

	public EntityManager getEntityManager() {
		return factory.createEntityManager();
	}
}
