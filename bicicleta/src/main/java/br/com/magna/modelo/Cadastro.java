package br.com.magna.modelo;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "cadastro")
public class Cadastro {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_cadastro;
	private String fabricante;
	private BigDecimal valor;

	@ManyToOne
	
	private Pecas pecas;
	public Cadastro() {

	}

	

	public Cadastro(String fabricante, BigDecimal valor) {

		this.fabricante = fabricante;
		this.valor = valor;
		
		
	}

	public Pecas getPecas() {
		return pecas;
	}



	public void setPecas(Pecas pecas) {
		this.pecas = pecas;
	}



	public Cadastro(Pecas pecas) {

		this.pecas = pecas;
	}

	public Long getId() {
		return id_cadastro;
	}

	public void setId(Long id) {
		this.id_cadastro = id;
	}

	
	public String getFabricante() {
		return fabricante;
	}

	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}

	public BigDecimal getValor() {
		return valor;
	}

	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}

}
