package br.com.esfinge.dominio.modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Editora {

	@Id
	@GeneratedValue
	private Integer	id;

	private String	nome;

	public Editora(String nome) {

		this();
		this.nome = nome;
	}

	public Editora(Integer id) {

		this.id = id;
	}

	private Editora() {

	}

	public Integer getId() {

		return id;
	}

	public String getNome() {

		return nome;
	}

	@Override
	public String toString() {

		return "Editora [id=" + id + ", nome=" + nome + "]";
	}

}
