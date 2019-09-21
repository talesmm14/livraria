package br.livrolivre.controller;

import java.io.IOException;

import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;
import javax.transaction.Transactional;

import org.primefaces.model.UploadedFile;

import br.livrolivre.ejb.ProdutoEJB;
import br.livrolivre.model.ProdutoModel;

@RequestScoped
@Named
public class CadastrarProdutoController {

	@EJB
	private ProdutoEJB produtoEJB;
	
	private ProdutoModel produto = new ProdutoModel();
	
	private UploadedFile file;

	
	@Transactional
	public void cadastrarLivro() throws IOException {
		getProduto().setCaminho(getProduto().getNome());
		produtoEJB.insert(getProduto());
	}

	public UploadedFile getFile() {
		return file;
	}
	
	public void setFile(UploadedFile file) {
		this.file = file;
	}
	
	public ProdutoModel getProduto() {
		return produto;
	}

	public void setProduto(ProdutoModel produto) {
		this.produto = produto;
	}

}
