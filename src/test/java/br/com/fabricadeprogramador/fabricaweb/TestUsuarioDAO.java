	package br.com.fabricadeprogramador.fabricaweb;

import br.com.fabricadeprogramador.fabricaweb.entidade.Usuario;
import br.com.fabricadeprogramador.fabricaweb.persistencia.jdbc.UsuarioDAO;

public class TestUsuarioDAO {
	
	

	public static void main(String[] args) {
		
		testExcluir();	
		
		
	}
	
	public static void testCadastrar(){
		//Criando Usuário
		Usuario usu = new Usuario();

		usu.setNome("Arm");
		usu.setLogin("a");
		usu.setSenha("123");
				
		//Cadastrando no banco
		UsuarioDAO usuDAO = new UsuarioDAO();
		usuDAO.cadastrar(usu);
				
		System.out.println("Cadastrado com sucesso!");
	}
	
	public static void testAlterar(){
		//Alterando Usuário
		Usuario usu = new Usuario();
		usu.setId(1);
		usu.setNome("Nathalia");
		usu.setLogin("naty");
		usu.setSenha("12345");
				
		//Cadastrando no banco
		UsuarioDAO usuDAO = new UsuarioDAO();
		usuDAO.alterar(usu);
				
		System.out.println("Alterado com sucesso!");
	}
	
	public static void testExcluir(){
		
		//Excluindo Usuário
		Usuario usu = new Usuario();
		usu.setId(1);
						
		//Cadastrando no banco
		UsuarioDAO usuDAO = new UsuarioDAO();
		usuDAO.excluir(usu);
				
		System.out.println("Deletado com sucesso!");
	}

}
