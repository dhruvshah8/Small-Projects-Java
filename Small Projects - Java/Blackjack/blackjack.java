public class blackjack
{
  public static void main(String[] args)
  {
    //new feature - prompt user and explain rules 
    System.out.println("+-+-+-+-+-+-+-+-+-+ ");
    System.out.println("|B|l|a|c|k|J|a|c|k|");
    System.out.println("+-+-+-+-+-+-+-+-+-+");
    System.out.println("Welcome to the BlackJack Table\n");
    System.out.println("Here are the rules to the game: \nYou will get two cards. \nThe goal is to get the sum of the cards closest to 21 without going over. \nYou will be versing the dealer.");
    
    //new feature - Custom ASCII ART 
    
    System.out.println(" _______    _______ "); 
    System.out.println("|A  .   |  |10 ^   |");
    System.out.println("| / . \\ |  | ^ ^ ^ |");
    System.out.println("|(__.__)|  | ^ ^ ^ |");
    System.out.println("|   |   |  | ^ ^ ^ |");
    System.out.println("|______V|  |_____0I|  \n");   
    
    
    //new feature - ask user if they would like to continue to play 
    char cont = IBIO.inputChar("Would You like to to play?(y/n): ");
    
    if (cont == 'n' || cont == 'N')
    {
      System.out.println("Thank you for coming. \nHave a nice day.");
    } 
    
    else {
      
      
      {
        //deal  users cards
        int card1 = (int)(Math.random()*9)+ 2; // with this method it will control the random number to any int between 2 - 11
        int card2 = (int)(Math.random()*9)+2;
        int sum1 = card1 + card2;
        
        //deal dealers cards
        int card1D = (int)(Math.random()*9)+ 2;
        int card2D = (int)(Math.random()*9) + 2;
        int sum1D = card1D + card2D;
        
        //declaring other used variables 
        
        //new card 
        int newCard;
        int newCardD;
        //number of new cards 
        int run = 2;
        int runD = 2;
        
        //users cards presented 
        System.out.println("Your cards are a " + card1 + " and a " + card2);
        System.out.println("Your sum so far is " + sum1);
        
        System.out.println("");
        
        //dealer cards presented 
        System.out.println("The dealer cards are " + card1D + " and a " + card2D);
        System.out.println("The dealer's sum so far is " + sum1D);
        
        //check if player won (has 21)
        if (sum1 == 21)
        {
          System.out.println("Congragulation! You win!");
        } 
        
        else {
          
          //this will run the loop
          char play = 'y';
          
          //loop will give player new cards if they would like one
          while ((play == 'y'|| play == 'Y') && run<5 && sum1<21)
          {
            
            play = IBIO.inputChar("\nWould you like another card?(y/n)?");
            
            //if they dont want another card
            if (play == 'n')
            {
              System.out.println ("Ok no cards. Your total is: ");
              System.out.println (sum1);
            }
            
            //if they do want another card 
            else
            {
              newCard = (int)(Math.random()*9)+ 2; //choose random card
              sum1 = sum1 + newCard;
              System.out.println("Your new card is " + newCard);
              System.out.println("Your  new total is " + sum1);
              run += 1; //add one to the number of new cards they take 
              
              //check to see if they lose
              if (sum1 > 21)
              {
                //new feature - tell user if they have busted 
                System.out.println("You have busted");
              }
              
              
            }
            
          }  //end loop
          
          //dealers hand loop
          
          if(sum1D<16){
            while (sum1D <16 && runD <5)
            {
              newCardD = (int)(Math.random()*9)+ 2;
              sum1D = sum1D + newCardD;
              runD += 1;
              System.out.println("\nThe dealer drew a " + newCardD);
              System.out.println("The dealers  new sum is " + sum1D);
              
            }
          }
          //new feature - prints the dealer stays if the dealer doesnt get a new card 
          else { System.out.println("\nThe dealer stays");}
          
          //the if statments will check if user has busted; if so it will asign their total sum to = 0
          if (sum1>21)
          {
            sum1 = 0;
          }
          
          if (sum1D > 21)
          {
            sum1D = 0;
          }
          
          
          
          //check who wins
          if (sum1D > 21)
          {
            System.out.println("The dealer have busted");}
        }
        if ((sum1D > sum1))
        {
          System.out.println("\nThe dealer has won");
        }
        
        else if ((sum1>sum1D))
        {
          System.out.println("\nYou win!!");
        }
        else
        {
          System.out.println("\nIts a tie");
          
        }
        
        System.out.println("\nHave a nice day.");
      }
    }  
    
    
    
    
    
  }
}
//end of program


//end main

//end class HelloWorld
