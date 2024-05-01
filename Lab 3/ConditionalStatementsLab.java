// Lab 3: Understanding flow of Control
// Part 6: Using if else if statement

import java.util.Scanner;

public class ConditionalStatementsLab{
   public static void main (String [] args){
      Scanner scanner = new Scanner (System.in);
      System.out.print("Enter your age: ");
      int age = scanner.nextInt();
      
      if(age < 0)
         System.out.println("Invalid age.");
      else if(age <18)
         System.out.println("You are a minor.");
      else if(age <= 65)
         System.out.println("You are an adult.");
      else
         System.out.println("You are a senior citizen");
   
   }
}