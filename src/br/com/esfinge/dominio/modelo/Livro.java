package br.com.esfinge.dominio.modelo;

import java.math.BigDecimal;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Livro {

	@Id
	@GeneratedValue
	private Integer		id;

	private String		nome;

	@ManyToOne
	private Editora		editora;

	@Enumerated(EnumType.STRING)
	private Categoria	categoria;

	private BigDecimal	preco;

	private Integer		anoDeLancamento;

	private Integer		quantidadeDeVendas;

	public Livro(String nome, Editora editora, Categoria categoria, BigDecimal preco, Integer anoDeLancamento, Integer quantidadeDeVendas) {

		this();
		this.nome = nome;
		this.editora = editora;
		this.categoria = categoria;
		this.preco = preco;
		this.anoDeLancamento = anoDeLancamento;
		this.quantidadeDeVendas = quantidadeDeVendas;
	}

	private Livro() {

	}

	public Integer getId() {

		return id;
	}

	public String getNome() {

		return nome;
	}

	public Editora getEditora() {

		return editora;
	}

	public Categoria getCategoria() {

		return categoria;
	}

	public BigDecimal getPreco() {

		return preco;
	}

	public Integer getAnoDeLancamento() {

		return anoDeLancamento;
	}

	public Integer getQuantidadeDeVendas() {

		return quantidadeDeVendas;
	}

	@Override
	public String toString() {

		return "Livro [id=" + id + ", nome=" + nome + ", editora=" + editora + ", categoria=" + categoria + ", preco=" + preco + ", anoDeLancamento="
				+ anoDeLancamento + ", quantidadeDeVendas=" + quantidadeDeVendas + "]";
	}

	@Override
	public int hashCode() {

		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
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
		Livro other = (Livro) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

}
