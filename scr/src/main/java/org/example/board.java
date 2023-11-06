package org.example;

import java.sql.SQLOutput;

public  class board {
    static final int _BoardLen_ = 8;
    static final boolean _White_ = false;
    static final boolean _Black_ = true;

    public static void drawBoard(square board[][]){
        for(int i=0;i < _BoardLen_;i++) {
            for (int j = 0; j < _BoardLen_; j++) {
                if(board[i][j].color){
                    System.out.print("[#]");
                }else
                    System.out.print("[ ]");

            }
            System.out.print("\n");
        }
    }

}
