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
class Problem000016Test {

	/**
	 * Test method for {@link jafpl.euler.Problem000016#solve()}.
	 */
	@Test
	void testSolve() throws NoSuchAlgorithmException {
		assertEquals("6a5889bb0190d0211a991f47bb19a777", CheckGenerator.hexString((new Problem000016()).solve()));
	}

}
