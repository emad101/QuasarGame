/**
 * 
 */
package quasar;

/**
 * @author 1algailanema
 *
 */
public class Die extends AbstDie {

	/**
	 *setting value for the roll method
	 */
	public int roll() {
		// TODO Auto-generated method stub
		setValue(getRand());
		return getValue();
	}

	/**
	 * roll method for the dic to be used in the player class
	 */
	public int roll(int _up, int _low) {
		setUpperbound(_up);
		setLowerbound(_low);
		setValue(getRand());
		return getValue();
	}
}
