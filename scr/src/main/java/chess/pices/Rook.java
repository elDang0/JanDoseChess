package chess.pices;

import chess.helpFunctions.Vars.ChessConstVariables;
import chess.helpFunctions.board.square;

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


    private boolean checkSquare(square s, boolean color){
        if(s.currentPiece != null){
            return true;
        }else
            return false;
    }
    @Override
    public boolean valideMove(square[][] board, int x, int y, int ToX, int ToY) {
        boolean c = board[x][y].currentPiece.getColor();
        if((x-ToX)+(y-ToY) == 0)
            return false;
        if(x > 7 || x < 0 || y > 7 || ToX > 7 || ToX < 0 || ToY > 7 || ToY < 0)
            return false;
        if (x == ToX ) {
            do {
                if (y > ToY)
                    y--;
                else
                    y++;
                if (!checkSquare(board[x][y],c))
                    return false;
            }while (y!=ToY);
        }else {
            do {
                if (x > ToX)
                    x--;
                else
                    x++;
                if (!checkSquare(board[x][y],c))
                    return false;
            }while (x!=ToX);
        }
        return board[x][y].currentPiece == null || board[x][y].currentPiece.getColor() != c;
    }

    public Rook(int x, int y, boolean color){
        this.x = x;
        this.y = y;
        this.color = color;
        this.symbol = color ? _ROOK_BLACK_ : _ROOK_WHITE_;
    }

}
