# JanDoseChess Progress

# 06.11.23

- init my Repos
- init my Project
- startet making first classes
  
  - [board](../scr/src/main/java/org/example/board.java) mainly the draw board funktions

    ```java
        public static void drawBoard(square board[][]){
        for(int i=0;i < _BoardLen_;i++) {
            for (int j = 0; j < _BoardLen_; j++) {
                if(board[i][j].color){
                    System.out.print("[#]");
                }else
                    System.out.print("[ ]");

            }
            System.out.print("\n");
        }
    }
    ```

  - [square](../scr/src/main/java/org/example/square.java)

    ```java
        public boolean color; //white = 0 Black = 1
        public boolean hasPece;
        public boolean peceColore; //white = 0 Black = 1

        square(){
            color = false;
            hasPece = false;
        }
        ```

  - [Main](../scr/src/main/java/org/example/Main.java)

    ```java
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
    ```

  - [piece](../scr/src/main/java/org/example/pice.java)
  
    ```java
        public int x;
        public int y;
        public abstract void move();
        public abstract void selected();
    ```

- write my [readme file](../README.md)

- # issues 
- 
- my main proplem with the code is that is defind some variables multibe times in diffarent classes

    ```java
        static final int _BoardLen_ = 8;
        static final boolean _White_ = false;
        static final boolean _Black_ = true;
    ```

may add a class just for those difines if i dont find a better way!
