package com.shrvn.chapterone.reinforcement;

import com.shrvn.chapterone.reinforcement.pojos.GameEntry;

public class Reinforcement2 {
    public static void main(String[] args) {
        GameEntry[] game = new GameEntry[5];
        game[4] = new GameEntry();
        GameEntry[] gameClone = game.clone();
        game[4].setScores(550);
        System.out.println("Cloned copies has the same reference of the objects hence gameClone[4] has the value "+gameClone[4].getScores());
    }
}
