package br.com.dao;

import java.util.ArrayList;

import br.com.exception.DaoException;
import br.com.model.Livro;

public interface IDaoLivro {
	public Livro cadastrar(Livro livro) throws DaoException;
	public ArrayList<Livro> getAll();

}
