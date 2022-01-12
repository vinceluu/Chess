# Chess Project

## Assignments

### 1. Set up the pieces
- In setupBoard(), fill out the rest of the chess pieces
### 2. Create turns
- In the Board Class, create a function startGame() that alternates between white and black turn prompting the user for inputs
  - Requirements
    - Boolean to keep track of player turn
    - Boolean to keep track of whether or not the game is over
    - While loop to continue looping while the game is not over
    - Promps for current piece row, current piece col and then desired destination row, destination column
### 3. Move Pawn
  - Requirements
    - What are you given?
      - CurrRow
      - CurrCol
      - DestRow
      - DestCol
    - Pawn Class
      - Inherit Piece
        - Should not have an empty constructor
          - Pawn has to have a type and a color
          - assert that type == "P"
      - Boolean hasMoved 
      - Function Boolean validPawnMove()
        - numSpaces moved (1 or 2 depending on hasMoved)
        - Can't move diagonally
    - Board -> Boolean validMove()
      - It needs to be a piece of your color (White should move white pieces) (optional)
      - Check the type of the piece (highly recommend creating getters)
      - Now you know it's a pawn -> validPawnMove()
        - If true
          - movePiece()
        - else
          - Invalid
    - Board -> movePiece()
        - Once you move a piece, the current Tile is empty
      


## Change History

### 1/9/2022
#### Changes
- Updated printBoard() command to include row, col coordinates and also fixed spacing

### 1/7/2022
#### Changes
- Tile class constructor now takes a Piece object instead of color, type
- Tile class now has new attribute "isOccupied" indicating if it is occupied or not
#### Added
- EmptyPiece now inherits from Piece parent class

