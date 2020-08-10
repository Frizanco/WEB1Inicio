// ESSE CARA AQUI É QUEM VAI CONVERTER O MEU JAVA EM COMANDOS SQLS, ELE EH O FRAMEWORK COM EXTEND ME DANDO ALGUNS MÉTODOS
// PARA TRABALHAR COM MINHA TABELA
package br.com.frizanco.projetofinal.dao;

import org.springframework.data.repository.CrudRepository;
import br.com.frizanco.projetofinal.model.Usuario;

public interface UsuarioDAO extends CrudRepository<Usuario, Integer>{
	
}
