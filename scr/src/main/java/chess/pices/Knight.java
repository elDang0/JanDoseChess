package chess.pices;

import chess.helpFunctions.Vars.ChessConstVariables;
import chess.helpFunctions.board.square;

public class Knight extends Ipiece implements ChessConstVariables {
    public int x;
    public int y;
    private final char symbol;
    private final boolean color;
    private char type = 'k';
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

    public Knight(int x, int y, boolean color){
        this.x = x;
        this.y = y;
        this.color = color;
        this.symbol = color ? _KNIGHT_BLACK_ : _KNIGHT_WHITE_;
    }
}
