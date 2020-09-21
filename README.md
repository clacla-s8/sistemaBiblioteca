# Sistema Biblioteca CEPEDC

Descrição do Sistema:
Sistema para biblioteca do CEPEDC. O sistema irá realizar o cadastro de livros, consultas, atualização e exclusão. Cadastro de usuários, consultas, atualização e exclusão, sendo os usuários divididos entre administrador e pessoa comum, apenas o usuário administrador poderá manipular o sistema. Haverá um registro de reserva, empréstimo, renovação de empréstimo e devolução de livros. Controle de disponibilidade dos livros. O sistema irá gerar relatórios, de livros e usuários.

###### Sistema com 7 Entidades:

Livro (id, nomeLivro, editora, autor1, autor2)<br/>
UsuarioAdm (id, nome, cpf, login, senha)<br/>
UsuarioComum (id, nome, cpf)<br/>
Emprestimo (id, usuarioComum_id, usuarioAdm_id, livro_id, dataEmprestimo, dataDevolucao)<br/>
Reserva (id, usuarioComum_id, livro_id, dataReserva, dataPegar)<br/>
Endereco (id, usuarioComum_id, rua, numero, bairro, cidade, estado)<br/>
Telefone (id, usuarioComum_id, numero, tipo)<br/>

###### Sistema com 5 entidades:

Livro (id, nomeLivro, editora, autor1, autor2)<br/>
UsuarioAdm (id, nome, cpf, login, senha)<br/>
UsuarioComum (id, nome, cpf, endereço, telefone)<br/>
Emprestimo (id, usuarioComum_id, usuarioAdm_id, livro_id, dataEmprestimo, dataDevolucao)<br/>
Reserva (id, usuarioComum_id, livro_id, dataReserva, dataPegar)
