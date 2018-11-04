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
class Problem000046Test {

	/**
	 * Test method for {@link jafpl.euler.Problem000046#solve()}.
	 */
	@Test
	void testSolve() throws NoSuchAlgorithmException {
		assertEquals("89abe98de6071178edb1b28901a8f459", CheckGenerator.hexString((new Problem000046()).solve()));
	}
}
