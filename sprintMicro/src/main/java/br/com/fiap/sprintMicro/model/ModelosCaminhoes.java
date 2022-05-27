package br.com.fiap.sprintMicro.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class ModelosCaminhoes {
	@Id
	@GeneratedValue
	private Long id;
	private String tp_caminhao;
	private String desc_modelo_caminho;
	private int ano_frabricacao;
	
	Long getId_modelo() {
		return id;
	}
	public void setId_modelo(Long id_modelo) {
		this.id = id_modelo;
	}
	public String getTp_caminhao() {
		return tp_caminhao;
	}
	public void setTp_caminhao(String tp_caminhao) {
		this.tp_caminhao = tp_caminhao;
	}
	public String getDesc_modelo_caminho() {
		return desc_modelo_caminho;
	}
	public void setDesc_modelo_caminho(String desc_modelo_caminho) {
		this.desc_modelo_caminho = desc_modelo_caminho;
	}
	public int getAno_frabricacao() {
		return ano_frabricacao;
	}
	public void setAno_frabricacao(int ano_frabricacao) {
		this.ano_frabricacao = ano_frabricacao;
	}
	
}
