package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import SistemaDeApoio.Sala;
import SistemaDeApoio.TiposDeSalas;
import Subsistemas.Infra_estrutura;

class Infra_estruturaTest {
	
	Sala sala1;
	Sala sala2;
	TiposDeSalas DIRETORIA;
	Infra_estrutura estru;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
		sala1 = new Sala(1, DIRETORIA);
		sala1 = new Sala(2, DIRETORIA);
		estru = new Infra_estrutura();
		estru.addSala(sala1);
		estru.addSala(sala2);
	}
	
	@Test
	void test1() {
		assertEquals(true, estru.addSala(sala1));
	}
	
	@Test
	void test2() {
		assertEquals(true, estru.addSala(3, DIRETORIA));
	}
	
	@Test
	void test3() {
		assertEquals(true, estru.removeSala(0));
	}
	
	@Test
	void test4() {
		assertEquals(true, estru.removeSala(0));
	}
	
	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

}
