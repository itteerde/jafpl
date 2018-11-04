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
class Problem000015Test {

	/**
	 * Test method for {@link jafpl.euler.Problem000015#solve()}.
	 */
	@Test
	void testSolve() throws NoSuchAlgorithmException {
		assertEquals("928f3957168ac592c4215dcd04e0b678", CheckGenerator.hexString((new Problem000015()).solve()));
	}

}
