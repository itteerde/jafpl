package jafpl;

public class ShiftCrypt {

	public static void main(String[] args) {

		// String message =

		String message = "UVIERVTYJKVJTYIZKKZJKUVIRCCXVDVZEVQVZTYVEJLSJKZKLKZFEJRCXFIZKYDLJ";
		int k = 0;

		for (k = 0; k < 26; k++) {
			char[] cipher = message.toCharArray();

			for (int i = 0; i < cipher.length; i++) {
				cipher[i] = (char) (((cipher[i] + k - 'A') % 26) + 'A');
			}
			System.out.print(
					"k=" + (Integer.toString(k).length() < 2 ? " " + Integer.toString(k) : Integer.toString(k)) + ": ");
			System.out.println(cipher);

		}

	}

}
