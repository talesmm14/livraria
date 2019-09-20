package br.livrolivre.model;

import java.io.Serializable;
import java.lang.String;
import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

/**
 * Entity implementation class for Entity: ClienteModel
 *
 */
@Entity
@Table(name="cliente_model")

public class ClienteModel implements Serializable {

	   
	@Id
	@GeneratedValue
	private Integer id;
	
	@NotEmpty
	@Size(min = 2, max = 60)
	private String nome;
	
	@Size(min = 2, max = 60)
	private String email;
	
	private static final long serialVersionUID = 1L;

	public ClienteModel() {
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
	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
   
}
