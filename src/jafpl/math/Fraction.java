/**
 * 
 */
package jafpl.math;

import de.itter.math.Algorithms;

/**
 * @author Mohammed Barmo
 * @author Erik Itter
 *
 */
public class Fraction implements Comparable<Fraction> {

	private long numerator;
	private long denominator;

	public Fraction(long numerator, long denominator) {
		this.numerator = numerator;
		this.denominator = denominator;
	}

	public Fraction(int numerator, int denominator) {
		this((long) numerator, (long) denominator);
	}

	public long getNumerator() {
		return numerator;
	}

	public long getDenominator() {
		return denominator;
	}

	public Fraction plus(Fraction summand) {
		return new Fraction(getNumerator() * summand.getDenominator() + summand.getNumerator() * getDenominator(),
				getDenominator() * summand.getDenominator());
	}

	public Fraction minus(Fraction b) {
		return plus(new Fraction(b.getNumerator() * -1, b.getDenominator()));
	}

	public Fraction times(Fraction factor) {
		return new Fraction(getNumerator() * factor.getNumerator(), getDenominator() * factor.getDenominator());
	}

	public Fraction divideBy(Fraction divisor) {
		return times(new Fraction(divisor.getDenominator(), divisor.getNumerator()));
	}

	@Override
	public String toString() {
		return new StringBuffer().append(numerator).append("/").append(denominator).toString();
	}

	/**
	 * 
	 * 
	 * @see java.lang.Comparable#compareTo(java.lang.Object)
	 */
	@Override
	public int compareTo(Fraction b) {

		long commonDenominator = Algorithms.lcm(getDenominator(), b.getDenominator());
		long numeratorA = getNumerator() * (commonDenominator / getDenominator());
		long numeratorB = b.getNumerator() * (commonDenominator / b.getDenominator());

		if (numeratorA < numeratorB)
			return -1;

		if (numeratorA > numeratorB)
			return 1;

		return 0;
	}

	/**
	 * Not mathematical equality! 2/4 does not equal 1/2 for this method. Use
	 * <code>simplify</code> before checking for equality if you mean mathematical
	 * equality.
	 */
	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof Fraction)) {
			return false;
		}

		if (getNumerator() != ((Fraction) obj).getNumerator())
			return false;
		if (getDenominator() != ((Fraction) obj).getDenominator())
			return false;

		return true;
	}

	public Fraction simplify() {
		long gcd = Algorithms.gcd(getNumerator(), getDenominator());
		return new Fraction(getNumerator() / gcd, getDenominator() / gcd);
	}

}
