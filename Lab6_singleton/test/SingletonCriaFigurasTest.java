package test;

import static org.junit.Assert.*;

import org.junit.Test;

import src.SingletonCriaFiguras;
import src.TrianguloEquilatero;
import src.TrianguloEscaleno;
import src.TrianguloIsosceles;
import src.tratamento.TrianguloException;

public class SingletonCriaFigurasTest {

    @Test
    public void testCriaTrianguloEquilatero() throws TrianguloException {
        SingletonCriaFiguras singleton = SingletonCriaFiguras.getInstancia();
        TrianguloEquilatero triEquilatero1 = singleton.criaTrianguloEquilatero(3.0, 3.0, 3.0);
        TrianguloEquilatero triEquilatero2 = singleton.criaTrianguloEquilatero(3.0, 3.0, 3.0);
        
        assertEquals("Sim!, os objetos são iguais!\n", singleton.verificaInstancias(triEquilatero1, triEquilatero2));
    }

    @Test
    public void testCriaTrianguloEscaleno() throws TrianguloException {
        SingletonCriaFiguras singleton = SingletonCriaFiguras.getInstancia();
        TrianguloEscaleno triEscaleno1 = singleton.criaTrianguloEscaleno(3.0, 4.0, 5.0);
        TrianguloEscaleno triEscaleno2 = singleton.criaTrianguloEscaleno(3.0, 4.0, 5.0);
        
        assertNotEquals("Os objetos não são iguais!\n", singleton.verificaInstancias(triEscaleno1, triEscaleno2));
    }

    @Test
    public void testCriaTrianguloIsosceles() throws TrianguloException {
        SingletonCriaFiguras singleton = SingletonCriaFiguras.getInstancia();
        TrianguloIsosceles triIsosceles1 = singleton.criaTrianguloIsosceles(3.0, 3.0, 4.0);
        TrianguloIsosceles triIsosceles2 = singleton.criaTrianguloIsosceles(3.0, 3.0, 4.0);
        
        assertEquals("Sim!, os objetos são iguais!\n", singleton.verificaInstancias(triIsosceles1, triIsosceles2));
    }
}