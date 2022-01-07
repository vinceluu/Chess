package com.company;

import com.company.Piece;

public class Tile {

    Piece curr_piece = null;
    Boolean isOccupied = false;


    public Tile(){
        this.curr_piece = new EmptyPiece();
    }

    public Tile(Piece new_piece){

        this.curr_piece = new_piece;
        this.isOccupied = true;
    }
}
