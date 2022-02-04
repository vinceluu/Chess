package com.company;

import java.util.Scanner;
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
        }
        While loop pseudo code
        promptPlayer(){
            // flag
            Boolean completeTurn = false
            while !completeTurn{
                // get the row, col, dest_row, dest_col
                // if validMove()
                //     movePiece()
                //      completeTurn = true
                // else{
                    // do nothing
            }
        }
         */
        Board newBoard = new Board();
        newBoard.startGame();

        /*
        Board startGame()
        Requirements
        - User Inputs
            - Row
            - Col
        - White's Turn or Black's Turn
        Boolean playerTurn
        - White -> True
        - Black -> False
        While Loop (Boolean isGameOver)
        User Inputs

        Move Pawns
        - Requirements
            - What are you given?
                - CurrRow
                - CurrCol
                - DestRow
                - DestCol

        - Pawn class
            - Inherit Piece
                - Should not have an empty constructor
                    - Pawn has to have a type and a color
                    - assert that type == "P"
            - Boolean hasMoved
            - Function Boolean validPawnMove()
                - numSpaces moved (1 or 2 depending on hasMoved)
                - Can't move diagonally
        - Board -> Boolean validMove()
            - It needs to be a piece of your color (White should move white pieces)
            - Check the typ e of the piece (create getters)
            - Now you know it's a pawn -> Call validPawnMove()
                - If true
                    - movePiece()
                - else
                    - Invalid
       - Board -> movePiece()
           - Once you move a piece, the current Tile is empty

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

       What is the goal of validMove at the board level?
       - Check requirements at the board level (picking coordinates within the board)
       - Figure out the piece type
       - and then call the corresponding validPieceMove()

       validMove(currRow, currCol, destRow, destCol){
       Piece movingPiece = this.my_board[currRow][currCol].curr_piece;
       # check the dimensions of the board
       if !not in the dimensions{
          return false
       }
       this.my_board[currRow][currCol].curr_piece.type == "P"{
          if (Pawn)movingPiece.validPawnMove(currRow, currCol, destRow, destCol)
                return true
          else{
                return false
          }
      }
      else if this.my_board[currRow][currCol].curr_piece.type == "P"{

     _______________________________________________________________________________________________

     class Pawn
            hasMoved = false
            type = "P" (inherited)
            color = "B" or "W" (inherited)

            public Boolean validPawnMove(currRow, currCol, destRow, destCol){

                1. If it hasn't moved, 0 < num_spaces <= 2
                2. If it has moved, num_spaces == 1
                3. Cannot move diagonally

                How do you calculate num_spaces?
                1. abs(destRow - currRow) plausible, but be careful of backward inputs
                            or
                2. if this.color == "W"{
                        num_spaces = currRow - destRow

                      }
                      else{
                        num_spaces = destRow - currRow
                      }

               if !hasMoved {
                    if (num_spaces <= 0 or numSpaces > 2)
                        return false;
                        }
               if hasMoved {
                      if numSpaces != 1{
                        return false;
                        }


               How do you check if it's moved diagonally?
               if destCol != currCol{
                return false;
               }
              ____________________________________

              // You passed all checks, so this means it's a valid move
              if !hasMoved{
                  hasMoved = true
                  }
              return true;

              Board level
              - if there's a piece you're capturing
                - check validPawnCapture
                - Capturing an opposite colored piece
              - else:
                - check validPawnMove

                How do we check if the pawn moves through a piece?
                - Why at the board level?
                    - We have information about other pieces
                - Goal : To create a single function that accounts for all the pieces and whether or not they move through another piece
                    - VERTICAL
                    - HORIZONTAL
                    - DIAGONAL

                    if type == P{
                        if dest == EmptyPiece(){
                            if isValidPawnMove(){
                                if emptyPath("VERTICAL"){
                                    return true;
                        else{
                            if validPawnCapture{
                                return true;
                        return false;

                   if type == R{
                        if dest == EmptyPiece(){
                            if isValidRookMove(){
                                if emptyPath("VERTICAL") or emptyPath("HORIZONTAL"){
                                    return true;
                        else{
                            if validPawnCapture{
                                return true;
                        return false;

              public void emptyPath(currRow, currCol, destRow, destCol, String direction){
                    if direction.equals("VERTICAL"){
                        check logic here with for loop;

                    if direction.equals("HORIZONTAL"){
                        check logic here with for loop;
              Pawn level
              validPawnCapture
         */
    }
}
