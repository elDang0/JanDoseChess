package chess.helpFunctions.grafic;

import chess.helpFunctions.Vars.ChessConstVariables;
import chess.helpFunctions.board.square;

public class graficFunctions implements ChessConstVariables {
    static public void printABC(){
        System.out.println("\u3000\u3000a\u3000\u2001b\u3000\u2001c\u3000\u2001d\u3000\u2001e\u3000\u2001f\u3000\u2001g\u3000\u2001h");
    }
    public static void drawBoard(square[][] board){
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
        graficFunctions.printABC();
    }
}
