package br.com.esfinge.infra;

import java.math.BigDecimal;
import java.util.Random;
import org.esfinge.querybuilder.QueryBuilder;
import br.com.esfinge.dominio.modelo.Categoria;
import br.com.esfinge.dominio.modelo.Editora;
import br.com.esfinge.dominio.modelo.Livro;
import br.com.esfinge.dominio.repositorio.TodasEditoras;
import br.com.esfinge.dominio.repositorio.TodosLivros;

public class PopuladorDeDados {

	public static void main(String[] args) {

		TodosLivros todosLivros = QueryBuilder.create(TodosLivros.class);
		TodasEditoras todasEditoras = QueryBuilder.create(TodasEditoras.class);

		int[] anos = new int[] { 2012, 2000, 1985, 2011, 1999, 2010 };
		Categoria[] categorias = Categoria.values();

		for (int i = 1; i < 20; i++) {

			Editora editora = new Editora("Editora - " + i);
			editora = todasEditoras.save(editora);

		}

		for (int i = 1; i < 200; i++) {

			int id = 0;
			while (id == 0) {
				id = new Random().nextInt(11);
			}

			Editora editora = todasEditoras.getById(id);

			Livro livro = new Livro("Livro - " + i, editora, categorias[new Random().nextInt(5)], new BigDecimal("10").multiply(new BigDecimal(i)
					.multiply(new BigDecimal("1.37"))), anos[new Random().nextInt(6)], new Random().nextInt(2000));

			todosLivros.save(livro);

		}

	}
}
