package org.example.pices;

import org.example.ChessConstVariables;

public class Rook extends Ipiece implements ChessConstVariables {
    public int x;
    public int y;
    private final char symbol;
    private final boolean color;
    private char type = 'R';
    @Override
    public char getSymbol(){ return symbol; }
    @Override
    public boolean getColor() {
        return color;
    }

    public Rook(int x, int y, boolean color){
        this.x = x;
        this.y = y;
        this.color = color;
        this.symbol = color ? _ROOK_BLACK_ : _ROOK_WHITE_;
    }
}
