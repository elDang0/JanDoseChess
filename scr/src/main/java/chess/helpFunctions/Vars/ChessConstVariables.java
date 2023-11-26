package chess.helpFunctions.Vars;

public interface ChessConstVariables {
    int _BoardLen_ = 8; // how many squares the board is long
    boolean _White_ = false; // The piece/square color is sored in a bool idk why
    boolean _Black_ = true;
    // allg Pieces
    char _KING_ = 'K';
    char _QUEEN_ = 'Q';
    char _ROOK_ = 'R';
    char _KNIGHT_ = 'k';
    char _PAWN_ = 'P';
    char _BISHOP_ = 'B';

    // White pieces
    char _KING_WHITE_ = '♔';
    char _QUEEN_WHITE_ = '♕';
    char _ROOK_WHITE_ = '♖';
    char _BISHOP_WHITE_ = '♗';
    char _KNIGHT_WHITE_ = '♘';
    char _PAWN_WHITE_ = '♙';
    // Black pieces
    char _KING_BLACK_ = '♚';
    char _QUEEN_BLACK_ = '♛';
    char _ROOK_BLACK_ = '♜';
    char _BISHOP_BLACK_ = '♝';
    char _KNIGHT_BLACK_ = '♞';
    char _PAWN_BLACK_ = '♟';
    String ANSI_RESET = "\u001B[0m";
    String ANSI_BLACK = "\u001B[30m";
    String ANSI_RED = "\u001B[31m";
    String ANSI_GREEN = "\u001B[32m";
    String ANSI_YELLOW = "\u001B[33m";
    String ANSI_BLUE = "\u001B[34m";
    String ANSI_PURPLE = "\u001B[35m";
    String ANSI_CYAN = "\u001B[36m";
    String ANSI_WHITE = "\u001B[37m";
    // Background
    String BLACK_BACKGROUND = "\033[40m";  // BLACK
    String RED_BACKGROUND = "\033[41m";    // RED
    String GREEN_BACKGROUND = "\033[42m";  // GREEN
    String YELLOW_BACKGROUND = "\033[43m"; // YELLOW
    String BLUE_BACKGROUND = "\033[44m";   // BLUE
    String PURPLE_BACKGROUND = "\033[45m"; // PURPLE
    String CYAN_BACKGROUND = "\033[46m";   // CYAN
    String WHITE_BACKGROUND = "\033[47m";  // WHITE

}