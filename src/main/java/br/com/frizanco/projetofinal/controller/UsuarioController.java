package br.com.frizanco.projetofinal.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import br.com.frizanco.projetofinal.dao.UsuarioDAO;
import br.com.frizanco.projetofinal.model.Usuario;

@RestController
public class UsuarioController{

	@Autowired
	private UsuarioDAO dao;
	
	@GetMapping("/usuarios")
	public ArrayList<Usuario> getAll(){
		
		ArrayList<Usuario> lista;
		lista = (ArrayList<Usuario>)dao.findAll(); 
		
		for (Usuario u: lista) {
			u.setSenha("****");		
			}
		return lista;
	}
	
	@GetMapping("/usuarios/{u}")
	public Usuario getUsuarioPeloId(@PathVariable int u) {
		Usuario resultado = dao.findById(u).orElse(null);
		return resultado;
	}
	
}
