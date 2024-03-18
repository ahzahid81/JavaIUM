//Lab 3: Using if statement
//Task 1: Checking Eligibility for Discount

import java.util.Scanner;

public class CheckEligibility{
   public static void main(String [] args){
      Scanner scanner = new Scanner(System.in);
      
      System.out.print("Enter your age: ");
      int age = scanner.nextInt();
      
      System.out.print("Enter the total amount of your purchase: ");
      int totalAmount = scanner.nextInt();
      
      if(age >= 18 && age <= 30 && totalAmount>=1000)
         System.out.println("You are eligible for a discount!");
   
   }
}