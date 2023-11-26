package chess.pices;

import chess.helpFunctions.board.square;

public abstract class Ipiece {
    public int x;
    public int y;
    private char symbol;
    private char type;
    private boolean color;

    protected Ipiece() {
    }

    private char getType(){
        return type;
    }
    public char getSymbol(){
        return symbol;
    }
    public boolean getColor(){
        return color;
    }
    public abstract boolean valideMove(square[][] board, int x, int y, int ToX, int ToY);


}

