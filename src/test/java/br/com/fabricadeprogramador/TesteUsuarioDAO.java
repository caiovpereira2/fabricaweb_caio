package br.com.fabricadeprogramador;

import br.com.fabricadeprogramador.persistencia.entidade.Usuario;
import br.com.fabricadeprogramador.persistencia.jdbc.UsuarioDAO;

public class TesteUsuarioDAO {

	public static void main(String[] args) {
		testeExcluir();
	}
	
public static void testeExcluir() {
		
		Usuario usuario = new Usuario();
		usuario.setId(3);

		UsuarioDAO usuarioDAO = new UsuarioDAO();
		usuarioDAO.excluir(usuario);

		System.out.println("Excluido com sucesso!!!");
	}

	public static void testeAlterar() {
		
		Usuario usuario = new Usuario();
		usuario.setId(3);
		usuario.setNome("Jonathan da Silva");
		usuario.setLogin("jonathan01");
		usuario.setSenha("q1w2e3r4");

		UsuarioDAO usuarioDAO = new UsuarioDAO();
		usuarioDAO.alterar(usuario);

		System.out.println("Alterado com sucesso!!!");
	}
	
public static void testeCadastrar() {
		
		Usuario usuario = new Usuario();
		usuario.setNome("Jonathan");
		usuario.setLogin("jonathan01");
		usuario.setSenha("q1w2e3");

		UsuarioDAO usuarioDAO = new UsuarioDAO();
		usuarioDAO.cadastrar(usuario);

		System.out.println("Cadastrado com sucesso!!!");
	}


}
