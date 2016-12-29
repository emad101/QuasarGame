package quasar;

/**
package quasar;
 * @author 1algailanema
 *ask the user to enter his initial bit 
 *ask the user to pick one of the dice 
 *what ever the use get asks to roll again or stay 
 *if the player stay: if the number is less then fifteen then he lose and asks him to run again
 *if the player get any number between 15 to 20 reward him
 *if the number is more then 20 the player loses 
 *do while loop to repeat for five times
 */

/**
* 
*/
import java.util.*;

public class TurnDie {
	private static Die dieA = new Die();// calling die class
	private static double ammount = 500; // ammount of the user
	private static Scanner input = new Scanner(System.in);
	Player player;
	private static double bet;
	private int extra;
	private int riddle1;
	private int riddle2;
	private int riddle3;
	private int riddle4;


	/**
	 * getter for diea
	 */
	public static Die getDieA() {
		return dieA;
	}

	/**
	 * setter for diea
	 */
	public static void setDieA(Die dieA) {
		TurnDie.dieA = dieA;
	}

	/**
	 * getter of the ammount for the user
	 */
	public static double getAmmount() {
		return ammount;
	}

	/**
	 * setter for the ammount of the user
	 */
	public static void setAmmount(double ammount) {
		TurnDie.ammount = ammount;
	}

	/**
	 * getter for the scanner input
	 */
	public static Scanner getInput() {
		return input;
	}

	/**
	 * setter for the scanner input
	 */
	public static void setInput(Scanner input) {
		TurnDie.input = input;
	}

	/**
	 * setter for the player calss
	 */
	public Player getPlayer() {
		return player;
	}

	/**
	 * setter for the pklayer class
	 */
	public void setPlayer(Player player) {
		this.player = player;
	}

	/**
	 * getter for the ammountof bet
	 */
	public static double getBet() {
		return bet;
	}

	/**
	 * setter for the bet
	 */
	public static void setBet(double bet) {
		TurnDie.bet = bet;
	}

	/**
	 * holding the player calss in a static way
	 */
	public TurnDie() {
		player = new Player();
	}

	/**
	 * getter for the extra class
	 */
	public int getExtra() {
		return extra;
	}

	/**
	 * setter for extra class
	 */
	public void setExtra(int extra) {
		this.extra = extra;
	}

	/**
	 * getter for the first riddle
	 */
	public int getRiddle1() {
		return riddle1;
	}

	/**
	 * setter for the first riddle
	 */
	public void setRiddle1(int riddle1) {
		this.riddle1 = riddle1;
	}

	/**
	 * getter for the second riddle
	 */
	public int getRiddle2() {
		return riddle2;
	}

	/**
	 * setter for the second riddle
	 */
	public void setRiddle2(int riddle2) {
		this.riddle2 = riddle2;
	}

	/**
	 * getter for the third riddle
	 */
	public int getRiddle3() {
		return riddle3;
	}

	/**
	 * setter for the third riddle
	 */
	public void setRiddle3(int riddle3) {
		this.riddle3 = riddle3;
	}

	/**
	 * getter for the fourth riddle
	 */
	public int getRiddle4() {
		return riddle4;
	}

	/**
	 * setter for the fourth ridlw
	 */
	public void setRiddle4(int riddle4) {
		this.riddle4 = riddle4;
	}

	/**
	 * class that repeat the turn for the usder five times
	 */
	public void repeat() {
		for (int number = 0; number < 5; number++) {
			turn();
			player.setValueDie(0);
			ammount = bet;
		}
		System.out.println("your final ammount is " + ammount);
	}

	/**
	 * method for the challange where the user may be able to double his money
	 */
	public void extraMoney() {
		do {
			try {
				System.out.println(
						"want extra money\nanswer the following riddles to double your money\nbut if you answered one of the question wrong your will lose half of your money\nEnter (1) to go to the challange\nEnter (Any number) to keep your value as 500 and continue the game");
				extra = input.nextInt();
			} catch (Exception err) {
				System.out.println("invalid input\n");
				input.next();				
			}
		} while (extra == 0);
		if (extra == 1) {
			yes();
		} else {
			turn();
		}
	}

	/**
	 * if the user choose to take thge challange
	 */
	public void yes() {
		System.out.println("so you choose to do the challenge, ok lets begin\n");
		riddle1();

	}

	/**
	 * the first riddle
	 */
	public void riddle1() {
		do {
			try {

				System.out.println(
						"You're running a race and pass the person in 2nd place. What place are you in now?\nAnswer in number: First Place = 1, Second place = 2 ...");
				riddle1 = input.nextInt();
			} catch (Exception err) {
				System.out.println("invalid input\n");
				input.next();
			}
		} while (riddle1 == 0);
		if (riddle1 == 2) {
			System.out.println("Your answered the right answer\nnext quistion is\n");
			riddle2();

		} else {
			ammount = ammount / 2;
			System.out.println("Wrong answer, you lost half of your money, your ammount is " + ammount+"\n");
			turn();
		}
	}

	/**
	 * the second riddle
	 */
	public void riddle2() {
		do {
			try {
				System.out.println("5+3+2 = 151022\n9+2+4 = 183652\n8+6+3 = 482466\n5+4+5 = 202541\nTHEN ;\n7+2+5 = ?");
				riddle2 = input.nextInt();
			} catch (Exception err) {
				System.out.println("invalid input\n");
				input.next();
			}
		} while (riddle2 == 0);
		if (riddle2 == 143547) {
			System.out.println("Your answer is the right answer\nnext question is");
			riddle3();
		} else {
			ammount = ammount / 2;
			System.out.println("Wrong answer, you lost half of your money, your ammount is" + ammount+"\n");
			turn();
		}
	}

	/**
	 * the third riddle
	 */
	public void riddle3() {
		do {
			try {

				System.out.println(
						"Some months have 30 days, and some months have 31 days. How many have 28?\n answer in number one: 1 two:2 ...");
				riddle3 = input.nextInt();
			} catch (Exception err) {
				System.out.println("invalid input\n");
				input.next();
			}
		} while (riddle3== 0);
		if (riddle3 == 12) {
			System.out.println("Your answer is the right answer\nnext question is");
			riddle4();
		} else {
			ammount = ammount / 2;
			System.out.println("Wrong answer, you lost half of your money, your ammount is" + ammount +"\n");
			turn();
		}
	}

	/**
	 * the fourth riddle
	 */
	public void riddle4() {
		do {
			try {
				System.out.println(
						"Large number of people went to an party and they decided to make some fun at the bar.\nThe first person asks the barman for half a pint of beer.\nThe second person asks for a quarter pint of beer \nThe third person asks for one-eighth of beer and so on ...");
				riddle4 = input.nextInt();
			} catch (Exception err) {
				System.out.println("invalid input\n");
				input.next();
			}
		} while (riddle4 == 0);
		if (riddle4 == 1) {
			ammount = ammount * 2;
			System.out.println("Your answer is the right answer\nwell done\n");
			System.out.println("your ammount is doubled\nyour ammount is " + ammount+"\n");
			turn();

		} else {
			ammount = ammount / 2;
			System.out.println("Wrong answer, you lost half of your money, your ammount is" + ammount+"\n");
			turn();
		}
	}

	/**
	 * turn class that asks the user to eneter his bet and calls the player
	 * cases method
	 */
	public void turn() {

		do {
			try {

				System.out.println("please, Enter your initial bet\n ");
				TurnDie.bet = input.nextInt();

				if (bet > ammount) {
					System.out.println(" you can't take that much, please try again");
					bet = 0;

				}
			} catch (Exception err) {
				System.out.println(" invalid input");
				input.next();
			}
		} while (bet == 0);
		do {
			player.cases();

		} while (bet == 0);
	}

	/**
	 * result class that pay the user acording to his ammount of dic
	 */
	public void result() {
		double finalAmmount = (ammount - bet);
		if (player.getValueDie() < 15) {
			bet = finalAmmount;
			System.out.println("you lost all your bit, your total value is " + bet);
			return;
		} else if (player.getValueDie() == 15) {
			bet = bet * 0.25 + finalAmmount;
			System.out.println("your total will be increased by 0.25 \nyour total ammount is " + bet);
			return;
		} else if (player.getValueDie() == 16) {
			bet = bet * .50 + finalAmmount;
			System.out.println("your total will be increased by 0.50 \nyour total ammount is " + bet);
			return;
		} else if (player.getValueDie() == 17) {
			bet = bet * 1.00 + finalAmmount;
			System.out.println("your total will be increased by 1.00 \nyour total ammount is " + bet);
			return;
		} else if (player.getValueDie() == 18) {
			bet = bet * 1.25 + finalAmmount;
			System.out.println("your total will be increased by 1.25 \nyour total ammount is " + bet);
			return;
		}

		else if (player.getValueDie() == 19) {
			bet = bet * 1.50 + finalAmmount;
			System.out.println("your total will be increased by 1.50 \nyour total ammount is " + bet);
			return;
		} else if (player.getValueDie() == 20) {
			bet = bet * 2.00 + finalAmmount;
			System.out.println("your total will be increased by 2.00 \nyour total ammount is " + bet);
			return;
		} else {
			bet = finalAmmount;
			System.out.println("you lost all your bit, your total value is " + bet);
			return;
		}

	}

}
