package br.livrolivre.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

/**
 * Entity implementation class for Entity: ProdutoModel
 *
 */
@Entity
@Table(name = "produto_model")

public class ProdutoModel implements Serializable {

	   
	@Id
	@GeneratedValue
	private Integer id;
	
	@NotEmpty
	@Size(min = 1, max = 100)
	private String nome;
	
	@NotEmpty
	private Double valor;
	private static final long serialVersionUID = 1L;

	public ProdutoModel() {
		super();
	}   
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}   
	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}   
	public Double getValor() {
		return this.valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}
   
}
