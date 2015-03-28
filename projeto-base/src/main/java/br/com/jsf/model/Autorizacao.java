package br.com.jsf.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Autorizacao implements Serializable {
 
	private static final long serialVersionUID = 7185704609858131746L;
	
	@Id
    private String nome;
 
    public Autorizacao() {
    }

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
    
    
}
