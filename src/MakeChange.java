/*Program name: MakeChange
   Programmer: Albert Duenas
   Date: 9/28/22
   Version: 1.2
   Description: A Java program to get any amount of change expressed in cents.
   This program computes the number of half-dollars, quarters, dimes, nickels,
   and pennies to be returned, returning as many half-dollars as possible,
   then quarters, dimes, nickels, and pennies, in that order.*/

import java.util.Scanner;

public class MakeChange {
    private static boolean InputValidation(double userInput){
        return userInput > 0;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Please enter the amount you want converted into cents."); //Asks user for the amount they have
        double userInput = sc.nextDouble(); //save user amount
        if (InputValidation(userInput)) { //validate money amount
            double runningTotal = userInput;
           int count50cents = 0;//declaring coin counts
           int count25cents = 0;
           int count10cents = 0;
           int count5cents = 0;
           int count1cent = 0;
           while(runningTotal > 0.5){//Determining how many 50 cents coins in amount
               runningTotal = (runningTotal-0.5);
               count50cents = count50cents + 1;
           }


            while(runningTotal > 0.25){//Determining how many 25 cents coins in amount
                runningTotal = (runningTotal-0.25);
                count25cents = count25cents + 1;
            }
            while(runningTotal > 0.10){//Determining how many 10 cents coins in amount
                runningTotal = (runningTotal-0.10);
                count10cents = count10cents + 1;
            }
            while(runningTotal > 0.05){//Determining how many 5 cents coins in amount
                runningTotal = (runningTotal-0.05);
                count5cents = count5cents + 1;
            }
            while(runningTotal > .01){//Determining how many 1 cent coins in amount
                runningTotal = (runningTotal-.01);
                count1cent = count1cent + 1;
            }
            System.out.println("Your change is: \r\n");
            System.out.format("%d 50 cent coins\r\n", count50cents);
            System.out.format("%d 25 cent coins\r\n", count25cents);
            System.out.format("%d 10 cent coins\r\n", count10cents);
            System.out.format("%d 5 cent coins\r\n", count5cents);
            System.out.format("%d 1 cent coins\r\n", count1cent);

        }
        else {
            System.out.println("Please enter a non negative and non 0 number.");
        }


    }
}
