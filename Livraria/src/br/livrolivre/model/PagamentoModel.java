package br.livrolivre.model;

import java.io.Serializable;
import java.sql.Date;
import javax.persistence.*;
import javax.validation.constraints.NotEmpty;

import org.hibernate.validator.constraints.SafeHtml.Attribute;

/**
 * Entity implementation class for Entity: PagamentoModel
 *
 */
@Entity
@Table(name = "pagamento_model")

public class PagamentoModel implements Serializable {

	@Id
	@GeneratedValue
	private Integer id;

	@NotEmpty
	private Date data;

	@NotEmpty
	@OneToOne
	private TipoPagamentoModel tipoPagamento;

	private static final long serialVersionUID = 1L;

	public PagamentoModel() {
		super();
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Date getData() {
		return this.data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public TipoPagamentoModel getTipoPagamento() {
		if (tipoPagamento == null) {
			tipoPagamento = new TipoPagamentoModel();
		}

		return tipoPagamento;
	}

	public void setTipoPagamento(TipoPagamentoModel tipoPagamento) {
		this.tipoPagamento = tipoPagamento;
	}
}
