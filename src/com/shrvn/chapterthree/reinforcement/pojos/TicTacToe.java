package com.shrvn.chapterthree.reinforcement.pojos;

public class TicTacToe {
    public final static int X = 1,O=-1,EMPTY=0,MAX_SIZE = 9;
    private int[][] board = new int[3][3];
    private int size = 0;
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
            size++;
        }
        player = -player;
        printStep();
    }

    private boolean isWin(int mark) {
        for (int i = 0; i < board.length; i++) {
            boolean xflag = true;
            boolean  yflag = true;
            for (int j = 0; j < board[i].length; j++) {
                if(board[i][j]==mark && xflag) {
                    xflag = true;
                }else {
                    xflag = false;
                }

                if(board[j][i]==mark && yflag) {
                    yflag = true;
                }else {
                    yflag = false;
                }
            }
            if(xflag || yflag) {
                return true;
            }
        }
        return false;
    }

    public int winner( ) {
        if (isWin(X)) return(X);
        else if (isWin(O)) return(O);
        else return(0);
    }

    /** Test run of a simple game */
    public static void main(String[ ] args) {
        TicTacToe game = new TicTacToe();
        /* X moves: */             /* O moves: */
        game.addStep(0,1);    game.addStep(1,2);
        game.addStep(2,1);    game.addStep(1,0);
        game.addStep(0,0);    game.addStep(1,1);
        game.addStep(2,0);    game.addStep(0,2);
        game.addStep(2,2);
    }

    private void printStep() {
        System.out.println(this);
        int winningPlayer = winner();
        String[] outcome = {"O wins", "Tie", "X wins"}; // rely on ordering
        if(winningPlayer == 0 && size!=MAX_SIZE) {
            System.out.println("Continue");
            return;
        }else {
            System.out.println(outcome[1 + winningPlayer]);
            System.exit(0);
        }
    }
    /**
     * Returns a simple character string showing the current board .
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                switch (board[i][j]) {
                    case X:  sb.append("X"); break;
                    case O:  sb.append("O"); break;
                    case EMPTY:  sb.append(" "); break;
                }
                if (j < 2) sb.append("|");

            }
            if (i < 2) sb.append("\n-----\n");

        }
        return sb.toString();

    }

}
