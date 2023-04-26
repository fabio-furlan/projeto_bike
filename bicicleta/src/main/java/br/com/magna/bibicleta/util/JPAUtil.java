package br.com.magna.bibicleta.util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JPAUtil {
	
	private static final EntityManagerFactory FACTORY = Persistence.createEntityManagerFactory("bicicleta");
	
	public static EntityManager getEntityManager () {
		return FACTORY.createEntityManager();
	}
}
