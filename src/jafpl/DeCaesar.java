package jafpl;

public class DeCaesar {

	public static void main(String[] args) {
		char[] cipher = new String(
				"GDVLVWNHLQVLFKHUHUNRGHGHUZLUGMXOLXVFDHVDUCXJHVFKULHEHQXQGGHQNDQQMHGHUEUHFKHQGHUGLHVSUDFKHNHQQWLQGHUGLHQDFKULFKWYHUVFKOXHVVHOWZRUGHQLVWPDQEUDXFKWQRFKHLQHJHZLVVHODHQJHGHVNODUWHAWHVDEHUGDQQLVWHVHLQNLQGHUVSLHO")
						.toCharArray();

		char[] code = new char[26];
		code['A' - 'A'] = 'X';
		code['B' - 'A'] = 'Y';
		code['C' - 'A'] = 'Z';
		code['D' - 'A'] = 'A';
		code['E' - 'A'] = 'B';
		code['F' - 'A'] = 'C';
		code['G' - 'A'] = 'D';
		code['H' - 'A'] = 'E';// !
		code['I' - 'A'] = 'F';
		code['J' - 'A'] = 'G';
		code['K' - 'A'] = 'H';
		code['L' - 'A'] = 'I';
		code['M' - 'A'] = 'J';
		code['N' - 'A'] = 'K';
		code['O' - 'A'] = 'L';
		code['P' - 'A'] = 'M';
		code['Q' - 'A'] = 'N';
		code['R' - 'A'] = 'O';
		code['S' - 'A'] = 'P';
		code['T' - 'A'] = 'Q';
		code['U' - 'A'] = 'R';
		code['V' - 'A'] = 'S';
		code['W' - 'A'] = 'T';
		code['X' - 'A'] = 'U';
		code['Y' - 'A'] = 'V';
		code['Z' - 'A'] = 'W';

		for (int i = 0; i < cipher.length; i++) {
			System.out.print(code[cipher[i] - 'A']);

		}
	}

}
