package br.com.fabricadeprogramador.persistencia.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.com.fabricadeprogramador.persistencia.entidade.Usuario;

public class UsuarioDAO {

	private Connection conexao = ConexaoFactory.getConnection();
	PreparedStatement preparador = null;

	public void cadastrar(Usuario usuario) {
		String sql = "insert into usuario(usua_nm_usuario, usua_cd_acesso, usua_tx_senha) values (?, ?, ?)";
		try {
			
			//criando um statement
			preparador = conexao.prepareStatement(sql);
			//substitui o ? pelo dado do usuario
			preparador.setString(1, usuario.getNome());
			preparador.setString(2, usuario.getLogin());
			preparador.setString(3, usuario.getSenha());
			//executando comando sql no bd
			preparador.execute();
			//fechando o objeto preparador
			preparador.close();

		} catch (SQLException e) {

			e.printStackTrace();
		}
	}

	public void alterar(Usuario usuario) {
		String sql = "update usuario set usua_nm_usuario=?, usua_cd_acesso=?, usua_tx_senha=? where usua_id_usuario=?";
		try {
			
			//criando um statement
			preparador = conexao.prepareStatement(sql);
			//substitui o ? pelo dado do usuario
			preparador.setString(1, usuario.getNome());
			preparador.setString(2, usuario.getLogin());
			preparador.setString(3, usuario.getSenha());
			preparador.setInt(4, usuario.getId());
			//executando comando sql no bd
			preparador.execute();
			//fechando o objeto preparador
			preparador.close();

		} catch (SQLException e) {

			e.printStackTrace();
		}
		
	}

	public void excluir(Usuario usuario) {
		String sql = "delete from usuario where usua_id_usuario=?";
		try {
			
			//criando um statement
			preparador = conexao.prepareStatement(sql);
			//substitui o ? pelo dado do usuario
			preparador.setInt(1, usuario.getId());
			//executando comando sql no bd
			preparador.execute();
			//fechando o objeto preparador
			preparador.close();

		} catch (SQLException e) {

			e.printStackTrace();
		}
	}

}
