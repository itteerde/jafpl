package jafpl.chess;

public class Board {

	private char[][] position = { { 'R', 'K', 'B', 'Q', 'K', 'B', 'K', 'R' },
			{ 'P', 'P', 'P', 'P', 'P', 'P', 'P', 'P' }, { '.', '.', '.', '.', '.', '.', '.', '.' },
			{ '.', '.', '.', '.', '.', '.', '.', '.' }, { '.', '.', '.', '.', '.', '.', '.', '.' },
			{ '.', '.', '.', '.', '.', '.', '.', '.' }, { 'p', 'p', 'p', 'p', 'p', 'p', 'p', 'p' },
			{ 'r', 'k', 'b', 'q', 'k', 'b', 'k', 'r' }, };

	@Override
	public String toString() {
		StringBuffer s = new StringBuffer();
		for (int y = 7; y >= 0; y--) {
			for (int x = 0; x < 8; x++) {

				s.append(position[y][x]);
			}
			s.append("\n");
		}
		return s.toString();
	}

}
