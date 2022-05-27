package br.com.fiap.sprintMicro.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class DadosCadastro {
	
	@Id
	@GeneratedValue
	private Long id;
	private String desc_nome;
	private String desc_estado;
	private String desc_cidade;
	private String desc_telefone_celular;
	private Long num_dd;
	
	public Long getId_cadastro() {
		return id;
	}
	public void setId_cadastro(Long id_cadastro) {
		this.id = id_cadastro;
	}
	public String getDesc_nome() {
		return desc_nome;
	}
	public void setDesc_nome(String desc_nome) {
		this.desc_nome = desc_nome;
	}
	public String getDesc_estado() {
		return desc_estado;
	}
	public void setDesc_estado(String desc_estado) {
		this.desc_estado = desc_estado;
	}
	public String getDesc_cidade() {
		return desc_cidade;
	}
	public void setDesc_cidade(String desc_cidade) {
		this.desc_cidade = desc_cidade;
	}
	public String getDesc_telefone_celular() {
		return desc_telefone_celular;
	}
	public void setDesc_telefone_celular(String desc_telefone_celular) {
		this.desc_telefone_celular = desc_telefone_celular;
	}
	public Long getNum_dd() {
		return num_dd;
	}
	public void setNum_dd(Long num_dd) {
		this.num_dd = num_dd;
	}
	
}
