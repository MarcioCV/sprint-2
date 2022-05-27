package br.com.fiap.sprintMicro.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


@Entity
public class User {
	
	@Id
	@GeneratedValue
	private Long id;
	private String nome_user;
	private String desc_senha;
	private Long id_cadastro;
	
	public Long getId_user() {
		return id;
	}
	public void setId_user(Long id) {
		this.id = id;
	}
	public String getNome_user() {
		return nome_user;
	}
	public void setNome_user(String nome_user) {
		this.nome_user = nome_user;
	}
	public String getDesc_senha() {
		return desc_senha;
	}
	public void setDesc_senha(String desc_senha) {
		this.desc_senha = desc_senha;
	}
	public Long getId_cadastro() {
		return id_cadastro;
	}
	public void setId_cadastro(Long id_cadastro) {
		this.id_cadastro = id_cadastro;
	}
	
}
