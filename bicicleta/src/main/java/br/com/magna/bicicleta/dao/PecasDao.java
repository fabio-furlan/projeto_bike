package br.com.magna.bicicleta.dao;

import javax.persistence.EntityManager;

import br.com.magna.bibicleta.util.JPAUtil;
import br.com.magna.modelo.Pecas;



public class PecasDao {

	private EntityManager em;

	
	
	public void cadastrar (Pecas pecas) {
		
		em = JPAUtil.getEntityManager();
		em.getTransaction().begin();
		em.persist(pecas);
		em.getTransaction().commit();
		em.close();
	}
}




