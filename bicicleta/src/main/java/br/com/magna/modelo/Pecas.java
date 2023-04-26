package br.com.magna.modelo;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "pecas")
public class Pecas {
	
	
	public Pecas() {
		
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_pecas;
	@Column(name = "pecas")
	private String nome_pecas;
	
	@OneToMany(mappedBy="pecas")
	private List <Cadastro> cadastro;
	
	public Pecas(String pecas) {
		this.nome_pecas = pecas;
	}
	
	public String getPecas() {
		return nome_pecas;
	}
	
	public void setNome(String pecas) {
		this.nome_pecas = pecas;
	}
	
	
	
}
