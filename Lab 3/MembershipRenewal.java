// Lab 3: Understanding flow of Control
// Part 3: Using if statement
// Task 2: Membership Renewal

import java.util.Scanner;

public class MembershipRenewal {
   public static void main (String [] args) {
   
      boolean isMember;
      int yearsOfMembership;
      
      Scanner scanner = new Scanner (System.in);
      
      System.out.print("Are you a member? (true/false) :");
      isMember = scanner.nextBoolean();
      
      System.out.print("How many years have you been a member? ");
      yearsOfMembership = scanner.nextInt();
      
      if(isMember == true && yearsOfMembership >=2)
         System.out.println("You are eligible for membership renewal!");

      
   }
}