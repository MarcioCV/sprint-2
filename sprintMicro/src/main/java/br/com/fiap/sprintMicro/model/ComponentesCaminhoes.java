package br.com.fiap.sprintMicro.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class ComponentesCaminhoes {
	private String desc_componente;
	
	@Id
	@GeneratedValue
	private Long id;
	public String getDesc_componente() {
		return desc_componente;
	}

	public void setDesc_componente(String desc_componente) {
		this.desc_componente = desc_componente;
	}

	public Long getId_componente() {
		return id;
	}

	public void setId_componente(Long id) {
		this.id = id;
	}
	
}
