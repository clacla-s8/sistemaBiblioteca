package br.com.bussiness;

import java.util.ArrayList;

import br.com.exception.BusinessException;
import br.com.exception.DaoException;
import br.com.model.UsuarioComum;


public interface IBusinessUsuarioComum {
	public UsuarioComum cadastrar(UsuarioComum usuarioComum) throws BusinessException;
	public UsuarioComum getPorCpf(String cpf)  throws BusinessException;
	public boolean isCpf(String cpf)  throws BusinessException;
	public ArrayList<UsuarioComum> getAll();
}
