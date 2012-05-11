package br.com.esfinge.dominio.repositorio;

import java.math.BigDecimal;
import java.util.List;
import org.esfinge.querybuilder.Repository;
import org.esfinge.querybuilder.annotation.Condition;
import org.esfinge.querybuilder.annotation.DomainTerm;
import org.esfinge.querybuilder.annotation.DomainTerms;
import org.esfinge.querybuilder.annotation.Greater;
import org.esfinge.querybuilder.annotation.IgnoreWhenNull;
import org.esfinge.querybuilder.annotation.Starts;
import org.esfinge.querybuilder.methodparser.ComparisonType;
import br.com.esfinge.dominio.modelo.Categoria;
import br.com.esfinge.dominio.modelo.Livro;

@DomainTerms({ @DomainTerm(term = "mais vendidos", conditions = { @Condition(property = "anoDeLancamento", value = "2012"),
		@Condition(property = "quantidadeDeVendas", value = "1500", comparison = ComparisonType.GREATER_OR_EQUALS) }) })
public interface TodosLivros extends Repository<Livro> {

	List<Livro> getLivroByNome(@Starts String nome);

	List<Livro> getLivroByPreco(@Greater BigDecimal preco);

	List<Livro> getLivroByCategoriaAndPrecoOrderByNome(Categoria categoria, @Greater BigDecimal preco);
	
	List<Livro> getLivroByEditoraNome(@Starts @IgnoreWhenNull String nome);

	List<Livro> getLivroMaisVendidos();

}