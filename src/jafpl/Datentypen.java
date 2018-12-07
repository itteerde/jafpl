package jafpl;

public class Datentypen {

	public static void main(String[] args) {
		String s = "1234567890abcdefghijklmnopqrstuvwxyzß اَللُّغَةُ اَلْعَرَبِيَّة 普通話";
		char[] chars = s.toCharArray();
		for (int i = 0; i < chars.length; i++) {
			System.out.println("chars[" + i + "]: " + chars[i] + " (" + (int) chars[i] + ")");
		}
	}

}
