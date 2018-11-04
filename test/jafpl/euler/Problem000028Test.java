/**
 * 
 */
package jafpl.euler;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.security.NoSuchAlgorithmException;

import org.junit.jupiter.api.Test;

/**
 * @author eriki
 *
 */
class Problem000028Test {

	/**
	 * Test method for {@link jafpl.euler.Problem000028#solve()}.
	 */
	@Test
	void testSolve() throws NoSuchAlgorithmException {
		assertEquals("0d53425bd7c5bf9919df3718c8e49fa6", CheckGenerator.hexString((new Problem000028()).solve()));
	}
}
