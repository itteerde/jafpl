package jafpl;

public class ShiftCrypt {

	public static void main(String[] args) {

		// String message =

		String message = "GDVLVWNHLQVLFKHUHUNRGHGHUZLUGMXOLXVFDHVDUCXJHVFKULHEHQXQGGHQNDQQMHGHUEUHFKHQGHUGLHVSUDFKHNHQQWLQGHUGLHQDFKULFKWYHUVFKOXHVVHOWZRUGHQLVWPDQEUDXFKWQRFKHLQHJHZLVVHODHQJHGHVNODUWHAWHVDEHUGDQQLVWHVHLQNLQGHUVSLHO";
		int shift = 0;

		char[] cipher = message.toCharArray();
		for (int i = 0; i < cipher.length; i++) {
			cipher[i] = (char) (((cipher[i] + shift - 'A') % 26) + 'A');
		}

		System.out.println(cipher);
	}

}
