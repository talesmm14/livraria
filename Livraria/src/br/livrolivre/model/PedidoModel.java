package br.livrolivre.model;

import java.io.Serializable;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;

/**
 * Entity implementation class for Entity: PedidoModel
 *
 */
@Entity
@Table(name="pedido_model")

public class PedidoModel implements Serializable {

	   
	@Id
	@GeneratedValue
	private Integer id;
	
	@NotEmpty
	private Double valorTotal;
	
	@NotEmpty
	private Date data;
	
	@OneToOne
	private PagamentoModel pagamento;
	
	@OneToOne
	private ClienteModel cliente;
	
	@OneToMany
	private List<ProdutoModel> produto;
	
	private static final long serialVersionUID = 1L;

	public PedidoModel() {
		super();
	}   
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}   
	public Double getValorTotal() {
		return this.valorTotal;
	}

	public void setValorTotal(Double valorTotal) {
		this.valorTotal = valorTotal;
	}   
	public Date getData() {
		return this.data;
	}

	public void setData(Date data) {
		this.data = data;
	}
	
	public PagamentoModel getPagamento() {
		if (pagamento == null) {
			pagamento = new PagamentoModel();
		}
		return pagamento;
	}
	
	public void setPagamento(PagamentoModel pagamento) {
		this.pagamento = pagamento;
	}
	
	public ClienteModel getCliente() {
		if (cliente == null) {
			cliente = new ClienteModel();
		}
		return cliente;
	}
	
	public void setCliente(ClienteModel cliente) {
		this.cliente = cliente;
	}
	
	public List<ProdutoModel> getProduto() {
		if (produto == null) {
			produto = new ArrayList<>();
		}
		return produto;
	}
	
	public void setProduto(List<ProdutoModel> produto) {
		this.produto = produto;
	}
}
