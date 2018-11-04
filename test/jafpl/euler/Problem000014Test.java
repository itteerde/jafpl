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
class Problem000014Test {

	/**
	 * Test method for {@link jafpl.euler.Problem000014#solve()}.
	 */
	@Test
	void testSolve() throws NoSuchAlgorithmException {
		assertEquals("5052c3765262bb2c6be537abd60b305e", CheckGenerator.hexString((new Problem000014()).solve()));
	}

}
