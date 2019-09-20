package br.livrolivre.model;

import java.io.Serializable;
import java.lang.String;
import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

/**
 * Entity implementation class for Entity: TipoPagamentoModel
 *
 */
@Entity
@Table(name="tipo_pagamento_model")

public class TipoPagamentoModel implements Serializable {

	   
	@Id
	@GeneratedValue
	private Integer id;
	
	@NotEmpty
	@Size(max = 8)
	private String descricao;
	private static final long serialVersionUID = 1L;

	public TipoPagamentoModel() {
		super();
	}   
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}   
	public String getDescricao() {
		return this.descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
   
}
