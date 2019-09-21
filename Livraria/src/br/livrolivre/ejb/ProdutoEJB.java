package br.livrolivre.ejb;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import javax.ejb.Stateful;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.primefaces.model.UploadedFile;
import org.primefaces.shaded.commons.io.FilenameUtils;
import org.primefaces.shaded.commons.io.IOUtils;

import br.livrolivre.model.ProdutoModel;

@Stateful
public class ProdutoEJB {

	@PersistenceContext
	private EntityManager bd;

	public void insert(ProdutoModel obj) {
		// TODO Auto-generated method stub
		bd.persist(obj);
	}

	@Transactional
	public void update(ProdutoModel obj) {
		// TODO Auto-generated method stub

	}

	@Transactional
	public void delete(ProdutoModel obj) {
		// TODO Auto-generated method stub

	}
}
