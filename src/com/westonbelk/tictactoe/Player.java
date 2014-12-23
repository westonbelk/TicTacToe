package com.westonbelk.tictactoe;

public class Player {
	private String symbol;
	private int value;
	
	public Player(String symbol, int value) {
		this.symbol = symbol;
		this.value = value;
	}
	
	public Player() {
		
	}
	
	public String getSymbol() {
		return symbol;
	}
	
	public int getValue() {
		return value;
	}
}
