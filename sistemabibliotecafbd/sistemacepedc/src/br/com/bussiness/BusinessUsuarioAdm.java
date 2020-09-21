package br.com.bussiness;

import java.util.ArrayList;

import br.com.dao.DaoUsuarioAdm;
import br.com.exception.BusinessException;
import br.com.exception.DaoException;
import br.com.model.UsuarioAdm;

public class BusinessUsuarioAdm implements IBusinessUsuarioAdm {
	
	private DaoUsuarioAdm daoUsuarioAdm;
	
	
	public BusinessUsuarioAdm() {
		this.daoUsuarioAdm = new DaoUsuarioAdm();
	}

	@Override
	public UsuarioAdm cadastrar(UsuarioAdm usuarioAdm) throws BusinessException {
		try {
			usuarioAdm = daoUsuarioAdm.cadastrar(usuarioAdm);
		} catch (DaoException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new BusinessException(e.getMessage());	
		}
		return usuarioAdm;
	}

	@Override
	public ArrayList<UsuarioAdm> getAll() {
		
		return null;
	}

}
