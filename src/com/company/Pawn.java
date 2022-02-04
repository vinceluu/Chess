package com.company;

public class Pawn extends Piece {

    public Boolean hasMoved = false;
    public Integer numSpaces;

    public Pawn(String color, String type) {
        super(color, type);
    }

    public Boolean isValidPawnMove(Integer currRow, Integer currCol, Integer destRow, Integer destCol){
        if (currRow == destRow){
            return false;
        }

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

        if (destCol != currCol) {
            return false;
        }
                //(destRow + 1 && destCol + 1) || (destRow + 1 && destCol - 1)
        // if there is a piece on destRow + 1 && destCol +/- 1 for white, return true
        // if there is a piece on destRow - 1 && destCol +/- 1 for black, return true
//        if (isValidPawnCapture(currRow, currCol, destRow, destCol)){
//            return true;
            // placeholder for capturing
//        }

        if (!hasMoved){
            hasMoved = true;
        }
        return true;

//    public Boolean isDestPieceOccupied(Integer destRow, Integer destCol) {
//        if (Tile(Piece){
//            return true;
//        }
//        else{
//            return false;
//        }
    }
//    public Boolean isValidPawnCapture(Integer currRow, Integer currCol, Integer destRow, Integer destCol){
//        if (this.color == "W") {
//            if ((currRow - destRow == 1) && (Math.abs(destCol - currCol) == 1) && isDestPieceOccupied(destRow, destCol)){
//                return true;
//        }
//        }
//    }


}



