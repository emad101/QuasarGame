package quasar;
/**
*player class that handles the user options of the dic and caculate the total value for the dic
*/
import java.util.Scanner;

public class Player {
	private TurnDie turn;
	/**
	 *enum use for the constant value of the dic and stay
	 */
	enum Cases {
		DIEA, DIEB, STAY, AGAIN
	};
	/**
	 *all of the variables are private and can not be changed
	 */
	private Cases dieTurn;
	private static int valueDie;
	private static int valueDie1;
	private static int valueDie2;
	Scanner input = new Scanner(System.in);
	private Die dieA = new Die();

	/**
	 *method that handle the option cases from the user for the dic
	 */
	public void cases() {

		int dieTurn1 = 0;
		do {
			do {
				
				try { // try so the user can only put int
					System.out.println(
							"please, Choose one option\npress 1: Dic 7-4\npress2: Dic 1-8\npress 3: keep result and caculate the ammount\n ");
					dieTurn1 = input.nextInt(); 
				} catch (Exception err) {
					System.out.println("invalid input\n");
					input.next();
				}
			} while (dieTurn1 == 0);
			/**
			 * swithc cases using enum for the input of the user
			 */
			switch (dieTurn1) { // begin of switch
			case 1:
				DicA();
				dieTurn = Cases.DIEA;
				break;
			case 2:
				DicB();
				dieTurn = Cases.DIEB;
				break;

			case 3:
				turn = new TurnDie();
				turn.result();
				dieTurn = Cases.STAY;
				return;
			default:
				dieTurn = Cases.AGAIN;
				System.out.println("lets try that again\n ");
				break;
			}

		} while (valueDie1 < 21);

	}
	/**
	 * Die of 7-4 and calculate the total 
	 */
	public void DicA() {
		valueDie2 = dieA.roll(7, 4);
		System.out.println("the dic is " + valueDie2);
		this.valueDie = this.valueDie + this.valueDie2;
		System.out.println("your total is " + valueDie + "\n ");
		return;
	}
	/**
	 * Die 1-8 and cacukate the total from the user
	 */
	public void DicB() {
		valueDie2 = dieA.roll(8, 1);
		System.out.println("the dic is " + valueDie2);
		valueDie = this.valueDie + this.valueDie2;
		System.out.println("your total is " + valueDie + "\n ");
		return;
	}
	/**
	 * getter of the value from the total that the user choose to get the result
	 */
	public int getValueDie() {
		return valueDie;
	}
	/**
	 * seeter for the value from the caculated value
	 */
	public void setValueDie(int valueDie) {
		Player.valueDie = valueDie;
	}
	/**
	 *setter of the turn class
	 */
	public TurnDie getTurn() {
		return turn;
	}
	/**
	 *getter of the turn class
	 */
	public void setTurn(TurnDie turn) {
		this.turn = turn;
	}
	/**
	 * getter for die turn
	 */
	public Cases getDieTurn() {
		return dieTurn;
	}
	/**
	 *settwr for die turn
	 */
	public void setDieTurn(Cases dieTurn) {
		this.dieTurn = dieTurn;
	}
	/**
	 * getterof the valuedie 1 which store the value of the die only
	 */
	public static int getValueDie1() {
		return valueDie1;
	}
	/**
	 *setter if valuedie 1
	 */
	public static void setValueDie1(int valueDie1) {
		Player.valueDie1 = valueDie1;
	}
	/**
	 * getter of valuedie 2 which gnerrate the randum number
	 */
	public static int getValueDie2() {
		return valueDie2;
	}
	/**
	 *setter of valuedie 2
	 */
	public static void setValueDie2(int valueDie2) {
		Player.valueDie2 = valueDie2;
	}
	/**
	 *getter of the scanner input class
	 */
	public Scanner getInput() {
		return input;
	}
	/**
	 *setter of the scanner input class
	 */
	public void setInput(Scanner input) {
		this.input = input;
	}
	/**
	 *  getter the randum number for the die class
	 */
	public Die getDieA() {
		return dieA;
	}
	/**
	 *setter for the randum number 
	 */
	public void setDieA(Die dieA) {
		this.dieA = dieA;
	}

}
