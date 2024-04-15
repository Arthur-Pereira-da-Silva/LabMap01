package globoFilmes.test;
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import globoFilmes.ClasseControle;
import globoFilmes.entidades.Funcionario;
import globoFilmes.tratamentoErros.FilmeNaoEncontradoException;
import globoFilmes.tratamentoErros.FuncionarioNaoEncontradoException;
import globoFilmes.tratamentoErros.RegistroFilmeException;

public class ClasseControleTest {
    private ClasseControle controle;

    @Before
    public void setUp() {
        controle = new ClasseControle();
    }

    @Test
    public void testCadastroFilme() {
        try {
            controle.cadastroFilme("Nome Filme", 2022, new FuncionarioImpl("Diretor"), new FuncionarioImpl("Roteirista"), new FuncionarioImpl("Cinegrafista"), new ArrayList<>());
            // Verifica se o filme foi cadastrado corretamente
            assertEquals(1, controle.getNumFilmesProduzidos());
        } catch (RegistroFilmeException e) {
            fail("Não era esperada uma exceção ao cadastrar um filme válido.");
        }
    }

    @Test(expected = RegistroFilmeException.class)
    public void testCadastroFilmeNomeInvalido() throws RegistroFilmeException {
        controle.cadastroFilme(null, 2022, new FuncionarioImpl("Diretor"), new FuncionarioImpl("Roteirista"), new FuncionarioImpl("Cinegrafista"), new ArrayList<>());
    }

    @Test
    public void testDetalhesFilme() {
        List<Funcionario> elenco = new ArrayList<>();
        elenco.add(new FuncionarioImpl("Ator1"));
        elenco.add(new FuncionarioImpl("Ator2"));
        elenco.add(new FuncionarioImpl("Ator3"));
        try {
            controle.cadastroFilme("Nome Filme", 2022, new FuncionarioImpl("Diretor"), new FuncionarioImpl("Roteirista"), new FuncionarioImpl("Cinegrafista"), elenco);
            // Verifica se não ocorre exceção ao detalhar o filme cadastrado
            controle.detalhesFilme("Nome Filme");
        } catch (RegistroFilmeException | FilmeNaoEncontradoException e) {
            fail("Não era esperada uma exceção.");
        }
    }

    @Test(expected = FilmeNaoEncontradoException.class)
    public void testDetalhesFilmeNaoEncontrado() throws FilmeNaoEncontradoException {
        controle.detalhesFilme("Nome Filme Inexistente");
    }

    @Test
    public void testFilmografiaFuncionario() {
        List<Funcionario> elenco = new ArrayList<>();
        elenco.add(new FuncionarioImpl("Ator1"));
        elenco.add(new FuncionarioImpl("Ator2"));
        elenco.add(new FuncionarioImpl("Ator3"));
        try {
            controle.cadastroFilme("Nome Filme", 2022, new FuncionarioImpl("Diretor"), new FuncionarioImpl("Roteirista"), new FuncionarioImpl("Cinegrafista"), elenco);
            // Verifica se não ocorre exceção ao verificar a filmografia do funcionário
            controle.filmografiaFuncionario("Diretor");
        } catch (RegistroFilmeException | FuncionarioNaoEncontradoException e) {
            fail("Não era esperada uma exceção.");
        }
    }

    @Test(expected = FuncionarioNaoEncontradoException.class)
    public void testFilmografiaFuncionarioNaoEncontrado() throws FuncionarioNaoEncontradoException {
        controle.filmografiaFuncionario("Funcionario Inexistente");
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