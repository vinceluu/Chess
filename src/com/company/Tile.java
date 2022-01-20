package com.company;
import java.util.Scanner;
public class Tile {

    public Piece currPiece;
    public Boolean isOccupied = false;

    public Tile(){
        this.currPiece = new EmptyPiece();
    }

    public Tile(Piece newPiece){

        this.currPiece = newPiece;
        this.isOccupied = true;
    }
}
