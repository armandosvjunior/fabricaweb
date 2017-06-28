package br.com.fabricadeprogramador.fabricaweb.persistencia.jdbc;

import java.sql.*;

import br.com.fabricadeprogramador.fabricaweb.entidade.Usuario;

public class UsuarioDAO {
	
	private Connection conexao = ConectionFactory.getConnection();

	public void cadastrar(Usuario usu) {
		
		String sql = "insert into usuario (nome, login, senha) values (?, ?, ?)";
		
		
		
		try {
			PreparedStatement preparador = conexao.prepareStatement(sql);
			preparador.setString(1, usu.getNome());
			preparador.setString(2, usu.getLogin());
			preparador.setString(3, usu.getSenha());
			
			preparador.execute();
			
			preparador.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	public void alterar(Usuario usu) {
		
		String sql = "update usuario set nome=?, login=?, senha=? where id=?";
		
		try {
			PreparedStatement preparador = conexao.prepareStatement(sql);
			
			preparador.setString(1, usu.getNome());
			preparador.setString(2, usu.getLogin());
			preparador.setString(3, usu.getSenha());
			preparador.setInt(4, usu.getId());
			
			preparador.execute();
			
			preparador.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	public void excluir(Usuario usu) {
		String sql = "delete from usuario where id=?";
		
		try {
			PreparedStatement preparador = conexao.prepareStatement(sql);
			
			preparador.setInt(1, usu.getId());
			
			preparador.execute();
			
			preparador.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
