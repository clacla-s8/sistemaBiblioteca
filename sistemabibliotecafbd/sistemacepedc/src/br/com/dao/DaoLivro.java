package br.com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;

import br.com.exception.DaoException;
import br.com.model.Livro;
import br.com.sql.SqlConnection;
import br.com.sql.SqlUtil;

public class DaoLivro implements IDaoLivro{
	
	private Connection conexao;
	private PreparedStatement statement;
	
	public DaoLivro() {
		this.conexao = SqlConnection.getInstance();
	}

	@Override
	public Livro cadastrar(Livro livro) throws DaoException {
		
		try {
			this.statement = conexao.prepareStatement(SqlUtil.LivroSQL.INSERT_ALL);
			this.statement.setString(1, livro.getNomeLivro());
			this.statement.setString(2, livro.getEditora());
			this.statement.setString(3, livro.getAutor1());
			this.statement.setString(4, livro.getAutor2());
			this.statement.execute();
			
			
		} catch (SQLException e) {
			e.printStackTrace();
			throw new DaoException("ERRO AO CADASTRAR LIVRO - CONTATAR ADM");
			
		}		
		
		return livro;
	}

	@Override
	public ArrayList<Livro> getAll() {
		// TODO Auto-generated method stub
		return null;
	}
	

}