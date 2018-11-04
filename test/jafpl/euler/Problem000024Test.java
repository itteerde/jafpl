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
class Problem000024Test {

	/**
	 * Test method for {@link jafpl.euler.Problem000024#solve()}.
	 */
	@Test
	void testSolve() throws NoSuchAlgorithmException {
		assertEquals("7f155b45cb3f0a6e518d59ec348bff84", CheckGenerator.hexString((new Problem000024()).solve()));
	}
}
