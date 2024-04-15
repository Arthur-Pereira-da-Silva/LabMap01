package globoFilmes.test;

import static org.junit.Assert.*;

import org.junit.Test;

import globoFilmes.entidades.Ator;

public class AtorTest {

    @Test
    public void testGetNome() {
        Ator ator = new Ator("João");
        String nome = ator.getNome();
        assertEquals("João", nome);
    }

    @Test
    public void testGetFuncao() {
        Ator ator = new Ator("Maria");
        String funcao = ator.getFuncao();
        assertEquals("Ator", funcao);
    }
}
