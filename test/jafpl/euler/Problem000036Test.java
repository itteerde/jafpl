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
class Problem000036Test {

	/**
	 * Test method for {@link jafpl.euler.Problem000036#solve()}.
	 */
	@Test
	void testSolve() throws NoSuchAlgorithmException {
		assertEquals("0e175dc2f28833885f62e7345addff03", CheckGenerator.hexString((new Problem000036()).solve()));
	}
}
