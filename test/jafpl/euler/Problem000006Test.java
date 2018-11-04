package jafpl.euler;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.security.NoSuchAlgorithmException;

import org.junit.jupiter.api.Test;

class Problem000006Test {

	@Test
	void testSolve() throws NoSuchAlgorithmException {
		assertEquals("867380888952c39a131fe1d832246ecc", CheckGenerator.hexString((new Problem000006()).solve()));
	}

}
