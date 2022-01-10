package com.company;
import java.util.Scanner;
public class Tile {

    Piece curr_piece;
    Boolean isOccupied = false;

    Integer my_int = 5; // Creating a variable that can hold integers, null


    public Tile(){
        this.curr_piece = new EmptyPiece();
    }

    public Tile(Piece new_piece){

        this.curr_piece = new_piece;
        this.isOccupied = true;
    }
}
