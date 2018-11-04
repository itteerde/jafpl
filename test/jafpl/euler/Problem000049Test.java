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
class Problem000049Test {

	/**
	 * Test method for {@link jafpl.euler.Problem000049#solve()}.
	 */
	@Test
	void testSolve() throws NoSuchAlgorithmException {
		assertEquals("0b99933d3e2a9addccbb663d46cbb592", CheckGenerator.hexString((new Problem000049()).solve()));
	}
}
