/**
 * 
 */
package jafpl;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import jafpl.math.Fraction;

/**
 * @author Erik Itter
 *
 */
class FractionTest {

	@Test
	void testToString() {
		Fraction a = new Fraction(2, 3);
		assertEquals("2/3", a.toString());
	}

	@Test
	void testPlus() {
		Fraction a = new Fraction(2, 3);
		Fraction b = new Fraction(5, 7);

		assertEquals(new Fraction(29, 21), a.plus(b));
	}

}
