package com.company;

public class Pawn extends Piece {

    public Boolean hasMoved = false;
    public Integer numSpaces;

    public Pawn(String color, String type) {
        super(color, type);
    }

    public void setHasMoved(Boolean hasMoved){
        this.hasMoved = !hasMoved;
    }

    public Boolean isValidPawnMove(Integer currRow, Integer currCol, Integer destRow, Integer destCol){
        if (this.color == "W"){
            numSpaces = currRow - destRow;
        }
        else{
            numSpaces = destRow - currRow;
        }

        if (!hasMoved){
            if (numSpaces <= 0 || numSpaces > 2){
                return false;
            }
        }
        if (hasMoved){
            if (numSpaces != 1){
                return false;
            }
        }

        if (destCol != currCol){
            return false;
        }

        if (!hasMoved){
            hasMoved = true;
        }
        return true;
    }




}



