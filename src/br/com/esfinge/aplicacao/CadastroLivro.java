package br.com.esfinge.aplicacao;

import java.math.BigDecimal;
import org.esfinge.querybuilder.QueryBuilder;
import br.com.esfinge.dominio.modelo.Categoria;
import br.com.esfinge.dominio.modelo.Livro;
import br.com.esfinge.dominio.repositorio.TodosLivros;

public class CadastroLivro {

	public static void main(String[] args) {

		Livro livro = new Livro("Fowler e suas DSLs", null,
				Categoria.DRAMA, new BigDecimal("10"), 2012, 2000);

		TodosLivros todosLivros = QueryBuilder
				.create(TodosLivros.class);

		todosLivros.save(livro);
	}
}
