package quasar;

import java.util.Scanner;

/**
 * main class which tells the user the instraction and asks his name
 */
public class Quasar {
	static TurnDie turn;
	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 1;
		String hello = "a";
		turn = new TurnDie();
		do {
			try {
				System.out.println(
						"Welcome to Quasar game\nPlease choose an option\nEnter (i) to read the instrection\nEnter any key to play the game");
				hello = input.nextLine();
			} catch (Exception err) {
				System.out.println(" invalid input");
				input.next();
			}

		} while (i == 0);
		if (hello.equals("i")) {
			System.out.println(
					"Instrection:\nThis gmae is a gambling game, initaly your ammount will be 500\nYou will be able to roll the Dic as much as you want in order to get the value you want\nThe game has two dic, Dic A 4-7, Dic B 1-8\nThe player will be paid acourding to the ammount of Dic he ge\nThank you and enjoy playing\nDeveloper Emad\n\n");
			name();
		} else {
			name();
		}

	}

	/**
	 * asks the user for the name
	 */
	public static void name() {
		int i = 1;
		String name = "a";
		do {
			try {

				System.out.println("Please enter your name\nHint: Secret pass if you entered the developer name\n");
				name = input.nextLine();
			} catch (Exception err) {
				System.out.println(" invalid input");
				input.next();
			}
		} while (i == 0);
		if (name.equals("Emad") || name.equals("emad")) {
			turn.extraMoney();
		} else {
			turn.repeat();
		}
	}
}
