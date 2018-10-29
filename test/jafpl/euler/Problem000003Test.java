package jafpl.euler;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.security.NoSuchAlgorithmException;

import org.junit.jupiter.api.Test;

/**
 * 
 * @author Erik Itter
 *
 */
class Problem000003Test {

	@Test
	void test() throws NoSuchAlgorithmException {
		assertEquals("94c4dd41f9dddce696557d3717d98d82", CheckGenerator.hexString(Problem000003.solve()));
	}

}
