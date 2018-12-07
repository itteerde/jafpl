package jafpl;

public class Palindrome {

	private static String PALINDROM_1 = "neben";
	private static String PALINDROM_2 = "Otto";
	private static String PALINDROM_3 = "Reliefpfeiler";
	private static String NOT_PALINDROM_1 = "ifjsdjfios";

	public static void main(String[] args) {

		System.out.println("\"" + PALINDROM_1 + "\" ist Palindrom?: " + isPalindrom(PALINDROM_1));
	}

	/**
	 * Tests if a word provided is a palindrome.
	 * 
	 * @param word Word to be tested.
	 * @return <code>true</code> if <code>word</code> is palindrom,
	 *         <code>false</code> otherwise.
	 */
	private static boolean isPalindrom(String word) {

		char[] test = { 69, 114, 105, 107 };
		char[] chars = word.toCharArray();

		printASCIITable();

		return false;
	}

	private static void printASCIITable() {
		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 16; j++) {
				System.out.println(" " + (char) (i * 16 + j) + " ");
			}
		}
	}

}
