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
class Problem000044Test {

	/**
	 * Test method for {@link jafpl.euler.Problem000044#solve()}.
	 */
	@Test
	void testSolve() throws NoSuchAlgorithmException {
		assertEquals("2c2556cb85621309ca647465ffa62370", CheckGenerator.hexString((new Problem000044()).solve()));
	}
}
