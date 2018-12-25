package com.example.pizzaria.model;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;


@Entity
@Table(name = "PIZZA")
public class Pizza implements Serializable{
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	@Column(nullable = false)
	private String tamanho;
	
	private String sabor;
	
	private double tempo_preparo;
	
	private double valor;
	
	//aberto, finalizada, cancelada
	@Column(nullable = false)
	private String situacao;
	
	
	@ManyToMany
	@JoinTable(name = "PEDIDO_FINALIZADO", joinColumns = { @JoinColumn(name = "pizza_id") }, inverseJoinColumns = {
			@JoinColumn(name = "personalizacao_id") })
	private Set<Personalizacao> personalizacoes = new HashSet<>();

	

	public Pizza() {
	}	

	public Pizza(Long id, String tamanho, String situacao) {
		super();
		this.id = id;
		this.tamanho = tamanho;
		this.situacao = situacao;
	}




	public Pizza(String tamanho, String sabor, double tempo_preparo, double valor, String situacao) {
		super();
		this.id = id;
		this.tamanho = tamanho;
		this.sabor = sabor;
		this.tempo_preparo = tempo_preparo;
		this.valor = valor;
		this.situacao = situacao;
	}


	public Pizza(Long id, String tamanho, String sabor, double tempo_preparo, double valor, String situacao,
			Set<Personalizacao> personalizacoes) {
		super();
		this.id = id;
		this.tamanho = tamanho;
		this.sabor = sabor;
		this.tempo_preparo = tempo_preparo;
		this.valor = valor;
		this.situacao = situacao;
		this.personalizacoes = personalizacoes;
	}




	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getTamanho() {
		return tamanho;
	}


	public void setTamanho(String tamanho) {
		this.tamanho = tamanho;
	}


	public String getSabor() {
		return sabor;
	}


	public void setSabor(String sabor) {
		this.sabor = sabor;
	}


	public double getTempo_preparo() {
		return tempo_preparo;
	}


	public void setTempo_preparo(double tempo_preparo) {
		this.tempo_preparo = tempo_preparo;
	}


	public double getValor() {
		return valor;
	}


	public void setValor(double valor) {
		this.valor = valor;
	}


	public String getSituacao() {
		return situacao;
	}


	public void setSituacao(String situacao) {
		this.situacao = situacao;
	}


	public Set<Personalizacao> getPersonalizacoes() {
		return personalizacoes;
	}


	public void setPersonalizacoes(Set<Personalizacao> personalizacoes) {
		this.personalizacoes = personalizacoes;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (id ^ (id >>> 32));
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pizza other = (Pizza) obj;
		if (id != other.id)
			return false;
		return true;
	}
	
	
	
}
