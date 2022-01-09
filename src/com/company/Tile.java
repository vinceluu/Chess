package com.company;

public class Tile {

    Piece curr_piece;
    Boolean isOccupied = false;

    Integer my_int = 5;


    public Tile(){
        this.curr_piece = new EmptyPiece();
    }

    public Tile(Piece new_piece){

        this.curr_piece = new_piece;
        this.isOccupied = true;
    }
}
