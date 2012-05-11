package br.com.esfinge.dominio.repositorio;

import java.util.List;
import br.com.esfinge.dominio.modelo.Categoria;
import br.com.esfinge.dominio.modelo.Livro;

public interface LivroRepositorio {

	List<Livro> buscarLivrosPorNome(String nome);

	List<Livro> buscarLivroPeloNomeDaEditora(String nome);

	List<Livro> buscarLivroPeloNomeDoAutor(String nome);

	Livro salvar(Livro livro);
}
