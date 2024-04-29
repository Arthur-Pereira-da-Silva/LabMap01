package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import SistemaDeApoio.Item;
import Subsistemas.Almoxarifado;

class AlmoxarifadoTest {

	Item item1;
	Item item2;
	String nome;
	float preco;
	Almoxarifado almo;
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
		item1 = new Item(3, "arroz");
		item2 = new Item(4, "café");
		almo = new Almoxarifado();
		almo.addItem(1, item1);
		almo.addItem(2, item1);
		almo.addItem(1, nome, preco);
	}
	
	@Test
	void test1() {
		assertEquals(true, almo.addItem(1, item1));
	}
	
	@Test
	void test2() {
		assertEquals(true, almo.addItem(2, item1));
	}
	
	@Test
	void test3() {
		assertEquals(true, almo.addItem(1, nome, preco));
	}
	
	@Test
	void test4() {
		assertEquals(true, almo.removeItem(1, 0));
	}
	
	@Test
	void test5() {
		assertEquals(true, almo.removeItem(1, 1));
	}
	
	@Test
	void test6() {
		assertEquals(true, almo.removeItem(2, 0));
	}
	
	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

}
