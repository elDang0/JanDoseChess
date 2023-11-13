package org.example;


import static org.example.board.drawBoard;
import static org.example.board.initBoard;


public class Main implements ChessConstVariables{

    public static void main(String[] args)
    {
        //init board
        square[][] board;
        board = initBoard();

        boolean end = false;
        while (!end){
        drawBoard(board);
        move();
        }
    }
}