public class mathcircus
{
  public static void main (String args[])
  { new mathcircus ();
  }
  public mathcircus ()
  {
    int points = 0;
    int num1 = 0;
    int num2 = 0;
    char cont = ('y');
    
    while (cont == 'y')
    {
    num1 = ((int) (Math.random () * 5)) + 1;
    num2 = ((int) (Math.random () * 5)) + 1;
    int ans = IBIO.inputInt ("Answer this question: " + num1 + " + " + num2 + " = ");
    if (ans == (num1 + num2))
    { System.out.println ((num1 + num2) + " is correct! You got it right!");
      points++;
    }
    else{
      System.out.println ((num1 + num2) + " is the correct answer, not " + ans);
    System.out.println ("Score: " + points);
    }
    cont = IBIO.inputChar("Would you like to continue?(y/n)");
    }
  }
} 

