package chess.pices;

import chess.helpFunctions.Vars.ChessConstVariables;
import chess.helpFunctions.board.square;

public class Bishop extends Ipiece implements ChessConstVariables {
    public int x;
    public int y;
    private final char symbol;
    private final boolean color;
    private char type = 'B';
    @Override
    public char getSymbol(){ return symbol; }
    @Override
    public boolean getColor() {
        return color;
    }

    @Override
    public boolean valideMove(square[][] board, int x, int y, int ToX, int ToY) {
        return false;
    }

    public Bishop(int x, int y, boolean color){
        this.x = x;
        this.y = y;
        this.color = color;
        this.symbol = color ? _BISHOP_BLACK_ : _BISHOP_WHITE_;
    }
}
