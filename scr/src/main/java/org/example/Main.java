package org.example;


public class Main {

    static final int _BoardLen_ = 8;
    static final boolean _White_ = false;
    static final boolean _Black_ = true;

    public static void main(String[] args)
    {
        //init board
        square[][] board;
        board = new square[_BoardLen_][_BoardLen_];

        boolean initColor = _White_;
        for(int i=0;i < _BoardLen_;i++){
            for(int j=0;j < _BoardLen_;j++) {

                board[i][j] = new square();
                board[i][j].color = initColor;
                initColor = !initColor;
            }
            initColor = !initColor;
        }
        org.example.board.drawBoard(board);
    }
}