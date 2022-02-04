package com.company;

import java.util.Scanner;

public class Board {

    final public Integer ROW_SIZE = 8;
    final public Integer COL_SIZE = 8;
    public Tile[][] myBoard = new Tile[ROW_SIZE][COL_SIZE];
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
                myBoard[row][col] = new Tile();
            }
        }
    }

    public void setupPieces(){
        for (int col = 0; col < this.COL_SIZE; col ++){
            myBoard[6][col] = new Tile(new Pawn("W", "P"));
        }
        myBoard[7][0] = new Tile(new Piece("W", "R"));
        myBoard[7][1] = new Tile(new Piece("W", "N"));
        myBoard[7][2] = new Tile(new Piece("W", "B"));
        myBoard[7][3] = new Tile(new Piece("W", "Q"));
        myBoard[7][4] = new Tile(new Piece("W", "K"));
        myBoard[7][5] = new Tile(new Piece("W", "B"));
        myBoard[7][6] = new Tile(new Piece("W", "N"));
        myBoard[7][7] = new Tile(new Piece("W", "R"));

        for (int col = 0; col < this.COL_SIZE; col ++){
            myBoard[1][col] = new Tile(new Pawn("B", "P"));
        }
        myBoard[0][0] = new Tile(new Piece("B", "R"));
        myBoard[0][1] = new Tile(new Piece("B", "N"));
        myBoard[0][2] = new Tile(new Piece("B", "B"));
        myBoard[0][3] = new Tile(new Piece("B", "Q"));
        myBoard[0][4] = new Tile(new Piece("B", "K"));
        myBoard[0][5] = new Tile(new Piece("B", "B"));
        myBoard[0][6] = new Tile(new Piece("B", "N"));
        myBoard[0][7] = new Tile(new Piece("B", "R"));
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
                System.out.print(" " + this.myBoard[row][col].currPiece.getPiece() + "  | ");
            }
            displayLines();
        }
        for (int col = 0; col < COL_SIZE; col++){
            System.out.print("   " + col + "   ");
        }
        System.out.println();
    }

    public void startGame(){
        while (!isGameOver) {
            printBoard();
            promptPlayer();
        }
    }

    public void promptPlayer(){
        Scanner playerInput = new Scanner(System.in);
        Integer currRow;
        Integer currCol;
        Integer destRow;
        Integer destCol;
        Boolean completePrompt = false;
        if (playerTurn) {
            System.out.println("White's turn.");
        }
        else{
            System.out.println("Black's turn.");
        }
        System.out.println("Please enter current piece row: ");
        currRow = playerInput.nextInt();
        System.out.println("Please enter current piece column: ");
        currCol = playerInput.nextInt();
        System.out.println("Please enter which row to move the piece: ");
        destRow = playerInput.nextInt();
        System.out.println("Please enter which column to move the piece: ");
        destCol = playerInput.nextInt();
        if (isValidMove(currRow, currCol, destRow, destCol)){
            movePiece(currRow, currCol, destRow, destCol);
            playerTurn = !playerTurn;
        }
        else{
            System.out.println("Invalid move.");
            promptPlayer();
        }

    }

    public Boolean isValidMove(Integer currRow, Integer currCol, Integer destRow, Integer destCol){
        Piece movingPiece = this.myBoard[currRow][currCol].currPiece;
        Piece destPiece = this.myBoard[destRow][destCol].currPiece;

        if (currRow < 0 || currRow > 7){
            return false;
        }
        if (currCol < 0 || currCol > 7){
            return false;
        }

        if (destRow < 0 || destRow > 7){
            return false;
        }
        if (destCol < 0 || destCol > 7){
            return false;
        }

        if ((movingPiece.getColor().equals("W") && !playerTurn) || movingPiece.getColor().equals("B") && playerTurn){
            System.out.println("Can't move opponent's piece.");
            return false;
        }
        if (movingPiece.type == "P"){
            if (((Pawn)movingPiece).isValidPawnMove(currRow, currCol, destRow, destCol)) {
                return true;
            }
            else if (((Pawn)movingPiece).isValidPawnCapture(currRow, currCol, destRow, destCol)){
                if (myBoard[destRow][destCol].isOccupied){
                    return true;
                }
            }
            else{
                return false;
            }
        }
        else{
            return false;
            // placeholder for other pieces
        }
        return false;
    }

    public void movePiece(Integer currRow, Integer currCol, Integer destRow, Integer destCol){
        Piece movingPiece = this.myBoard[currRow][currCol].currPiece;
        Piece destPiece = this.myBoard[destRow][destCol].currPiece;
        this.myBoard[destRow][destCol].currPiece = movingPiece;
        this.myBoard[currRow][currCol].currPiece = new EmptyPiece();
        }
}
