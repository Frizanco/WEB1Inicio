package br.com.frizanco.projetofinal.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity                        // indica que Usuario é uma entidade armazenável no banco
@Table(name="tbl_usuario")     // cria a tabela associando a essa classe
public class Usuario {
	
	@Id                                               //PK
	@GeneratedValue(strategy=GenerationType.IDENTITY) //Gera valores automaticos
	@Column(name="id")
	private int    id;
	
	@Column(name="nome", length=100)
	private String nome;
	
	@Column(name="email", length=100, unique = true)
	private String email;
	
	@Column(name="senha", length=20)
	private String senha;
	
	@Column(name="racf", length=7,unique=true)
	private String racf;
	
	@Column(name="funcional", unique=true)
	private int    funcional;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public String getRacf() {
		return racf;
	}
	public void setRacf(String racf) {
		this.racf = racf;
	}
	public int getFuncional() {
		return funcional;
	}
	public void setFuncional(int funcional) {
		this.funcional = funcional;
	}
	
	

}
