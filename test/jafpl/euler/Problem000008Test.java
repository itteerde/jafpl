package jafpl.euler;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.security.NoSuchAlgorithmException;

import org.junit.jupiter.api.Test;

class Problem000008Test {

	@Test
	void testSolve() throws NoSuchAlgorithmException {
		assertEquals("0f53ea7949d32ef24f9186207600403c", CheckGenerator.hexString((new Problem000008()).solve()));
	}

}
