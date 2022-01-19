package com.company;

public class Pawn extends Piece {
    Boolean hasMoved = false;

    public Pawn(String color, String type) {
        super(color, type);
    }

    public Boolean validPawnMove(Integer currRow, Integer currCol, Integer newRow, Integer newCol) {
        getColor();
        Integer num_spaces;

        if(getColor() == "B"){
            num_spaces = newRow - currRow;
        }

        else{
            num_spaces = currRow - newRow;
        }

        if(hasMoved == false){
            if(0 < num_spaces || num_spaces >= 2){
                return false;
            }
        }

        else{
            if(num_spaces != 1){
                return false;
            }
        }

        if(currRow != currCol){
            return false;
        }

        // If it passes the tests then it's a valid move

        if(hasMoved == false){
            hasMoved = true;
        }

        return true;


        /*
        pseudocode
        Inputs: currRow, currCol, newRow, newCol
        Color - B/W (we might need a getter)
        hasMoved = false

        1. If it's the first move, num_spaces <= 2
        2. if it's not the first move then it has to be 1
        3. it's only moving in a straight line

        num_spaces (difference between the rows)
        if (black){
            num_spaces = new_row - curr_row
        }
        else{
            num_spaces = curr_row - new_row
        }
        if (hasMoved == False){
            if (num_spaces not <= 2){
                return false
                }
        }
        else{
            if nums_spaces not == 1 {
                return false
            }
        }
        if curr_col != new_col{
            return false
        }
        _____ (we've checked everything -> it is a valid move)

        if hasMoved == False
            hasMoved = true

        return true;






        Output: true/false whether or not it is a valid Pawn move
         */







    /*
            - Pawn Class
            - Should not have an empty constructor
                - Pawn has to have a type and a color
            - Boolean hasMoved
            - Functiton that returns a Boolean valid PawnMoved
                - numSpaces moved (1 or 2 depending on hasMoved)
                - Can't move diagonally

                In the board class you check to see if the piece is a pawn
     */
    }
}