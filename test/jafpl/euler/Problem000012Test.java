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
class Problem000012Test {

	/**
	 * Test method for {@link jafpl.euler.Problem000012Test#solve()}.
	 */
	@Test
	void testSolve() throws NoSuchAlgorithmException {
		assertEquals("8091de7d285989bbfa9a2f9f3bdcc7c0", CheckGenerator.hexString((new Problem000012()).solve()));
	}

}