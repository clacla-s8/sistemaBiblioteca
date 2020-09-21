package br.com.bussiness;

import java.util.ArrayList;

import br.com.exception.BusinessException;
import br.com.model.UsuarioAdm;


public interface IBusinessUsuarioAdm {
	public UsuarioAdm cadastrar(UsuarioAdm usuarioAdm) throws BusinessException;
	public ArrayList<UsuarioAdm> getAll();
}
