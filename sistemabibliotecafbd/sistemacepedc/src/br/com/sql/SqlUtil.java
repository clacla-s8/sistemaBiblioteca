package br.com.sql;

public class SqlUtil {
	
	public final static String URL = "jdbc:postgresql://localhost:5432/sistemacepedc";
	public final static String LOGIN = "postgres";
	public final static String SENHA = "1234";
	public final static String COL_ID = "id";
	
	public static class LivroSQL{
		public final static String NAME_TABLE = "livro";
		public final static String COL_NOMELIVRO = "nomeLivro";
		public final static String COL_EDITORA = "editora";
		public final static String COL_AUTOR1 = "autor1";
		public final static String COL_AUTOR2 = "autor2";

		
		public final static String INSERT_ALL = ""+ 
				"INSERT INTO "+ NAME_TABLE+
				"("+COL_NOMELIVRO+","+COL_EDITORA+","+COL_AUTOR1+","+COL_AUTOR2+")"
					+ "VALUES(?,?,?,?)";
	}
	
	public static class UsuarioComumSQL{
		public final static String NAME_TABLE = "usuarioComum";
		public final static String COL_NOME = "nome";
		public final static String COL_CPF = "cpf";
		public final static String COL_TELEFONE = "telefone";
		public final static String COL_ENDERECO = "endereco";

		
		public final static String INSERT_ALL = ""+ 
				"INSERT INTO "+ NAME_TABLE+
				"("+COL_NOME+","+COL_CPF+","+COL_TELEFONE+","+COL_ENDERECO+")"
					+ "VALUES(?,?,?,?)";
		
		public final static String SELECT_CPF = ""
				+ "SELECT * FROM "+ NAME_TABLE+
				" userC WHERE userC.cpf = ?";
	}
	
	public static class UsuarioAdmSQL{
		public final static String NAME_TABLE = "usuarioAdm";
		public final static String COL_NOME = "nome";
		public final static String COL_CPF = "cpf";
		public final static String COL_LOGIN = "login";
		public final static String COL_SENHA = "senha";

		
		public final static String INSERT_ALL = ""+ 
				"INSERT INTO "+ NAME_TABLE+
				"("+COL_NOME+","+COL_CPF+","+COL_LOGIN+","+COL_SENHA+")"
					+ "VALUES(?,?,?,?)";	
		
	}

}
