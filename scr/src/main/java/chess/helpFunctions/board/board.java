package chess.helpFunctions.board;

import chess.helpFunctions.Vars.ChessConstVariables;
import chess.pices.*;
import chess.helpFunctions.grafic.*;

import java.util.Scanner;

public  class board implements ChessConstVariables {
    public static square[][] initBoard() {
        square[][] board;
        board = new square[_BoardLen_][_BoardLen_];

        boolean initColor = _White_;
        for (int i = 0; i < _BoardLen_; i++) {
            for (int j = 0; j < _BoardLen_; j++) {

                board[i][j] = new square();
                board[i][j].color = initColor;
                initColor = !initColor;

                boolean color;
                if(i == 0 || i == 1)
                    color = _White_;
                else
                    color = _Black_;
                if(i == 0 || i == 7) {
                    switch (j) {
                        case 0, 7 -> board[i][j].currentPiece = new Rook(i, j, color);
                        case 1, 6 -> board[i][j].currentPiece = new Knight(i, j, color);
                        case 2, 5 -> board[i][j].currentPiece = new Bishop(i, j, color);
                        case 3 -> board[i][j].currentPiece = new King(i, j, color);
                        case 4 -> board[i][j].currentPiece = new Queen(i, j, color);
                        default -> throw new IllegalStateException("Unexpected value: " + j);
                    }
                } else if (i == 1 || i == 6) {
                    board[i][j].currentPiece = new Pawn(i,j,color);
                }

                initColor = !initColor;
            }
        }
        return board;
    }
    public static int[] selectImput(){
        Scanner myObj = new Scanner(System.in);

        int[] xyToxToy = new int[4];

        System.out.println("       x");
        System.out.print("Select:");
        xyToxToy[0] = myObj.nextInt()-1;
        System.out.println("       y");
        System.out.print("Select:");
        xyToxToy[1]  = myObj.nextInt()-1;

        System.out.println("   x");
        System.out.print("to:");
        xyToxToy[2]  = myObj.nextInt()-1;
        System.out.println("   y");
        System.out.print("to:");
        xyToxToy[3] = myObj.nextInt()-1;

        return xyToxToy;
    }

    /*public square[][] select(square[][] board,int x,int y){
        board[x][y].currentPiece.valideMove()
    }*/
    public static square[][] move(square[][] board) {
        int x;
        int y;
        int ToX;
        int ToY;
        do {
            int[] xyToxToy = selectImput();
            x = xyToxToy[0];
            y = xyToxToy[1];
            ToX = xyToxToy[2];
            ToY = xyToxToy[3];
        } while (!board[x][y].currentPiece.valideMove(board,x,y,ToX,ToY));

        board[ToX][ToY].currentPiece = board[x][y].currentPiece;
        board[x][y].currentPiece = null;

        return board;
    }


}


