package application;

import br.com.exception.BusinessException;
import br.com.fachada.Fachada;
import br.com.model.Livro;
import br.com.model.UsuarioAdm;
import br.com.model.UsuarioComum;

public class App {

	public static void main(String[] args) {
		System.out.println("Inicio");
		
		Fachada fachada = new Fachada();
		
		//Livro livro1 = new Livro("evangelho","lake", "emanuel", "chico");
		//UsuarioComum user1 = new UsuarioComum("Cleo", "2369655623", "(87)99598-6363", "rua aprigio, encruzilhada, numero 01");
		UsuarioAdm adm1 = new UsuarioAdm("Anunciada", "13648955623", "anunciada@gmail.com", "123456");
		
		
		
		try {
			//fachada.cadastarLivro(livro1);
			//fachada.cadastrarUsuarioComum(user1);
			fachada.cadastarUsuarioAdm(adm1);
			
			
		} catch (BusinessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Fim");
	}

}