package jafpl.euler;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.security.NoSuchAlgorithmException;

import org.junit.jupiter.api.Test;

class Problem000007Test {

	@Test
	void testSolve() throws NoSuchAlgorithmException {
		assertEquals("8c32ab09ec0210af60d392e9b2009560", CheckGenerator.hexString((new Problem000004()).solve()));
	}

}
