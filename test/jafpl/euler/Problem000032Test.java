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
class Problem000032Test {

	/**
	 * Test method for {@link jafpl.euler.Problem000032#solve()}.
	 */
	@Test
	void testSolve() throws NoSuchAlgorithmException {
		assertEquals("100f6e37d0b0564490a2ee27eff0660d", CheckGenerator.hexString((new Problem000032()).solve()));
	}

}
