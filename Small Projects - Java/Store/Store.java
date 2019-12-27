/*
 * Program: Bobs Boutique
 * Student Name: Dhruv Shah
 * Student Number: 597327
 * Description: This program will ask the user how much of each product they would like to buy
 *              It will then calculate subtotal and final total with tax
 *              It will then calculate how much more money they still need to pay or the amount of change they need
 *              All of this will be printed to the user
*/


public class Store
{
  public static void main(String[] args)
  {                                         
//ASCII Tittle 
    
    
System.out.println("        :::       ::: :::::::::: :::        ::::::::   ::::::::    :::   :::   ::::::::::      ::::::::::: ::::::::          :::::::::   ::::::::  :::::::::  ::: ::::::::          :::::::::   ::::::::  :::    ::: ::::::::::: ::::::::::: ::::::::   :::    ::: :::::::::: "); 
System.out.println("   :+:       :+: :+:        :+:       :+:    :+: :+:    :+:  :+:+: :+:+:  :+:                 :+:    :+:    :+:         :+:    :+: :+:    :+: :+:    :+: :+ :+:    :+:         :+:    :+: :+:    :+: :+:    :+:     :+:         :+:    :+:    :+:  :+:    :+: :+:         ");
System.out.println("  +:+       +:+ +:+        +:+       +:+        +:+    +:+ +:+ +:+:+ +:+ +:+                 +:+    +:+    +:+         +:+    +:+ +:+    +:+ +:+    +:+    +:+                +:+    +:+ +:+    +:+ +:+    +:+     +:+         +:+    +:+    +:+  +:+    +:+ +:+          ");
System.out.println(" +#+  +:+  +#+ +#++:++#   +#+       +#+        +#+    +:+ +#+  +:+  +#+ +#++:++#            +#+    +#+    +:+         +#++:++#+  +#+    +:+ +#++:++#+     +#++:++#++         +#++:++#+  +#+    +:+ +#+    +:+     +#+         +#+    +#+    +:+  +#+    +:+ +#++:++#      ");
System.out.println("+#+ +#+#+ +#+ +#+        +#+       +#+        +#+    +#+ +#+       +#+ +#+                 +#+    +#+    +#+         +#+    +#+ +#+    +#+ +#+    +#+           +#+         +#+    +#+ +#+    +#+ +#+    +#+     +#+         +#+    +#+    +#+  +#+    +#+ +#+            ");
System.out.println("#+#+# #+#+#  #+#        #+#       #+#    #+# #+#    #+# #+#       #+# #+#                 #+#    #+#    #+#         #+#    #+# #+#    #+# #+#    #+#    #+#    #+#         #+#    #+# #+#    #+# #+#    #+#     #+#         #+#    #+#    #+#  #+#    #+# #+#             ");
System.out.println("###   ###   ########## ########## ########   ########  ###       ### ##########          ###     ########          #########   ########  #########      ########          #########   ########   ########      ###     ########### ########### ########  ##########       ");
    
System.out.println("Welcome to Bob's CLothing Boutique");
    
    
    System.out.println("Enter the amount of each product you would like to buy");
    
    
    
//Dsiplay the items for sale
    
    System.out.println("Here at Bob’s Boutique, we have extremely discounted clothing items.");
    System.out.println("Here is a list of our amazing products and the prices: \n T-Shirts - $5.00 \n Red Sweaters - $15.00 \n Black Sweaters - $20.00 \n Jackets - $35.00 \n Underwear - $6.00 \n Socks - $3.00 ");

    
//Collect user input for what they would like to buy
    
    int shirt = IBIO.inputInt ("How many t-shirts would you like?");
    int sweaterR = IBIO.inputInt ("How many red sweaters would you like?");
    int sweaterB = IBIO.inputInt ("How many black sweaters would you like?");
    int jacket = IBIO.inputInt ("How many jackets would you like?");
    int underwear = IBIO.inputInt ("How many underwear would you like?");
    int sock = IBIO.inputInt ("How many socks would you like?");
   
//ASCII Bill Title 

   System.out.println("**************************");
   System.out.println("* Here is your Bill      *");
   System.out.println("**************************");
    
//calculation for cost per item 
    
    int shirtC = shirt*5;
    int sweaterRC = sweaterR*15;
    int sweaterBC = sweaterB*20;
    int jacketC = jacket*35;
    int underwearC = underwear*6;
    int sockC = sock*3;
      
    
    
    
//Display cost per products they bought according to the number they wanted 
    System.out.println(shirt + " shirt(s) @ $5.00 = $" + shirtC); 
    System.out.println(sweaterR + " red sweater(s) @ $15.00 = $" + sweaterRC); 
    System.out.println(sweaterB + " black sweater(s) @ $20.00 = $" + sweaterBC); 
    System.out.println(jacket + " jacket(s) @ $35.00 = $" + jacketC); 
    System.out.println(underwear + " underwear(s) @ $6.00 = $" + underwearC); 
    System.out.println(sock + " sock(s) @ $3.00 = $" + sockC); 
    
    
//Totals Calculation  
    
    double sub = shirtC + sweaterRC + sweaterBC + jacketC + underwearC + sockC;
    //the tax value as a percent in the spefic area
    double tax_amt = 0.13;
    double tax = sub*tax_amt; 
    double total = sub + tax;
    double total_round = (total *100) / 100;
    
  
//print totals 
    
    System.out.println("Subtotal: $" + sub); 
    System.out.println("Tax: $" + tax);
    System.out.println("Total: $" + total_round);
    
    
    double pay = IBIO.inputInt("Enter the amount of money you paid: $");
    
//money left statments 
    
    
    
    if (pay > total_round)
      System.out.println("Your change is $" + (pay - total_round));
                                      
    else if (pay < total_round)
      System.out.println("You havent paid enough. You still need to pay $" + (total_round - pay));
                  
    else 
      System.out.println("Thank-you for shopping at Bob's Boutique. Have a good day");
    
    
  }//end main
}//end class 
