package br.com.esfinge.aplicacao;

import java.util.List;
import org.esfinge.querybuilder.QueryBuilder;
import br.com.esfinge.dominio.modelo.Livro;
import br.com.esfinge.dominio.repositorio.TodosLivros;

public class BuscaLivro {

	static TodosLivros	todosLivros	= QueryBuilder
											.create(TodosLivros.class);

	static List<Livro>	livros;

	public static void main(String[] args) {

		listarTodosLivros();
		listarTodosLivrosDinamicamente();
		listarTodosLivrosPorNome();
		listarTodosLivrosComPrecoMaiorQue();
		listarTodosLivrosDaEditoraPorNome();
		listarTodosLivrosPorCategoriaEPrecoOrdenadosPorNome();
		listarLivrosMaisVendidos();

		imprimirLivros();
	}

	//2012
	//mais q 1500 de vendas
	private static void listarLivrosMaisVendidos() {

		// TODO Auto-generated method stub
		livros = todosLivros.getLivroMaisVendidos();
	}

	private static void listarTodosLivrosDaEditoraPorNome() {

		// TODO Auto-generated method stub
//		livros = todosLivros.getLivroByEditoraNome("editora - 2");
	}

	private static void listarTodosLivrosPorCategoriaEPrecoOrdenadosPorNome() {

//		livros = todosLivros.getLivroByCategoriaAndPrecoOrderByNome(Categoria.RELIGIAO, new BigDecimal("1000"));
	}

	private static void listarTodosLivrosComPrecoMaiorQue() {

		// TODO Auto-generated method stub
//		livros = todosLivros.getLivroByPreco(new BigDecimal("2400"));
	}

	private static void listarTodosLivrosPorNome() {

		// TODO Auto-generated method stub
//		livros = todosLivros.getLivroByNome("Livro - 12");
	}

	private static void listarTodosLivrosDinamicamente() {

		// TODO Auto-generated method stub
//		livros = todosLivros.queryByExample(new Livro(null, new Editora(1), null, null, null, null));
	}

	private static void listarTodosLivros() {

		// TODO Auto-generated method stub
//		livros = todosLivros.list();
	}

	private static void imprimirLivros() {

		for (Livro livro : livros) {
			System.out.println(livro);
		}
	}
}
