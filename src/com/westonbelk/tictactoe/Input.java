package com.westonbelk.tictactoe;

import java.util.*;

public class Input {
	private static Scanner input = new Scanner(System.in);
	
	
	public static int getPosition(Player player) {
		System.out.println("Where do you want " + player.getSymbol() + "?");
		while (true) {
			int in = askInt();

			if (in <= 9 && in >= 1)
				return convertNumpad(in);
		}
	}


	private static int askInt() {
		while (!input.hasNextInt())
			input.next();

		return input.nextInt();
	}



	/**
	 * Convert the values on the numpad to that of the index on the board.
	 * @param num
	 * @return index of position on numpad.
	 */
	private static int convertNumpad(int num) {
		switch (num) {
		case 7:
			return 0;
		case 8:
			return 1;
		case 9:
			return 2;
		case 4:
			return 3;
		case 5:
			return 4;
		case 6:
			return 5;
		case 1:
			return 6;
		case 2:
			return 7;
		case 3:
			return 8;
		default:
			return -1;
		}
	}
}
