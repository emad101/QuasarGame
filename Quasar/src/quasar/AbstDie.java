package quasar;

import java.util.*;

/**
 * @author 1algailanema
 * @version 1.0 abstact class to use for the dic game
 */

public abstract class AbstDie {
	/**
	 * All the variables for AbstDie class
	 * 
	 */
	private Random rand = new Random();// generate randum number
	private static int total; // ti caculate the total
	private int value; // to get the ammount
	private int upperbound; // maximum dic number
	private int lowerbound; // minimum die number
	int range = upperbound - lowerbound + 1;

	/**
	 * getter for upperbound
	 */
	public int getUpperbound() {
		return upperbound;
	}

	/**
	 * setter for upperbouund
	 */
	public void setUpperbound(int _upperbound) {
		this.upperbound = _upperbound;
	}

	/**
	 * getter for lowerbound
	 */
	public int getLowerbound() {
		return lowerbound;
	}

	/**
	 * setter for lowerbound
	 */

	public void setLowerbound(int _lowerbound) {
		this.lowerbound = _lowerbound;
	}

	/**
	 * getter for total ammount
	 */
	public int getTotal() {
		return total;
	}

	/**
	 * setter for int total
	 */
	public void setTotal(int _total) {
		total = _total;
	}

	/**
	 * getter for value
	 */
	public int getValue() {
		return value;
	}

	/**
	 * setter for value
	 */
	public void setValue(int value) {
		this.value = value;
	}

	/**
	 * getter for the randum number to die class
	 */
	public int getRand() {
		return rand.nextInt(upperbound - lowerbound + 1) + lowerbound;
	}

	/**
	 * setter for randum number for dic class
	 */
	public void setRand(Random rand) {
		this.rand = rand;
	}

	/**
	 * empty parameter const making the maximum and minimum value foe the first
	 * die
	 */
	public AbstDie() {
		upperbound = 8;
		lowerbound = 1;
		int range = upperbound - lowerbound + 1;
		value = rand.nextInt(range) + lowerbound;

	}

	/**
	 * const given two parameter
	 * 
	 * @param _up
	 */
	public AbstDie(int _up, int _low) {
		upperbound = _up;
		lowerbound = _low;
		int range = upperbound - lowerbound + 1;
		value = rand.nextInt(range) + lowerbound;

	}

	/**
	 * for the roll of the dic
	 */
	public abstract int roll();

	public abstract int roll(int _up, int _low);
}
