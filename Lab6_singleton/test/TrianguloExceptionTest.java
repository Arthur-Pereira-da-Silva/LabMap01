package test;

import static org.junit.Assert.*;

import org.junit.Test;

import src.tratamento.TrianguloException;

public class TrianguloExceptionTest {

    @Test
    public void testValidaTriangulo() {
        assertTrue(TrianguloException.validaTriangulo(3.0, 4.0, 5.0)); 
        assertTrue(TrianguloException.validaTriangulo(5.0, 12.0, 13.0)); 
        assertTrue(TrianguloException.validaTriangulo(7.0, 24.0, 25.0)); 
    }
}