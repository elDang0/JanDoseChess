package org.example.pices;

import org.example.ChessConstVariables;

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

    public Knight(int x, int y, boolean color){
        this.x = x;
        this.y = y;
        this.color = color;
        this.symbol = color ? _KNIGHT_BLACK_ : _KNIGHT_WHITE_;
    }
}
