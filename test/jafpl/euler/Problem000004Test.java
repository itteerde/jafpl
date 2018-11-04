package jafpl.euler;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.security.NoSuchAlgorithmException;

import org.junit.jupiter.api.Test;

class Problem000004Test {

	@Test
	void testSolve() throws NoSuchAlgorithmException {
		assertEquals("d4cfc27d16ea72a96b83d9bdef6ce2ec", CheckGenerator.hexString((new Problem000004()).solve()));
	}

}
