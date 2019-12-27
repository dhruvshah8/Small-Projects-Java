public class mod
{
  public static void main(String[] args)
  {
    //the base of the number systemm 
    int n = 2;
   
    //this gets the binary number with a maximum of 8 bits
    int bin = IBIO.inputInt("Please enter a binary number (Max 8 bit) :  ");
    
    
    //the next 9 lines issolate eaach digit to determine if it is a 1 or a 0
    
    int a = (bin % 10);
    int b = (bin /10 % 10);
    int c = (bin /100 % 10);
    int d = (bin /1000 % 10);
    int e = (bin /10000 % 10);
    int f = (bin /100000 % 10);
    int g = (bin /1000000 % 10);
    int h = (bin /10000000 % 10);
    
    // the next line will multpily each individual digit with its place holder 
    int decTotal = (a*1) + (b*2) + (c*4) + (d*8) + (e*16) + (f*32) + (g*64) + (h*128); 
    
    // next line prints the decimal number 
    
    System.out.println("Okay that is " + decTotal + " in decimal");
   //end binary to decmial 
    
   //start decimal to binary 
    
    
    int num = IBIO.inputInt ("Enter a decimal number from 0 - 255");
    
    
    int first = num%128;
    int second = first%64;
    int third = second%32;
    int fourth = third%16;
    int fifth = fourth%8;
    int sixth = fifth%4;
    int seventh = sixth%2;
    int last = seventh%1;
      
 
    int first2 = num/128;
    int second2 = first/64;
    int third2 = second/32;
    int fourth2 = third/16;
    int fifth2 = fourth/8;
    int sixth2 = fifth/4;
    int seventh2 = sixth/2;
    int last2 = seventh/1;
    
    System.out.println("Your number in binary is  " + first2 + second2 + third2 + fourth2 + fifth2 + sixth2 + seventh2 + last2);
    
    // binary to decimal last digit 
    
    int last_dec = decTotal%10; 
    int last_bin = last2;
    
    System.out.println("The last digits are " + last_dec + " and " + last_bin);
    
    int last_5_dec = last_dec + 5;
    int last_5_bin = last_bin +5;
    
    System.out.println("Adding 5 to each digit gives " + last_5_dec + " and " + last_5_bin);
   
    int num_product = last_5_dec * last_5_bin;
    
     System.out.println(last_5_dec + " * " + last_5_bin + " is " + num_product);
    
    double num_root = Math.sqrt(num_product);
    //final print statment 
    System.out.println("The square root of " + num_product + " is " + num_root);
   
    
  }//end main
}//end class mod