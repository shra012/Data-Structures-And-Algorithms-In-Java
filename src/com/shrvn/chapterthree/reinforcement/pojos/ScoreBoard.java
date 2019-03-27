package com.shrvn.chapterthree.reinforcement.pojos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

/** Class for storing high scores in an array in nondecreasing order. */
public class ScoreBoard {
	private int numEntries = 0; // number of actual entries
	private GameEntry[] board; // array of game entries (names & scores)

	/**
	 * Constructs an empty scoreboard with the given capacity for storing entries.
	 */
	public ScoreBoard(int capacity) {
		board = new GameEntry[capacity];
	}

	public boolean addEntry(GameEntry entry) {
		int score = entry.getScore();

		if(numEntries < board.length || score > board[numEntries-1].getScore()) 
			if(numEntries < board.length)
				numEntries++;

		int j = numEntries-1;
		while(j>0 && board[j-1].getScore() < score) {
			board[j] = board[j-1];
			j--;
		}

		board[j] = entry;

		return true;
	}

	public GameEntry removeEntry(int score) {
		boolean matchFound = false;
		int matchIndex = 0;
		GameEntry result = null;
		for(int i=0;i<numEntries;i++) {
			if(board[i].getScore() == score && !matchFound) {
				matchFound = true;
				matchIndex = i;
				result = board[matchIndex];
				numEntries--;
			}
			if(matchFound) {
				if(numEntries>matchIndex) {
					board[matchIndex] = board[matchIndex+1];
					matchIndex++;
				}
			}
		}
		if(!matchFound) {
			System.out.println("Match Not Found For Score :"+score);
			return null;
		}
		board[numEntries] = null; 
		return result;
	}
	public static void main(String[] args) {
		ScoreBoard sb = new ScoreBoard(10);
		char[] a = {97,99,99,99,99,99,99,99,98,100,120};
		for(char i : a) {
			char[] name = {i};
			GameEntry entry = new GameEntry(new String(name), i);
			sb.addEntry(entry);
		}
		int[] c = {99,98,99,120,99,99};
		ArrayList<Integer> list = (ArrayList<Integer>) Arrays.stream(c).boxed().collect(Collectors.toList());
		list.forEach(s->sb.removeEntry(s));
		System.out.println(sb);

	}
	@Override
	public String toString() {
		return Arrays.toString(board);
	}

}
