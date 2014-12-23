package com.westonbelk.tictactoe;

public class Board {
    public static final Space[] EMPTY_BOARD = {new Space(), new Space(), new Space(), new Space(), new Space(), new Space(), new Space(), new Space(), new Space()};
    private String winner = "";
    private Space[] board = EMPTY_BOARD;
    private int[][] possibleMoves = {{0,3,6} , {1,4,7} , {2,5,8} , {0,1,2} , {3,4,5} , {6,7,8} , {0,4,8} , {2,4,6}};
    
    
    
    /**
     * Constructor for an empty board.
     */
    public Board () {

    }
    
    
    
    /**
     * Constructor for a predefined board. If the board does not have a valid number of spaces, an empty board is created instead.
     * 
     * @param board Board to be set.
     */
    public Board (Space[] board) {
        if (board.length == 9)
            this.board = board;
        else {
            System.out.println("Invalid Number of Spaces on Board.");
            System.out.println("Creating Empty Board Instead.");
            this.board = EMPTY_BOARD;
        }
    }
    
    /**
	 * Gets the value of an individual space
	 */
	public int getValue(int position) {
		return board[position].getValue();
	}
	
	
	
	/**
	 * Checks if the current space is empty or not.
	 */
	public boolean isEmpty(int position) {
		return board[position].getValue() == Space.EMPTY_VALUE;
	}
    
	
	
    /**
     * Determines if there is a winner.
     * 
     * @return Winner
     */
    public boolean checkWin() {
        for (int i = 0; i < possibleMoves.length; i++) {
            int[] currentMoves = possibleMoves[i];
            int sum = 0;
            
            sum += board[currentMoves[0]].getValue();
            sum += board[currentMoves[1]].getValue();
            sum += board[currentMoves[2]].getValue();
            
            if (sum == 12) {
				winner = "X";
                return true;
				}
				
            else if (sum == 3) {
				winner = "O";
                return true;
				}
        }
        
        return false;
    }

	
	
    /** 
     * 
     * @return winner
     */
    public String getWinner() {
		return winner;
    }
	
    
    
    /**
     * Sets a position on the board to the specified character.
     * 
     * @param position The integer representation of a position on the board.
     * @param character The string representation of the piece (X or O) that will go in the space.
     */
    public void setSpace (int position, String character) {

        if (position < 0  || position > 9)
            System.out.println("Invalid Position");
        
        if (character.equalsIgnoreCase("x"))
            board[position].setAsX();
        else if (character.equalsIgnoreCase("o"))
            board[position].setAsO();
        else
            System.out.println("Invalid Character at Position " + position);
    }
    
    
    
    public boolean isFull() {
    	for (int i = 0; i < board.length; i++) {
    		if(isEmpty(i))
    			return false;
    	}
    	return true;
	}
    
    
    
    /**
     * Prints a visual representation of the current state of the board
     * 
     */
    public void displayBoard() {
        String out = "";
        
        for (int i = 0; i < board.length; i++) {
            out += board[i].toString();
            out += " ";
            
            if (i == 2 || i == 5)
                out += "\n";
        }
        System.out.println(out);
    }
    
}
