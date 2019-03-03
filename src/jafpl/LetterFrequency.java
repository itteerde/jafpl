/**
 * 
 */
package jafpl;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.stream.Stream;

/**
 * @author Erik Itter
 *
 */
public class LetterFrequency {

	/**
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {
		Stream<String> in = Files.lines(Paths.get("res/faust.txt"));
		StringBuffer s = new StringBuffer();
		in.forEach(s::append);
		String text = s.toString().toUpperCase();

		int[] histogram = new int[26];
		for (int i = 0; i < text.length(); i++) {
			if (text.charAt(i) - 'A' >= 0 && text.charAt(i) - 'A' < 26) {
				histogram[text.charAt(i) - 'A']++;
			}
		}

		System.out.println(Arrays.toString(histogram));
	}

}
