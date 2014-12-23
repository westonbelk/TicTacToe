package com.westonbelk.tictactoe;

public class PlayerArray {

	private Player[] playerArray = new Player[2];
	private int index = 0;
	
	
	
	public PlayerArray(Player p1, Player p2) {
		playerArray[0] = p1;
		playerArray[1] = p2;
	}
	
	
	
	public void nextPlayer() {
		index++;
		
		if (index > playerArray.length-1)
			index = 0;
	}
	
	
	
	public void randomPlayer() {
		index = (int) Math.round(Math.random());
	}
	
	
	
	public Player currentPlayer() {
		return playerArray[index];
	}
	
}
