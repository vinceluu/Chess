package com.company;

public class Board {

    final public Integer ROW_SIZE = 8;
    final public Integer COL_SIZE = 8;
    Tile[][] my_board = new Tile[ROW_SIZE][COL_SIZE];
    public Boolean isGameOver = false;

    public Board(){
        setupBoard();
        setupPieces();
        printBoard();
    }

    public void setupBoard(){
        for (int row = 0; row < this.ROW_SIZE; row++){
            for (int col = 0; col < this.COL_SIZE; col++){
                my_board[row][col] = new Tile();
            }
        }
    }

    public void setupPieces(){
        for (int col = 0; col < this.COL_SIZE; col ++){
            my_board[6][col] = new Tile(new Piece("W", "P"));
        }
        // add queen

    }

    public void displayLines(){
        System.out.println();
        System.out.print("  ");
        for (int col = 0; col < COL_SIZE; col ++) {
            System.out.print("-----| ");
        }
        System.out.println();
    }

    public void printBoard(){
        System.out.println("Current Board: ");
        for (int row = 0; row < ROW_SIZE; row ++){
            System.out.print(row + " ");
            for (int col = 0; col < COL_SIZE; col++){
                System.out.print(" " + this.my_board[row][col].curr_piece.getPiece() + "  | ");
            }
            displayLines();
        }
        for (int col = 0; col < COL_SIZE; col++){
            System.out.print("   " + col + "   ");
        }
        System.out.println();
    }
}
