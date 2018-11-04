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
class Problem000023Test {

	/**
	 * Test method for {@link jafpl.euler.Problem000023#solve()}.
	 */
	@Test
	void testSolve() throws NoSuchAlgorithmException {
		assertEquals("2c8258c0604152962f7787571511cf28", CheckGenerator.hexString((new Problem000023()).solve()));
	}
}
