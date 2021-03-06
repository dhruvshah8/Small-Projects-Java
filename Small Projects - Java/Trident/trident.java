/*
 * Program: Trident Program
 * Student Name: Dhruv Shah
 * Student Number:5 597327
 * Description: This program will collect input from the user of how they would like the trident to look
 *              The program will draw the trident according to the users information 
 *              The program calls 2 methods - welcome ( print the greeting)
 *                                          - print ( which prints the trident)
 *              The program also makes sure all of the users information is not greater than 10 
 *                   If it is then it will re ask the question 
 */


public class trident
{
  public static void main(String[] args)
  {
    new trident();   
  }
  
  public trident()
  {
    welcome();
    
    //new feature - asks the question again if the number is great that 10
    
    //t is the height of the prongs 
    int t = 15; //random number under 10 to keep running
    //this loop will make sure the number is under 10 
    while (t>10)
    {
      t = IBIO.inputInt("Enter the height of the prongs(from 1 - 10)");    
    }
    
    //s is the spacing between the prongs 
    int s = 15; //random number under 10 to keep running
    //this loop will make sure the number is under 10 
    while (s>10)
    {
      s = IBIO.inputInt("Enter the amount of lines between each prong (from 1 - 10)");    
    }
    
    //h is the height of the handle 
    int h = 15; //random number under 10 to keep running
    //this loop will make sure the number is under 10 
    while (h>10)
    {
      h = IBIO.inputInt("Enter the height of the handle you want (from 1 - 10)");    
    }
    
    // x is the amount of prongs the user wants 
    int x = 15; //random number under 10 to keep running
    //this loop will make sure the number is under 10 
    while (x>10)
    {
      x = IBIO.inputInt("Enter the amount of prongs you want (from 1 - 10)");    
    }
    
    //this method will print the trident using the given parameters 
    print(t, s, h, x);
    
  }
  
  public void welcome()
  {
    System.out.println("Helllo and welcome to the trident program.\nGive me the information, and I will draw it out for you"); 
  }
  
  public void print(int t, int s, int h, int x)
  {
    
    // w = the width of the trident 
    int w = (s*(x-1)) + x;
    
    
    //the prongs
    for ( int i =1; i<=t; i++)
    {
      for (int j=1; j<=(x-1); j++)
      {
        System.out.print("*");
        for(int m=1; m<=s; m++)
        {
          System.out.print(" "); 
        }
      }
      
      System.out.print("*\n");
    }
    
    //the width (base)
    for(int p =1; p<=w; p++)
    {
      System.out.print("*"); 
    }
    System.out.println("");
    
    //handle
    for (int k=1; k<=h; k++)
    {
      
      for(int q=1; q<=(w/2); q++)
      {
        System.out.print(" "); 
      }
      
      System.out.print("*\n");
      
    }
    
  }
  
  
  
}

//it should work :)