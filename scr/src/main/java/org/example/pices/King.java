package org.example.pices;

import org.example.ChessConstVariables;

public  class King extends Ipiece implements ChessConstVariables {

    public int x;
    public int y;
    private final char symbol;
    private final boolean color;
    private char type = 'K';
    @Override
    public char getSymbol(){ return symbol; }
    @Override
    public boolean getColor() {
        return color;
    }

    public King(int x, int y,boolean color){
        this.x = x;
        this.y = y;
        this.color = color;
        this.symbol = color ? _KING_BLACK_ : _KING_WHITE_;
    }
}

