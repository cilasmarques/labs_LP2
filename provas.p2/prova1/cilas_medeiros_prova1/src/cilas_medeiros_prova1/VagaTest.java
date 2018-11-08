package cilas_medeiros_prova1;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

class VagaTest {

	@Test
	void testVagaOcupada() {
		Vaga vaga = new Vaga("A", 5);
		vaga.vagaOcupada(5, "RELAMPAGOMARQUINHOS");
		assertEquals(vaga.getStatus(), false);
		assertEquals(vaga.getPlacaCarro(), "RELAMPAGOMARQUINHOS");
	}

	@Test
	void testVagaLiberada() {
		Vaga vaga = new Vaga("A", 5);
		vaga.vagaOcupada(5, "RELAMPAGOMARQUINHOS");
		vaga.vagaLiberada();
		assertEquals(vaga.getPlacaCarro(), "");
	}

	@Test
	void testGetInfo() {
		Vaga vaga = new Vaga("A", 5);
		Vaga vaga2 = new Vaga("A", 6);
		vaga.vagaOcupada(5, "RELAMPAGOMARQUINHOS");
		assertEquals(vaga.getInfo(), "\nA-5 Vaga ocupada");
		assertEquals(vaga2.getInfo(), "\nA-6 Vaga livre");
	}

	@Test
	void testGetStatus() {
		Vaga vaga = new Vaga("A", 5);
		vaga.vagaOcupada(5, "RELAMPAGOMARQUINHOS");
		assertEquals(vaga.getStatus(), false);
	}

	@Test
	void testToString() {
		Vaga vaga = new Vaga("A", 5);
		vaga.vagaOcupada(5, "RELAMPAGOMARQUINHOS");
		assertEquals(vaga.getStatus(), false);
		assertEquals(vaga.toString(), "\nA-5 RELAMPAGOMARQUINHOS");
	}
	
	@Test
	void testGetLocalizacao() {
		Vaga vaga = new Vaga("A", 5);
		vaga.vagaOcupada(5, "RELAMPAGOMARQUINHOS");
		assertEquals(vaga.getLocalizacao(), "\nA5");
	}
	
}
