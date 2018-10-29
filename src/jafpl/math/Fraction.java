/**
 * 
 */
package jafpl.math;

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

	public Fraction plus(Fraction b) {
		return null;
	}

	public Fraction minus(Fraction b) {
		return plus(new Fraction(b.getNumerator() * -1, b.getDenominator()));
	}

	public Fraction times(Fraction factor) {
		return null;
	}

	public Fraction divideBy(Fraction divisor) {
		return null;
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
	public int compareTo(Fraction o) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof Fraction)) {
			return false;
		}
		return compareTo((Fraction) obj) == 0;
	}

}
