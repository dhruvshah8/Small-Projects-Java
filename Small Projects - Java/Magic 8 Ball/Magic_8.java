/*
 * Program: Magic 8 Ball 
 * Student Name: Dhruv Shah
 * Student Number: 597327
 * Description: This program will take a yes or no question from the user
 *              The program will then respond with one of it 16 pre recorded responses
*/




public class Magic_8
{
  public static void main(String[] args)
  {
    System.out.println("Welcome to the magic 8 Ball! \nI can asnwer any yes or no question for you.");
    
    // user question taken
    String quesstion = IBIO.inputString ("Enter a yes or no question for me to answer: ");
 
    // choose a random number to find the corresponding answer
    
    int num = (int)  (Math.random () * 16) + 1;
    
   // if statments coorresponding to the random number 
    
    if (num == 1)
      System.out.println("The outlook is not so good.");
    
    if (num == 2)
      System.out.println("You shouldnt count on it.");
    
    if (num == 3)
      System.out.println("My sources say no.");
    
    if (num == 4)
      System.out.println("It is without a doubt.");
    
    if (num == 5)
      System.out.println("Reply hazy. Try Again");
    
    if (num == 6)
      System.out.println("It is certain.");
    
    if (num == 7)
      System.out.println("My reply is no.");
   
    if (num == 8)
      System.out.println("As I see it, yes");
    
    if (num == 9)
      System.out.println("Most likely. ");
    
    if (num == 10)
      System.out.println("You may rely on it.");
    
    if (num == 11)
      System.out.println("It can not be predicted now.");
    
    if (num == 12)
      System.out.println("The outlook is good");
    
    if (num == 13)
      System.out.println("It is better not to tell you.");
    
    if (num == 14)
      System.out.println("It is very doubtful.");
    
    if (num == 15)
      System.out.println("Yes! Definitely.");
    
    if (num == 16)
      System.out.println("You should concentrate more and ask again.");
    //more responses can be added here ^
    

   System.out.println("Click Run to ask another question ");
    
    
  }//end main
}//end class Magic8


