package globoFilmes.test;

import static org.junit.Assert.*;

import org.junit.Test;

import globoFilmes.entidades.Cinegrafista;

public class CinegrafistaTest {

    @Test
    public void testGetNome() {
        Cinegrafista cinegrafista = new Cinegrafista("Carlos");
        String nome = cinegrafista.getNome();
        assertEquals("Carlos", nome);
    }

    @Test
    public void testGetFuncao() {
        Cinegrafista cinegrafista = new Cinegrafista("Maria");
        String funcao = cinegrafista.getFuncao();
        assertEquals("Cinegrafista", funcao);
    }
}
