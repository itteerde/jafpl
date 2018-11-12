package jafpl.algorithms;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Vector;

import org.junit.jupiter.api.Test;

class QuickSortTest {

	@Test
	public void testSort() {
		Vector<Integer> c = new Vector<Integer>();
		c.add(new Integer(123));
		c.add(new Integer(-1));
		c.add(new Integer(12));
		c.add(new Integer(123));
		c.add(new Integer(-123));

		QuickSort.sort(c);

		assertEquals(new Integer(-123), c.elementAt(0));
		assertEquals(new Integer(-1), c.elementAt(1));
		assertEquals(new Integer(12), c.elementAt(2));
		assertEquals(new Integer(123), c.elementAt(3));
		assertEquals(new Integer(123), c.elementAt(4));
	}

}
