package facade;

import org.example.EditoraFactory;
import org.example.Livraria;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LivrariaTeste {

    @Test
    void deveRetornarLivros() {
        Livraria livraria = new Livraria();
        livraria.cadastrar("Dom Casmurro", "Companhia das Letras", "Brasil");
        livraria.cadastrar("Memorias Postumas", "Companhia das Letras", "Brasil");
        livraria.cadastrar("Quincas Borba", "Companhia das Letras", "Brasil");
        livraria.cadastrar("Orgulho e Preconceito", "Penguin Books", "Inglaterra");

        List<String> saida = Arrays.asList(
                "Livro{titulo='Dom Casmurro', editora='Companhia das Letras', pais='Brasil'}",
                "Livro{titulo='Memorias Postumas', editora='Companhia das Letras', pais='Brasil'}",
                "Livro{titulo='Quincas Borba', editora='Companhia das Letras', pais='Brasil'}",
                "Livro{titulo='Orgulho e Preconceito', editora='Penguin Books', pais='Inglaterra'}");

        assertEquals(saida, livraria.obterLivros());
    }

    @Test
    void deveRetornarTotalEditoras() {
        Livraria livraria = new Livraria();
        livraria.cadastrar("Dom Casmurro", "Companhia das Letras", "Brasil");
        livraria.cadastrar("Memorias Postumas", "Companhia das Letras", "Brasil");
        livraria.cadastrar("Quincas Borba", "Companhia das Letras", "Brasil");
        livraria.cadastrar("Orgulho e Preconceito", "Penguin Books", "Inglaterra");

        assertEquals(2, EditoraFactory.getTotalEditoras());
    }

}