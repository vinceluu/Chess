package com.company;

import java.util.Scanner;

public class Board {

    final public Integer ROW_SIZE = 8;
    final public Integer COL_SIZE = 8;
    Tile[][] my_board = new Tile[ROW_SIZE][COL_SIZE];
    public Boolean isGameOver = false;
    public Boolean playerTurn = true;

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
        my_board[7][0] = new Tile(new Piece("W", "R"));
        my_board[7][1] = new Tile(new Piece("W", "N"));
        my_board[7][2] = new Tile(new Piece("W", "B"));
        my_board[7][3] = new Tile(new Piece("W", "Q"));
        my_board[7][4] = new Tile(new Piece("W", "K"));
        my_board[7][5] = new Tile(new Piece("W", "B"));
        my_board[7][6] = new Tile(new Piece("W", "N"));
        my_board[7][7] = new Tile(new Piece("W", "R"));

        for (int col = 0; col < this.COL_SIZE; col ++){
            my_board[1][col] = new Tile(new Piece("B", "P"));
        }
        my_board[0][0] = new Tile(new Piece("B", "R"));
        my_board[0][1] = new Tile(new Piece("B", "N"));
        my_board[0][2] = new Tile(new Piece("B", "B"));
        my_board[0][3] = new Tile(new Piece("B", "Q"));
        my_board[0][4] = new Tile(new Piece("B", "K"));
        my_board[0][5] = new Tile(new Piece("B", "B"));
        my_board[0][6] = new Tile(new Piece("B", "N"));
        my_board[0][7] = new Tile(new Piece("B", "R"));
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
        System.out.print("  ");
        for (int col = 0; col < COL_SIZE; col ++) {
            System.out.print("-----| ");
        }
        System.out.println();
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

    public void startGame(){
        Scanner playerInput = new Scanner(System.in);

        while (this.isGameOver == false && this.playerTurn == true) {
            // White's turn while loop
            System.out.println("White's turn.");
            System.out.println("Please enter current piece row: ");
            String currWhitePieceRow = playerInput.nextLine();
            System.out.println("Please enter current piece column: ");
            String currWhitePieceColumn = playerInput.nextLine();
            System.out.println("Please enter which row to move the piece: ");
            String moveWhitePieceRow = playerInput.nextLine();
            System.out.println("Please enter which column to move the piece: ");
            String moveWhitePieceColumn = playerInput.nextLine();
            setPlayerTurn(false);
            while(this.isGameOver == false && this.playerTurn == false){
                // Black's turn while loop
                System.out.println("Black's turn.");
                System.out.println("Please enter current piece row: ");
                String currBlackPieceRow = playerInput.nextLine();
                System.out.println("Please enter current piece column: ");
                String currBlackPieceColumn = playerInput.nextLine();
                System.out.println("Please enter which row to move the piece: ");
                String moveBlackPieceRow = playerInput.nextLine();
                System.out.println("Please enter which column to move the piece: ");
                String moveBlackPieceColumn = playerInput.nextLine();
                setPlayerTurn(true);
                if (isGameOver){
                    break;
                }
            }
        if (isGameOver){
            break;
            }
        }

        }
    public void setPlayerTurn(Boolean newPlayerTurn){
        this.playerTurn = newPlayerTurn;
    }

    public void setIsGameOver(Boolean newIsGameOver){
        this.isGameOver = newIsGameOver;
    }
}
