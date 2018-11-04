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
class Problem000009Test {

	/**
	 * Test method for {@link jafpl.euler.Problem000009#solve()}.
	 * 
	 * @throws NoSuchAlgorithmException
	 */
	@Test
	void testSolve() throws NoSuchAlgorithmException {
		assertEquals("24eaa9820350012ff678de47cb85b639", CheckGenerator.hexString((new Problem000009()).solve()));
	}

}
