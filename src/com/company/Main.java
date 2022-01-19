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



         */
        Board new_board = new Board();
        new_board.startGame();


        /*
        in Board create startGame() function
        Requirements
        - User Inputs
            - Row
            - Col
        - White's Turn or Black's Turn
            - How to keep track:
                Boolean playerTurn
                    - White -> True
                    - Black -> False
                While loop
                    - Condition: Boolean isGameOver
                User Inputs



        Move Pawn
        - Pawn Class
            - Should not have an empty constructor
                - Pawn has to have a type and a color
            - Boolean hasMoved
            - Functiton that returns a Boolean valid PawnMoved
                - numSpaces moved (1 or 2 depending on hasMoved)
                - Can't move diagonally

        - Board -> Boolean validMove
            - It needs to be a piece of your color (Optional)
            - Check the type of the piece (highly recommend getting getters)
            - Now you know its a pawn -> call validPawnMove ()
                - If true
                    - movePiece()
                - else
                    - Invalid

        - Board -> movePiece()
            - Once you move a piece , the current Tile is empty

        - What are you given?
            - Current row (CurrRow), column (CurrCol), destination row (DesRow), and destination column (DestCol)


         */

    }
}
