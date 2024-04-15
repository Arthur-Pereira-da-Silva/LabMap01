package globoFilmes.test;

import static org.junit.Assert.*;

import org.junit.Test;

import globoFilmes.entidades.Roteirista;

public class RoteiristaTest {

    @Test
    public void testGetNome() {
        Roteirista roteirista = new Roteirista("Ana");
        String nome = roteirista.getNome();
        assertEquals("Ana", nome);
    }

    @Test
    public void testGetFuncao() {
        Roteirista roteirista = new Roteirista("Pedro");
        String funcao = roteirista.getFuncao();
        assertEquals("Roteirista", funcao);
    }
}
