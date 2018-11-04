package jafpl.euler;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.security.NoSuchAlgorithmException;

import org.junit.jupiter.api.Test;

class Problem000005Test {

	@Test
	void testSolve() throws NoSuchAlgorithmException {
		assertEquals("bc0d0a22a7a46212135ed0ba77d22f3a", CheckGenerator.hexString((new Problem000005()).solve()));
	}

}
