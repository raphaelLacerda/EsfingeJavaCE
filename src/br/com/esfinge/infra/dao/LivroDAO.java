package br.com.esfinge.infra.dao;

import java.util.List;
import javax.persistence.EntityManager;
import org.esfinge.querybuilder.QueryBuilder;
import br.com.esfinge.dominio.modelo.Livro;
import br.com.esfinge.dominio.repositorio.LivroRepositorio;
import br.com.esfinge.dominio.repositorio.TodosLivros;

public class LivroDAO implements LivroRepositorio {

	private TodosLivros		todosLivros;

	private EntityManager	em;

	public LivroDAO(EntityManager em) {

		this.todosLivros = QueryBuilder.create(TodosLivros.class);
		this.em = em;
	}

	@Override
	public List<Livro> buscarLivrosPorNome(String nome) {

		return todosLivros.getLivroByNome(nome);
	}

	@Override
	public List<Livro> buscarLivroPeloNomeDaEditora(String nome) {

		return todosLivros.getLivroByEditoraNome(nome);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Livro> buscarLivroPeloNomeDoAutor(String nome) {

		return em
				.createQuery(
						"from Livro l join fetch l.autores a where a.nome = :nome")
				.setParameter("nome", nome).getResultList();
	}

	@Override
	public Livro salvar(Livro livro) {

		return todosLivros.save(livro);
	}

}
