/**
 * Crash course training for apprenticeship 
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

	@Test
	void testMinus() {
		Fraction a = new Fraction(2, 3);
		Fraction b = new Fraction(5, 7);

		assertEquals(new Fraction(-1, 21), a.minus(b));
	}

	@Test
	void testTimes() {
		Fraction a = new Fraction(2, 3);
		Fraction b = new Fraction(5, 7);

		assertEquals(new Fraction(10, 21), a.times(b));
	}

	@Test
	void testDivideBy() {

		Fraction a = new Fraction(2, 3);
		Fraction b = new Fraction(5, 7);

		assertEquals(new Fraction(14, 15), a.divideBy(b));
	}

	@Test
	void testSimplify() {
		Fraction a = new Fraction(30030, 1547);

		assertEquals(new Fraction(330, 17), a.simplify());
	}

	@Test
	void testEquals() {
		Fraction a = new Fraction(1, 2);
		Fraction b = new Fraction(2, 4);
		Fraction c = new Fraction(1, 7);
		Fraction d = new Fraction(1, 2);

		assertEquals(true, a.equals(a));
		assertEquals(false, a.equals(b));
		assertEquals(false, b.equals(c));
		assertEquals(true, a.equals(d));
		assertEquals(true, d.equals(a));

	}

}
