package globoFilmes.test;

import static org.junit.Assert.*;

import org.junit.Test;

import globoFilmes.entidades.Diretor;

public class DiretorTest {

    @Test
    public void testGetNome() {
        Diretor diretor = new Diretor("José");
        String nome = diretor.getNome();
        assertEquals("José", nome);
    }

    @Test
    public void testGetFuncao() {
        Diretor diretor = new Diretor("Maria");
        String funcao = diretor.getFuncao();
        assertEquals("Diretor", funcao);
    }
}
