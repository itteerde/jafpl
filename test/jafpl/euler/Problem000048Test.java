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
class Problem000048Test {

	/**
	 * Test method for {@link jafpl.euler.Problem000048#solve()}.
	 */
	@Test
	void testSolve() throws NoSuchAlgorithmException {
		assertEquals("0829124724747ae1c65da8cae5263346", CheckGenerator.hexString((new Problem000048()).solve()));
	}
}
