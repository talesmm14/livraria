package br.livrolivre.controller;

import java.util.ArrayList;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

import br.livrolivre.model.ProdutoModel;

@RequestScoped
@Named
public class VitrineController {
	
	private ProdutoModel produto;
	
	private List<ProdutoModel> listaProduto;
	
	public List<ProdutoModel> getListaProduto() {
		if (listaProduto == null) {
			listaProduto = new ArrayList<>();
		}
		
		listaProduto.add(getProduto());
		listaProduto.add(getProduto());
		listaProduto.add(getProduto());
		
		return listaProduto;
	}
	
	public void setListaProduto(List<ProdutoModel> listaProduto) {
		this.listaProduto = listaProduto;
	}
	
	public ProdutoModel getProduto() {
		if (produto == null) {
			produto = new ProdutoModel();
		}
		produto.setNome("images/produto/image.png");
		produto.setValor(10.00);
		
		return produto;
	}
	
	public void setProduto(ProdutoModel produto) {
		this.produto = produto;
	}
}
