import java.io.*;
import java.util.*;

/* *
 * Array2DPractice by Team 2
 * Adam Driggers
 * collaborators: Dave Ciolino-Volano, Alise Braick, Stacy Goldstein
 */

/* *
INSTRUCTIONS:

Place this file in a folder named programming/3/.

This file contains the following completed method. Use it as a model
to help you with the other methods:

- buildBoard

This file also contains stubs (empty methods) for the following
methods (split into 3 levels):

Basic level (complete all):
- printBoard *
- copyBoard *

Intermediate level (complete Basic methods plus this method):
- explodeSquare *

Advanced level (complete Basic + Intermediate + these two methods):
- explodeAllChar *
- downString

The routines with the * will be particularly helpful for the
Conway's Game of Life project that you'll work on after this one.
*/


/* *
   creates and returns a 2D array of size rowsxcols chars. All elements
   in the 2D array will be set to the char value.

Ex: buildBoard(3,4,'x') will return this 2D array:

xxxx
xxxx
xxxx

Use this completed method as an example to help you with some of the
other methods.
*/

public class Array2DPractice
{
  public static char[][] buildBoard( int rows, int cols, char value )
  {
    char[][] board = new char[rows][cols];
    for (int i = 0; i < rows; i++) {
      for (int j = 0; j < cols; j++) {
        board[i][j]=value;
      }
    }
    return board;
  }

  /* *
     pretty prints a 2D array of characters

     This should print the array as a grid
     */
  public static void printBoard( char[][] board )
  {
    //hack?
    for(int i = 0; i < board.length; i++){
      System.out.println(board[i]);
    }

    System.out.println(); //starts a new line

    /*
    //standard nested for loops
    for (int i = 0; i < board.length; i++) { //loop through the the rows
    for (int j = 0; j < board[i].length; j++) { //loop through each column for each row
    System.out.print(board[i][j] + " "); //print each value
    }
    System.out.println(); //starts a new line
    }
    */
  }

  /*
Parameters:
board - a 2D array of char
row - the row you want to set
value - the value to set all the elements in row

Returns:
Nothing

Change the 2D array board so that all the elements in the
specified row are set to value.

Ex: Given array:
xxxx
xxxx
xxxx
xxxx

setRow(board,2,'@') will change board to
xxxx
xxxx
@@@@
xxxx
*/
  public static void setRow( char[][] board, int row, char value ){
    for(int i = 0; i < board[row].length; i++){
      board[row][i] = value;
    }
  }


  /* *
     creates and returns a new 2D array of char the same size as
     original and copies all the elements
     */
  public static char[][] copyBoard( char[][] original ){
    char[][] copy = new char[original.length][]; //initialize an array for copy with the num of rows

    for(int i = 0; i < copy.length; i++){
      copy[i] = new char[original[i].length]; //for each row, initialize the inner array with num of columns to match original
      for(int j = 0; j < copy[i].length; j++){
        copy[i][j] = original[i][j]; //copy the value into the same index of your copy
      }
    }
    return copy;
  }

  /* *
Parameters:
board - a 2D array of char
row,col - ints specifying a location in board

Returns:
nothing

A location in a 2D array can be though of as having 6
neighbors.  In the below 2D array, the neighbors of the element
marked Q are the numbered elements.

oooooo
o123oo
o4Q5oo
o678oo
oooooo

This method should change all the neighbor cells (elements) to an X
but not change the element at row,col

Ex:
Given the 2D array
QQQQQ
QQQQQ
QQQQQ
QQQQQ

explodeSquare(board,1,1) will change the array to
XXXQQ
XQXQQ
XXXQQ
QQQQQ

Note: Make sure to correctly handle the cases when you try
to explode an element on the edges.
*/
  public static void explodeSquare( char[][] board, int row, int col ){
    for(int i = row-1; i <= row + 1; i = i +1){ //only go through the part of the array we care about
      for(int j = col - 1; j <= col + 1; j = j+1){
        if(i != row || j != col){ //if the i not equal to row or j is not equal to col
          //before we try to change anything, lets make sure that i and j are valid indices
          if((i >= 0 && i < board.length) && (j >= 0 && j < board[i].length)){ //i and j must be greater than or equal to 0 and less than the length of the size of the board
            board[i][j] = 'X'; //change the value to X
          }
        }
        //System.out.print(i + " , " + j + " | ");
      }
      //System.out.println();
    }
  }

  /* *
     This method will search through the 2D array board and it will
     explode each square that contains the char c (using the above
     definition of exploding).

Example:

Given the array
qXzXq
qXXXq
qqqqq
XXXqq
XzXqq
XXXXX
qqqXz

explodeAllchar(board,'z') will change board to:
*/
  public static void explodeAllChar(char[][] board, char c)
  {
    //since it simultateously changes and checks will miss squares that were c befor they exploded, 
    char[][] prevBoard = copyBoard(board);
    
    //create a copy first and check the copy
    for(int i = 0; i < prevBoard.length; i++){
      for(int j = 0; j < prevBoard[i].length; j++){
        if(prevBoard[i][j] == c){
          explodeSquare(board, i, j);
        }
      }
    }
  }


  /*
Parameters:
board - a 2D array of char
row,col - ints specifying a location in board
word - a String that you want to insert into the board.

This will insert the parameter word into board in the downward
direction. See examples below

Example:

Given this array
xxxxxx
xxxxxx
xxxxxx
xxxxxx
xxxxxx
xxxxxx
xxxxxx

downString(board,1,1,"Hello") will change board to:

xxxxxx
xHxxxx
xExxxx
xLxxxx
xLxxxx
xOxxxx
xxxxxx

Given the above array, downString(board,4,3,"World") will
change board to:

xxxxxx
xHxxxx
xExxxx
xLxxxx
xLxWxx
xOxOxx
xxxRxx

Note that the method has to stop at the bottom of the array.
*/
  public static void downString( char[][] board, int row, int col, String word )
  {
    for(int i = row, c = 0; i < board.length && c < word.length(); i++, c++){
      // System.out.println("i: " + i + " " + c); 
      board[i][col] = word.charAt(c);
    }
    // for(int i = 0; i < word.length(); i++){
    //   System.out.println(word.charAt(i));
    // }
  }


  public static void main( String[] args ){
    char[][] b = buildBoard(5,10,'Z');
    printBoard(b);

    //set row tests
    // char [][] c = copyBoard(b);
    // setRow(c, 2, '@');
    // printBoard(c);

    //setup explodeAllChar test
    b[3][2] = 'Q';
    b[2][3] = 'Q';
    explodeAllChar(b, 'Q');
    //print after exploding
    printBoard(b);
   
    //down string!
    char[][] marquee = buildBoard(7, 6, '-');
    printBoard(marquee);
   downString(marquee,3,3,"World");
    printBoard(marquee);

  }
}


