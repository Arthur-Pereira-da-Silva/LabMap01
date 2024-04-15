package globoFilmes.test;
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import globoFilmes.entidades.Filme;
import globoFilmes.entidades.Funcionario;

public class FilmeTest {

    @Test
    public void testRetornarCastFilme() {
        Funcionario diretor = new FuncionarioImpl("Diretor");
        Funcionario roteirista = new FuncionarioImpl("Roteirista");
        Funcionario cinegrafista = new FuncionarioImpl("Cinegrafista");

        List<Funcionario> elenco = new ArrayList<>();
        elenco.add(new FuncionarioImpl("Ator1"));
        elenco.add(new FuncionarioImpl("Ator2"));
        elenco.add(new FuncionarioImpl("Ator3"));

        Filme filme = new Filme("Nome do Filme", 2022, diretor, roteirista, cinegrafista, elenco);

        // Verifica se o método não lança exceções
        filme.retornarCastFilme();
    }

    @Test
    public void testGettersAndSetters() {
        Funcionario diretor = new FuncionarioImpl("Diretor");
        Funcionario roteirista = new FuncionarioImpl("Roteirista");
        Funcionario cinegrafista = new FuncionarioImpl("Cinegrafista");

        List<Funcionario> elenco = new ArrayList<>();
        elenco.add(new FuncionarioImpl("Ator1"));
        elenco.add(new FuncionarioImpl("Ator2"));
        elenco.add(new FuncionarioImpl("Ator3"));

        Filme filme = new Filme("Nome do Filme", 2022, diretor, roteirista, cinegrafista, elenco);

        assertEquals("Nome do Filme", filme.getNome());
        assertEquals(2022, filme.getAno());
        assertEquals(diretor, filme.getDiretor());
        assertEquals(roteirista, filme.getRoteirista());
        assertEquals(cinegrafista, filme.getCinegrafista());
        assertEquals(elenco, filme.getElenco());

        filme.setNome("Novo Nome");
        filme.setAno(2023);
        Funcionario novoDiretor = new FuncionarioImpl("Novo Diretor");
        filme.setDiretor(novoDiretor);
        Funcionario novoRoteirista = new FuncionarioImpl("Novo Roteirista");
        filme.setRoteirista(novoRoteirista);
        Funcionario novoCinegrafista = new FuncionarioImpl("Novo Cinegrafista");
        filme.setCinegrafista(novoCinegrafista);
        List<Funcionario> novoElenco = new ArrayList<>();
        novoElenco.add(new FuncionarioImpl("Novo Ator1"));
        novoElenco.add(new FuncionarioImpl("Novo Ator2"));
        novoElenco.add(new FuncionarioImpl("Novo Ator3"));
        filme.setElenco(novoElenco);

        // Testa se os valores foram atualizados corretamente
        assertEquals("Novo Nome", filme.getNome());
        assertEquals(2023, filme.getAno());
        assertEquals(novoDiretor, filme.getDiretor());
        assertEquals(novoRoteirista, filme.getRoteirista());
        assertEquals(novoCinegrafista, filme.getCinegrafista());
        assertEquals(novoElenco, filme.getElenco());
    }

    // Implementação de Funcionario para uso nos testes
    private static class FuncionarioImpl implements Funcionario {
        private String nome;

        public FuncionarioImpl(String nome) {
            this.nome = nome;
        }

        @Override
        public String getNome() {
            return nome;
        }

        @Override
        public String getFuncao() {
            return "Função não especificada";
        }
    }
}