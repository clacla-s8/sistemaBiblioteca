package br.com.fachada;

import java.util.ArrayList;

import br.com.bussiness.BusinessLivro;
import br.com.bussiness.BusinessUsuarioAdm;
import br.com.bussiness.BusinessUsuarioComum;
import br.com.exception.BusinessException;
import br.com.model.Livro;
import br.com.model.UsuarioAdm;
import br.com.model.UsuarioComum;

public class Fachada implements IFachada{
	
	private BusinessLivro businessLivro = new BusinessLivro();
	private BusinessUsuarioAdm businessUsuarioAdm = new BusinessUsuarioAdm();
	private BusinessUsuarioComum businessUsuarioComum = new BusinessUsuarioComum();

	@Override
	public Livro cadastarLivro(Livro livro) throws BusinessException {
		
		return this.businessLivro.cadastrar(livro);
	}
	

	@Override
	public UsuarioComum cadastrarUsuarioComum(UsuarioComum usuarioComum) throws BusinessException {
		
		return this.businessUsuarioComum.cadastrar(usuarioComum);
	}

	@Override
	public UsuarioAdm cadastarUsuarioAdm(UsuarioAdm usuarioAdm) throws BusinessException {
		
		return this.businessUsuarioAdm.cadastrar(usuarioAdm);
	}
	
	@Override
	public ArrayList<Livro> getAllLivro() {
		
		return null;
	}
	
}