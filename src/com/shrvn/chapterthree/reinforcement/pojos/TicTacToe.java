package com.shrvn.chapterthree.reinforcement.pojos;

public class TicTacToe {
	public static int X = 1,O=-1,EMPTY=0;
	private int[][] board = new int[3][3];
	private int player;
	public TicTacToe() {clearBoard();}
	public void clearBoard( ) { 
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[i].length; j++) {
				board[i][j] = EMPTY;
			} 
		}
		player=X;
	}

	private void addStep(int i,int j){
		if( ( i<0 || j<0 ) && ( i>board.length || j>board[i].length ) ) throw new IllegalArgumentException("Invalid Board Position");
		if(board[i][j]!=EMPTY) throw new IllegalArgumentException("Board Position Already Filled");
		if(board[i][j]==EMPTY) {
			board[i][j] = player;
		}
		player = -player;
	}
	
	private boolean isWin(int mark) {
		for (int i = 0; i < board.length; i++) {
			boolean win = false;
			for (int j = 0; j < board[i].length; j++) {
				if(board[i][j]==mark) {
					win = true;
				}else {
					win = false;
				}
			}
			if(win) {
				return true;
			}
		}
		return false;
	}
}
