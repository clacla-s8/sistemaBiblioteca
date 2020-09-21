package br.com.bussiness;

import java.util.ArrayList;

import br.com.exception.BusinessException;
import br.com.model.Livro;

public interface IBusinessLivro {
	public Livro cadastrar( Livro livro) throws BusinessException;
	public ArrayList<Livro> getAll();

}
