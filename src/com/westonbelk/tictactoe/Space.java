package com.westonbelk.tictactoe;

public class Space {
	public static final int X_VALUE = 4;
	public static final int O_VALUE = 1;
	public static final int EMPTY_VALUE = 0;
	
	private int spaceValue = EMPTY_VALUE;
	
	
	
	/**
	 * Constructor to create an empty space.
	 */
	public Space () {

	}
	
	
	
	/**
	 * Sets the space to an X.
	 */
	public void setAsX () {
		spaceValue = X_VALUE;
	}
	
	
	
	/**
	 * Sets the space to an O.
	 */
	public void setAsO () {
		spaceValue = O_VALUE;
	}
	
	
	
	/**
	 * Clears the space.
	 */
	public void setAsEmpty () {
		spaceValue = EMPTY_VALUE;
	}
	
	
	
	/**
	 * Gets the numerical value of the space based on the character (X or O) it holds.
	 * 
	 * @return
	 */
	public int getValue () {
		return spaceValue;
	}
	
	
	
	public boolean checkEmpty() {
		return spaceValue == EMPTY_VALUE;
	}
	
	
	/**
	 * Gets the character present in the space for debugging purposes
	 * 
	 * @return Character (X or O) present in the space. Returns a space if empty.
	 */
	public String toString() {
		if (spaceValue == 4)
			return "[X]";
		else if (spaceValue == 1)
			return "[O]";
		else
			return "[ ]";
	}
}
