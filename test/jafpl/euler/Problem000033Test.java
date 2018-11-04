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
class Problem000033Test {

	/**
	 * Test method for {@link jafpl.euler.Problem000033#solve()}.
	 */
	@Test
	void testSolve() throws NoSuchAlgorithmException {
		assertEquals("f899139df5e1059396431415e770c6dd", CheckGenerator.hexString((new Problem000033()).solve()));
	}
}
