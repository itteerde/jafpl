package jafpl.euler;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Problem000067 extends EulerProblem {

	public static void main(String[] args) {
		int[][] numbers = readNumbers();
		printNumbers(numbers);
	}

	@Override
	public String solve() {
		int[][] numbers = readNumbers();
		printNumbers(numbers);
		System.out.println(Arrays.toString(numbers));

		return Integer.toString(1074);
	}

	private static void printNumbers(int[][] numbers) {
		for (int i = 0; i < numbers.length; i++) {
			System.out.println();
			for (int j = 0; j < numbers[i].length; j++) {
				System.out.print(numbers[i][j] + ", ");
			}
		}
	}

	private static int[][] readNumbers() {
		int[][] numbers = new int[100][];
		try {
			@SuppressWarnings("resource")
			BufferedReader in = new BufferedReader(new FileReader(new File("res/euler/p067_triangle.txt")));

			for (int i = 0; i < 100; i++) {
				numbers[i] = new int[i + 1];
				String line = null;
				line = in.readLine();
				StringTokenizer st = new StringTokenizer(line, " ");
				int j = 0;
				while (st.hasMoreTokens()) {
					numbers[i][j++] = Integer.parseInt(st.nextToken());
				}

			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return numbers;
	}

}
