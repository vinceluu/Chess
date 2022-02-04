package com.company;

public class Pawn extends Piece {

    public Boolean hasMoved = false;
    public Integer numSpaces;

    public Pawn(String color, String type) {
        super(color, type);
    }

    public Boolean isValidPawnMove(Integer currRow, Integer currCol, Integer destRow, Integer destCol) {
        if (currRow == destRow) {
            return false;
        }

        if (this.color == "W") {
            numSpaces = currRow - destRow;
        } else {
            numSpaces = destRow - currRow;
        }

        if (!hasMoved) {
            if (numSpaces <= 0 || numSpaces > 2) {
                return false;
            }
        }
        if (hasMoved) {
            if (numSpaces != 1) {
                return false;
            }
        }

        if (destCol != currCol) {
            if (isValidPawnCapture(currRow, currCol, destRow, destCol)){
                return true;
            }
            else{
                return false;
            }
        }


        if (!hasMoved) {
            hasMoved = true;
        }
        return true;
    }

    public Boolean isValidPawnCapture(Integer currRow, Integer currCol, Integer destRow, Integer destCol){
        // for diagonal movement only
        if (this.color == "W") {
            numSpaces = currRow - destRow;
        }
        else {
            numSpaces = destRow - currRow;
        }

        if (Math.abs(destCol - currCol) == 1){
            if (numSpaces == 1){
                return true;
            }
        }
        return false;
    }
}



