package br.com.bussiness;

import java.util.ArrayList;

import br.com.dao.DaoUsuarioComum;
import br.com.exception.BusinessException;
import br.com.exception.DaoException;
import br.com.model.UsuarioComum;

public class BusinessUsuarioComum implements IBusinessUsuarioComum{
	
	private DaoUsuarioComum daoUsuarioComum;
	

	public BusinessUsuarioComum() {
		this.daoUsuarioComum = new DaoUsuarioComum();
	}

	@Override
	public UsuarioComum cadastrar(UsuarioComum usuarioComum) throws BusinessException {
		
		try {
			if(!isCpf(usuarioComum.getCpf())) {
				usuarioComum = daoUsuarioComum.cadastrar(usuarioComum);				
			}
		} catch (DaoException e) {			
			e.printStackTrace();
			throw new BusinessException(e.getMessage());
		}
		
		return usuarioComum;
	}

	@Override
	public ArrayList<UsuarioComum> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UsuarioComum getPorCpf(String cpf) throws BusinessException {
		try {
			return this.daoUsuarioComum.getPorCpf(cpf);
		} catch (DaoException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new BusinessException(e.getMessage());
		}
	}

	@Override
	public boolean isCpf(String cpf) throws BusinessException {
		try {
			return this.daoUsuarioComum.isCpf(cpf);
		} catch (DaoException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new BusinessException(e.getMessage());
		}
	}

}
