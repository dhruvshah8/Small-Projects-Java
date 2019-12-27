public class msg
{
  public static void main(String[] args)
  {
    System.out.println("Lets convert from text message to English.");
    
    
    
    String ttyl = ("TTYL"); 
    
    
    String msg = IBIO.inputString("Enter the text message you wish to convert(one line at a time in all CAPITALS: :"); 
    
    while (!msg.equals(ttyl)){
      
      if (msg.equals("NP")) 
        System.out.println("No problem");
      
      else if (msg.equals("LOL")) 
        System.out.println("Laughing out loud!");
      
      else if (msg.equals("CU")) 
        System.out.println("See You");
      
      else if (msg.equals(":-)")) 
        System.out.println("I'm happy");
      
      else if (msg.equals(":-(")) 
        System.out.println("I'm unhappy");
      
      else if (msg.equals(";-)")) 
        System.out.println("Wink");
      
      else if (msg.equals(":-P")) 
        System.out.println("Stick out my tongue");
      
      else if (msg.equals(" _ _\n(  .  )")) 
        System.out.println("Sleepy ");
      
      else if (msg.equals("TA")) 
        System.out.println("Totally Awesome");
      
      else if (msg.equals("CUZ")) 
        System.out.println("Because");
      
      else if (msg.equals("TY")) 
        System.out.println("Thank-you ");
      
      else if (msg.equals("YW")) 
        System.out.println("You're Welcome ");
      
      else 
        System.out.println(msg);
      
      
      
      msg = IBIO.inputString("\nEnter the text message you wish to convert(one line at a time in all CAPITALS: :"); 
      
    }
    if (msg.equals(ttyl))
          System.out.println("Talk to you later");
    
  }
}


