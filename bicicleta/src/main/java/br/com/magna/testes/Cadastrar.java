package br.com.magna.testes;

import java.math.BigDecimal;

import javax.persistence.EntityManager;

import br.com.magna.bibicleta.util.JPAUtil;
import br.com.magna.bicicleta.dao.CadastroDao;
import br.com.magna.bicicleta.dao.PecasDao;
import br.com.magna.modelo.Cadastro;
import br.com.magna.modelo.Pecas;



public class Cadastrar {
	
	public static void main(String[] args) {
		
		
		CadastroDao cadastroDao = new CadastroDao();
		PecasDao pecasDao = new PecasDao();
		
		Pecas p1 = new Pecas();
		p1.setNome("Guidao");
		pecasDao.cadastrar(p1);
		Cadastro c1 = new Cadastro("Caloi",new BigDecimal("8888"));
		c1.setPecas(p1);
		
		cadastroDao.cadastrar(c1);
		
	}
	

}
