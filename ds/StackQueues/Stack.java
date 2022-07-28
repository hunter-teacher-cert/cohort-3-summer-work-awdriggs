// You should implement the following methods

// A constructor with no parameters
// void push(int value) - add value to the top of the stack
// int pop() - remove and return the top value from the stack
// int top() - return but do not remove the top value from the stack
// boolean isEmpty() - return true of the stack is empty, false otherwise
// int size() - return the number of elements currently in the stack
// boolean isFull() - returns true if the stack is full, false otherwise - only implement this if you use an array for implementation

public class Stack{
    // Place private instance variables here
    private int[] stack;
    private int numElements;  
    // Place constructors here
    public Stack(int size){
      stack = new int[size];
      numElements = 0;//start with zero elements
    }

    // Place methods here
    public int pop(){
      int val = stack[numElements-1];
      stack[numElements-1] = 0;
      numElements--;
      return val;
    }

    public void push(int value){
      //this will prevent an error? Do we want just let the error happen?
      if(!isFull()){
        //same to add
        stack[numElements] = value; 
        numElements++;
      } else {
        //throw error
        System.out.println("Stack Overflow");    
      }
    }

    public int top(){
      // if(!isEmpty()){
      //   return stack[numElements-1];
      // } else  {
      //   return -9999999; //empty
      // }
      //could try to do some throw catch get at an error.

      return stack[numElements-1]; //runtime error?
    }

    public boolean isEmpty(){//make private?
      return numElements == 0; 
    }

    public int size(){ //make private?
      return numElements;
    }
   
    public boolean isFull(){ //make private?
      return numElements == stack.length;
    }
     
    public String toString(){
      String arrayString = "[";
      for(int i = 0; i < numElements; i++){
        arrayString += stack[i];
        if(i < numElements-1){
          arrayString += ", ";
        }
      }
       
      arrayString += "]";

      return arrayString;
    }
}

