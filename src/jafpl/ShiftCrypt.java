package jafpl;

public class ShiftCrypt {

	public static void main(String[] args) {

		String message = "DASISTKEINSICHERERKODEDERWIRDJULIUSCAESARZUGESCHRIEBENUNDDENKANNJEDERBRECHENDERDIESPRACHEKENNTINDERDIENACHRICHTVERSCHLUESSELTWORDENISTMANBRAUCHTNOCHEINEGEWISSELAENGEDESKLARTEXTESABERDANNISTESEINKINDERSPIEL";
		// String message =
		// "GDVLVWNHLQVLFKHUHUNRGHGHUZLUGMXOLXVFDHVDUCXJHVFKULHEHQXQGGHQNDQQMHGHUEUHFKHQGHUGLHVSUDFKHNHQQWLQGHUGLHQDFKULFKWYHUVFKOXHVVHOWZRUGHQLVWPDQEUDXFKWQRFKHLQHJHZLVVHODHQJHGHVNODUWHAWHVDEHUGDQQLVWHVHLQNLQGHUVSLHO";
		int shift = 3;
		int[] count = new int[26];

		char[] cipher = message.toCharArray();
		for (int i = 0; i < cipher.length; i++) {
			cipher[i] = (char) (((cipher[i] + shift - 'A') % 26) + 'A');
			count[cipher[i] - 'A']++;
		}

		System.out.println(cipher);
		for (int i = 0; i < 26; i++) {
			System.out.println();
			System.out.print((char) (i + 'A'));
			System.out.print(" " + count[i]);
		}
	}

}
