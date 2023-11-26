package chess;


import chess.helpFunctions.Vars.ChessConstVariables;
import chess.helpFunctions.board.square;

import java.io.IOException;
import static chess.helpFunctions.board.board.initBoard;
import static chess.helpFunctions.board.board.move;
import static chess.helpFunctions.grafic.graficFunctions.drawBoard;


public class Main implements ChessConstVariables {

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