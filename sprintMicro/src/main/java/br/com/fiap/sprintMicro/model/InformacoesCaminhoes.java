package br.com.fiap.sprintMicro.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


@Entity
public class InformacoesCaminhoes {
	
	@Id
	@GeneratedValue
	private Long id;
	private Long id_user;
	private Long id_modelo;
	private Long id_componente;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getId_user() {
		return id_user;
	}
	public void setId_user(Long id_user) {
		this.id_user = id_user;
	}
	public Long getId_modelo() {
		return id_modelo;
	}
	public void setId_modelo(Long id_modelo) {
		this.id_modelo = id_modelo;
	}
	public Long getId_componente() {
		return id_componente;
	}
	public void setId_componente(Long id_componente) {
		this.id_componente = id_componente;
	}

}
