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
class Problem000040Test {

	/**
	 * Test method for {@link jafpl.euler.Problem000040#solve()}.
	 */
	@Test
	void testSolve() throws NoSuchAlgorithmException {
		assertEquals("6f3ef77ac0e3619e98159e9b6febf557", CheckGenerator.hexString((new Problem000040()).solve()));
	}
}
