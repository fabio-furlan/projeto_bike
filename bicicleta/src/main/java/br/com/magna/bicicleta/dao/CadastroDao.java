package br.com.magna.bicicleta.dao;

import javax.persistence.EntityManager;

import br.com.magna.bibicleta.util.JPAUtil;
import br.com.magna.modelo.Cadastro;

public class CadastroDao {
	
	private EntityManager em;

	
	
	
	public void cadastrar (Cadastro c1) {
		em = JPAUtil.getEntityManager();
		em.getTransaction().begin();
		em.persist(c1);
		em.getTransaction().commit();
		em.close();
	}
}
