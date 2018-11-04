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
class Problem000025Test {

	/**
	 * Test method for {@link jafpl.euler.Problem000025#solve()}.
	 */
	@Test
	void testSolve() throws NoSuchAlgorithmException {
		assertEquals("a376802c0811f1b9088828288eb0d3f0", CheckGenerator.hexString((new Problem000025()).solve()));
	}
}
