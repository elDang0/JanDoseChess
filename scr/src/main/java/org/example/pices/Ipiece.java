package org.example.pices;

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
}

