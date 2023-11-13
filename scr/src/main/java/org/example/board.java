package org.example;

import org.example.pices.*;

import java.io.IOException;
import java.util.Scanner;

public  class board implements ChessConstVariables {
    public static void drawBoard(square[][] board) throws IOException{

        char nextDrawnPiece;
        String backGround;
        // i = down j = right
        for (int col = 0; col < _BoardLen_; col++) {
            System.out.print(col + 1 + " ");
            for (int row = 0; row < _BoardLen_; row++) {
                String color = (row + col) % 2 == 0 ? "47" : "100"; // background
                if (board[col][row].currentPiece != null) {
                    String symbol = String.valueOf(board[col][row].currentPiece.getSymbol());
                    String pieceColor = board[col][row].currentPiece.getColor() ? "97" : "30"; // color of piece
                    System.out.print("\u001B[" + color + ";" + pieceColor + "m " + symbol + " \u001B[0m");
                } else
                    System.out.print("\u001B[" + color + "m \u3000 \u001B[0m");

            }
            System.out.print("\n");
        }
        System.out.println("\u3000\u3000a\u3000\u2001b\u3000\u2001c\u3000\u2001d\u3000\u2001e\u3000\u2001f\u3000\u2001g\u3000\u2001h");
    }

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
/*    public square[][] select(square[][] board,int x,int y){
        board[x][y].currentPiece.
    }*/
    public static square[][] move(square[][] board) throws IOException {
        Scanner myObj = new Scanner(System.in);

        System.out.println("       x");
        System.out.print("Select:");
        int x = myObj.nextInt()-1;
        System.out.println("       y");
        System.out.print("Select:");
        int y = myObj.nextInt()-1;

        System.out.println("   x");
        System.out.print("to:");
        int xTo = myObj.nextInt()-1;
        System.out.println("   y");
        System.out.print("to:");
        int yTo = myObj.nextInt()-1;

    Ipiece piece = board[x][y].currentPiece;
    board[xTo][yTo].currentPiece = piece;
    board[x][y].currentPiece = null;

    return board;
    }
}


