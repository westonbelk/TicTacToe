package com.westonbelk.tictactoe;

public class Game {
	

	public static void main (String[] args) {

		Board gameBoard = new Board();
		boolean done = false;
		PlayerArray players = new PlayerArray(new Player("x", Space.X_VALUE), new Player("o", Space.O_VALUE));
		
		
		players.randomPlayer();
		// Choose a random first player to go first
		
		gameBoard.displayBoard();
		// Print Initial Board
		
		
		// Start Game Loop
		while (!done) { 
			
			int spaceIndex = Input.getPosition(players.currentPlayer());	// Get the position where the player will attempt to go.

			if (gameBoard.isEmpty(spaceIndex)) {		// Makes sure the space is empty.
				// The space was empty so the space is filled and the player goes to the next one.
				gameBoard.setSpace(spaceIndex, players.currentPlayer().getSymbol());
				gameBoard.displayBoard();
				// We are showing the player the result of their successful turn.
				players.nextPlayer();
			}	
			else {
				// The space was taken by a player already. Repeat the player's turn
				System.out.println("Space Taken. Try another.");
			}


			
			if(gameBoard.checkWin()) {
				System.out.println(gameBoard.getWinner() + " wins!\n\n");
				done = true;
			} 
			else if (gameBoard.isFull()) {
				System.out.println("Tie");
				done = true;
			}
		}
	}
}
