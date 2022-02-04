package com.company;
import java.util.Scanner;
public class Piece {
    public String color;
    public String type;

    public Piece(){
        this.color = " ";
        this.type = " ";
    }

    public Piece(String color, String type){
        this.color = color;
        this.type = type;
    }

    public String getPiece(){
        // W // K -> WK
        return this.color + this.type;
    }

    public String getColor(){
        return this.color;
    }

    public String getType(){
        return this.type;
    }

    public void setPiece(String newColor, String newType){
        this.color = newColor;
        this.type = newType;
    }
}
