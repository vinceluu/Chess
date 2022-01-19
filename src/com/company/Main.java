package com.company;

public class Main {

    public static void main(String[] args) {

        /*
        The goal is to create a Chess program

        Requirements:
        - Command Line Chess Program (No graphical component)

        Classes/Objects Overview
        - Board
            - Attributes
                - 64 Tiles to make up a board
                - Rows
                - Columns
                - Data Structure: 2d array Tiles
            - Functions
                - setupBoard
                - printBoard
        - Tile
            - Attributes
                - position
                - com.company.Piece
            - Functions
                - isValidMove()
                - isEmpty()
                - Move() -> purely use row, col
        - Piece Class -> String Black Bishop -> "BB" (Empty com.company.Piece -> "  ")
            - Attributes:
                - color
                    - Black: B
                    - White: W
                - type
                    - Pawn: P
                    - King: K
                    - Queen: Q
                    - Rook: R
                    - Knight: N
                    - Bishop: B
            - Function
                - setPiece()
                - getPiece()

        Setting up the rest of the board

        How do we move?
        - Scanner Inputs -> (curr_row, curr_col) -> (new_row, new_col)
        - Is the user input valid?
        - What type is the piece?
        - Is the move valid?
        - Is it capturing or is the tile empty?

        startGame(){
        while(notOver){
            promptPlayer()
            }
        }

        Recursive Pseudo code
        promptPlayer(){

            // get the row, col, dest_row, dest_col
            // if validMove()
            //     movePiece()
            // else{
            //     promptPlayer()

       While loop pseudo code

       Integer my_int;

       promptPlayer(){
          // flag
          Boolean completeTurn = false
          // local variables
          Integer currRow;
          Integer currCol;
          Integer destRow;
          Integer destCol;
          while !completeTurn{
            currRow = userInput1
            currCol = userInput2
            destRow = userInput3
            destCol = userInput4

            // if validMove(currRow, currCol, destRow, destCol)
            //     movePiece(currRow, currCol, destRow, destCol)
            //     completeTurn = true
            // else{
                // do nothing
          }
       }

       Board level
       public void movePiece(currRow, currCol, destRow, destCol){
            this.board[destRow][destCol].curr_piece = this.board[currRow][currCol].curr_piece
            this.board[currRow][currCol].curr_piece = new EmptyPiece()
       }


       (Biggest to lowest)
       Board 2d array
       Tile (each index of the 2d array)
       Piece
        - validPawnMove (each piece's validation)

       Board Class validMove()

       double my_double = 3.5;

       int my_int = (int)my_double;

       my_int -> 3



       What is the goal of validMove at the board level?
       - Check requirements at the board level (i.e. picking coordinates within the board)
       - Figure out the piece type
       - and then call the corresponding validPieceMove()

       validMove(currRow, currCol, destRow, destCol){
       # check the dimensions of the board
       if !not in the dimensions{
            return false
       }
       if this.my_board[currRow][currCol].curr_piece.type == "P"{
           if (Pawn)this.my_board[currRow][currCol].curr_piece.validPawnMove(currRow, currCol, destRow, destCol)
                return true
           else{
                return false
           }
       }
       elif this.my_board[currRow][currCol].curr_piece.type == "B"{
           if (Bishop)this.my_board[currRow][currCol].curr_piece.validBishopMove()
                return true
           else{
                return false
           }
           .
           .
           .
       }
       ____________________________________________________________________________________________

       class Pawn
            hasMoved = false
            type = "P" (inherited)
            color = "B" or "W" (inherited)


            public Boolean validPawnMove(currRow, currCol, destRow, destCol){

                1. If it hasn't moved, 0 < num_spaces <= 2
                2. If it has moved, num_spaces == 1
                3. Cannot move diagonally

                How do you calc num_spaces?
                    1. abs(destRow - currRow) plausible, but be careful of backward inputs
                    2.
                        if this.color == "W"{
                            num_spaces = currRow - destRow

                        }
                        else{
                            num_spaces = destRow - currRow
                        }

                if !hasMoved {
                    if numSpaces < 0 or num_spaces > 2
                        return false
                }
                if hasMoved {
                    if numSpaces != 1{

                        return false
                    }
                }
                How do you check if it's moved diagonally?
                if destCol != currCol{
                    return false
                }

                ___________________________________

                // Hey you passed all checks, so this means it's a valid move
                if hasMoved == false{
                    hasMoved = true
                }

                return true
            }



       }


        }

         */
        Board new_board = new Board();
    }
}
