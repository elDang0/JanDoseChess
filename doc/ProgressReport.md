# JanDoseChess Progress

## 06.11.23

- init my Repos
- init my Project
- startet making first classes
  
  - [board](../scr/src/main/java/org/example/board.java) mainly the draw board funktions

  - [square](../scr/src/main/java/org/example/square.java)

  - [Main](../scr/src/main/java/org/example/Main.java)

  - [piece](../scr/src/main/java/org/example/pice.java)
  
- write my [readme file](../README.md)

### Surces 07.11.23
  
- [chess characters](https://en.wikipedia.org/wiki/Chess_symbols_in_Unicode) ♙

- [defines](https://stackoverflow.com/questions/1927107/define-in-java)

### issues 07.11.23

- my main proplem with the code is that is defind some variables multibe times in diffarent classes

    ```java
     static final int _BoardLen_ = 8;
     static final boolean _White_ = false;
     static final boolean _Black_ = true;
    ```

may add a class just for those difines if i dont find a better way!

UPDATE: found someone on stackowerflow who did it like i sad with a class
in wich he had all is const variables: 

[scr](https://stackoverflow.com/questions/1927107/define-in-java)

```java
    public class Constants {
        public static final int INT_VALUE = 0;
        public static final DisplayValue VALUE = new DisplayValue("A");
    }

```

## 07.11.23

- Update to the [Problem](./ProgressReport.md#issues-071123).
  
  - I'm probably going to use interfaces and implement them in every class

- you can implement classes like this:

    ```java
    import static org.example.board.drawBoard;
    ```

## 13.11.23
