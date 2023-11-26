package chess.helpFunctions.board;

import chess.pices.Ipiece;

public class square {
    public boolean color; //white = 0 Black = 1
    public boolean peceColore; //white = 0 Black = 1
    public Ipiece currentPiece;

    square(){
        color = false;
    }
}
