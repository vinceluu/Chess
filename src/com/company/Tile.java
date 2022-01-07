package com.company;

import com.company.Piece;

public class Tile {

    Piece curr_piece;

    public Tile(){
        this.curr_piece = new Piece();
    }

    public Tile(String color, String type){
        this.curr_piece = new Piece(color, type);
    }
}
