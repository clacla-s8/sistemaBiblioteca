package br.com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;

import br.com.exception.DaoException;
import br.com.model.UsuarioAdm;
import br.com.sql.SqlConnection;
import br.com.sql.SqlUtil;

public class DaoUsuarioAdm implements IDaoUsuarioAdm {
	
	private Connection conexao;
	private PreparedStatement statement;
	
	

	public DaoUsuarioAdm() {
		this.conexao = SqlConnection.getInstance();
	}
	
	
	@Override
	public UsuarioAdm cadastrar(UsuarioAdm usuarioAdm) throws DaoException {
		
		try {
			this.statement = conexao.prepareStatement(SqlUtil.UsuarioAdmSQL.INSERT_ALL);
			this.statement.setString(1, usuarioAdm.getNome());
			this.statement.setString(2, usuarioAdm.getCpf());
			this.statement.setString(3, usuarioAdm.getLogin());
			this.statement.setString(4, usuarioAdm.getSenha());
			this.statement.execute();
			
		} catch (SQLException e) {			
			e.printStackTrace();
			throw new DaoException("ERRO AO CADASTRAR USUARIO - CONTATAR ADM");
		}
		
		return usuarioAdm;
	}

	@Override
	public ArrayList<UsuarioAdm> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
