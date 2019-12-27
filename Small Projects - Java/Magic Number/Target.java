/*
 * Program: Narrowing the Target
 * Student Name: Dhruv Shah
 * Student Number: 597327
 * Description: This program will have a magic number in the code
 *              The user then will enter 2 numbers and the program will then tell the user if the number is higher or lower
*/


public class Target 
{
  public static void main(String[] args)
  {
    
    //below is the set magic number
    int magicNum = 30;
    
    
    System.out.println("I am thinking of a magic number! Lets try guessing it.");
    
    //take user inut of their guesses
    int num1 = IBIO.inputInt("Enter your first guess:  ");
    int num2 = IBIO.inputInt("Enter your second guess: ");
    
    //find larger and smaller number
    int  guess1 = Math.min (num1, num2);
    int guess2 = Math.max (num1, num2);
    
    //find the truth or false statments in comparison to magic number
    boolean res1 = guess1 <= magicNum;
    boolean res2 = guess2 >= magicNum;
    
    
    //print the results 
    System.out.println ("It is " + res1 + " that the magic number is equal to or more than " + guess1);                    
    System.out.println ("It is " + res2 + " that the magic number is equal to less than " + guess2);
    System.out.println ("Please try again! ");
     
    
    
  }
    
  }
  