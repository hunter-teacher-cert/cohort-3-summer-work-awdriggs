/**
 * Conway's Game of Life by Room 12
 * Adam Driggers
 * collaborators: Tanya W	adam d	Jing X	Yanique S
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

public class Cgol{
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


  public static void main( String[] args )
  {
    
    char [][] board = createNewBoard(25,25);
    //printBoard(board);
    // setCell(board, 0, 0, 'X');
    // setCell(board, 0, 1, 'X');
    // setCell(board, 1, 0, 'X');
    // setCell(board, 3, 2, 'X');

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
    

    //tests for Get
    // System.out.println(getNextGenCell(board, 1, 1)); //test birth, expect to give us an X
    // System.out.println(getNextGenCell(board, 2, 3)); //test birth, expect to give us an -
    // System.out.println(getNextGenCell(board, 0, 0)); //test survival, expect an X

    //quick test of board copy
    // System.out.println("testing board copy");
    // System.out.println("--------------------------\n\n");
    // board = generateNextBoard(board);

    //test 10 generations
    for(int i = 0; i <= 5; i++){
      //i is generation number
      System.out.println("Gen " + i + " : ");
      printBoard(board); //start by printing the prev generations board
      System.out.println("--------------------------\n\n");

      //update the board
      board = generateNextBoard(board);
    }
    
    /*~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    char[][] board;
    board = createNewBoard(25,25);
    //breathe life into some cells:
    setCell(board, 0, 0, 'X');
    setCell(board, 0, 1, 'X');
    setCell(board, 1, 0, 'X');
    // TASK:
    // Once your initial version is running,
    // try out different starting configurations of living cells...
    // (Feel free to comment out the above three lines.)
    System.out.println("Gen X:");
    printBoard(board);
    System.out.println("--------------------------\n\n");
    board = generateNextBoard(board);
    System.out.println("Gen X+1:");
    printBoard(board);
    System.out.println("--------------------------\n\n");
    ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
  }//end main()


}//end class

