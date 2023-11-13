package org.example.pices;

import org.example.ChessConstVariables;

public class Pawn extends Ipiece implements ChessConstVariables {

    public int x;
    public int y;
    private final char symbol;
    private final boolean color;
    private char type = 'p';
    @Override
    public char getSymbol(){ return symbol; }
    @Override
    public boolean getColor() {
        return color;
    }

    public Pawn(int x, int y,boolean color){
        this.x = x;
        this.y = y;
        this.color = color;
        this.symbol = color ? _PAWN_BLACK_ : _PAWN_WHITE_;
    }
}
