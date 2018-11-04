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
class Problem000013Test {

	/**
	 * Test method for {@link jafpl.euler.Problem000013#solve()}.
	 */
	@Test
	void testSolve() throws NoSuchAlgorithmException {
		assertEquals("361113f19fd302adc31268f8283a4f2d", CheckGenerator.hexString((new Problem000013()).solve()));
	}

}