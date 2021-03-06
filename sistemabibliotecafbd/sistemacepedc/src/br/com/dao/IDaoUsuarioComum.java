package br.com.dao;

import java.util.ArrayList;

import br.com.exception.DaoException;
import br.com.model.UsuarioComum;


public interface IDaoUsuarioComum {
	public UsuarioComum cadastrar(UsuarioComum usuarioComum) throws DaoException;
	public UsuarioComum getPorCpf(String cpf) throws DaoException;
	public boolean isCpf(String cpf) throws DaoException;
	public ArrayList<UsuarioComum> getAll();
}
