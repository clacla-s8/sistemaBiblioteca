package br.com.dao;

import java.util.ArrayList;

import br.com.exception.DaoException;
import br.com.model.UsuarioAdm;


public interface IDaoUsuarioAdm {
	
	public UsuarioAdm cadastrar(UsuarioAdm usuarioAdm) throws DaoException;
	public ArrayList<UsuarioAdm> getAll();
}
