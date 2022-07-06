/**
 * Conway's Game of Life by Room 12
 * Adam Driggers
 * collaborators: Tanya W adam d  Jing X  Yanique S
 */
import java.io.*;
import java.util.*;


/**
  The Rules of Life:
Survivals:
 * A living cell with 2 or 3 living neighbours will survive for the next generation.
Deaths:
 * Each cell with >3 neighbours will die from overpopulation.
 * Every cell with <2 neighbours will die from isolation.
Births:
 * Each dead cell adjacent to exactly 3 living neighbours is a birth cell. It will come alive next generation.
 NOTA BENE:  All births and deaths occur simultaneously. Together, they constitute a single generation.
 */

public class CgolLive{
  //create, initialize, and return  empty board (all cells dead)(live cells = 'X';dead cells = '-')
  public static char[][] createNewBoard( int rows, int cols )
  {
    char[][] board = new char [rows][cols];
    for(int i = 0; i < board.length; i++){
      for(int j = 0; j < board[0].length; j++){
        board[i][j] = '-';
      }
    }
    return board;
  }

  //print the board to the terminal with all dead cells
  public static void printBoard( char[][] board )
  {
    for (int i= 0; i< board.length; i++){
      for (int j = 0; j <board[0].length; j++){

        System.out.print(board[i][j] + " ");

      }
      System.out.println();
    }

  }

  //set cell (r,c) to val
  public static void setCell( char[][] board, int r, int c, char val )
  {
    board[r][c]=val;
  }


  //return number of living neigbours of board[r][c]
  public static int countNeighbours( char[][] board, int row, int col )
  {
    int count =0;
    //similar to explode
    for (int i = Math.max(0, row - 1); i <= Math.min(row + 1, board.length - 1); i++) {
      for (int j = Math.max(0, col - 1); j <= Math.min(col + 1, board[i].length-1); j++) {
        if (! (i == row && j == col)){ //excludes the center
          if (board[i][j] == 'X') {
            count ++;//see if the cell is alive, if so increase count
          }
        }
      }
    }
    return count;
  }

  /**
precond: given a board and a cell
postcond: return next generation cell state based on CGOL rules
(alive 'X', dead ' ')
*/

  // Survivals:
  //  * A living cell with 2 or 3 living neighbours will survive for the next generation.
  //  Deaths:
  //  * Each cell with >3 neighbours will die from overpopulation.
  //  * Every cell with <2 neighbours will die from isolation.
  //  Births:
  //  * Each dead cell adjacent to exactly 3 living neighbours is a birth cell. It will come alive next
  public static char getNextGenCell( char[][] board,int r, int c )
  {
    char nextGenCell = board[r][c]; //current value of at r,c
    int count = countNeighbours(board, r, c);////check the neighbors of r,c
    if (nextGenCell == 'X'){ //if cell is alive
      if (count < 2 || count >3){// too lonely or too crowded
        nextGenCell = '-';
      }

    } else { // dead cell
      if (count == 3){ //dead cell with three alive neighbors becomes alive
        nextGenCell = 'X';
      }
    }

    return nextGenCell;
  }


  //generate and return a new board representing next generation
  public static char[][] generateNextBoard( char[][] board )
  {

    char[][] nextGenBoard = copyBoard(board); //copy the current board for the next generation
    for (int i =0; i< board.length; i++){
      for (int j=0; j <board[0].length; j++){
        nextGenBoard[i][j] = getNextGenCell(board,i,j);
      }
    }

    //go through the current generations board
    //call next gen cell for each cell of current gen
    //assing value to the next generations board

    //return the board for the next generation

    return nextGenBoard;

  }

  public static char[][] copyBoard( char[][] original )
  {
    char [][] temp = new char [original.length][original[0].length];
    for (int i=0; i <original.length;i++){
      for (int j =0; j < original[0].length; j++){
        temp [i][j] = original [i][j];
      }
    }

    return temp;

  }

  //let's animate
  // pause for n milliseconds
  public static void delay(int n)
  {
    try {
      Thread.sleep(n);
    }
    catch(InterruptedException e) {}
  }

  public static void animate(int n)
  {
    //clear screen, place cursor at origin (upper left)

  }

  public static void main( String[] args )
  {
    char [][] board = createNewBoard(25,25);
    //random board initialization, could be it's own function!
    Random r = new Random();
    double prob = 0.5; //likilhood of being alive

    for(int i = 0; i < board.length; i++){ //loop over the entire board
      for(int j = 0; j < board[i].length; j++){

        double random = r.nextDouble(); //roll the dice, random between 0 and 1
        if(random >= prob){//if random is greater than likilhood
          setCell(board, i, j, 'X'); //start alive!
        }
        //else start dead, no need to do anyting
      }
    }

    int n = 0;

    while(true){
      // animate(g);
      // g++; //endless game loop, ctrl-c to escape
      System.out.print("[0;0H\n");
      System.out.println("Gen " + n + " : ");
      printBoard(board); //start by printing the prev generations board
      System.out.println("--------------------------\n\n");

      //update the board
      board = generateNextBoard(board);

      n++;
      delay(500);
    }
  }//end main()


}//end class

