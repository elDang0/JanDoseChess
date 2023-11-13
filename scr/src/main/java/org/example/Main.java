package org.example;


import java.io.IOException;

import static org.example.board.drawBoard;
import static org.example.board.initBoard;
import static org.example.board.move;


public class Main implements ChessConstVariables{

    public static void main(String[] args) throws IOException {
        //init board
        square[][] board;
        board = initBoard();

        boolean end = false;
        while (!end){
        drawBoard(board);
        board = move(board);
        }
    }
}