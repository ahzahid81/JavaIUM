// Lab 3: Understanding flow of Control
// Part 1 : Boolean Expression and Relation Operators

import java.util.Scanner;
public class BooleanOperatorsLab {
   public static void main (String [] args){
      int num1, num2;
      
      Scanner input = new Scanner(System.in);
      
      System.out.print("Enter the value for num1: ");
      num1 = input.nextInt();
      System.out.print("Enter the value for num2: ");
      num2 = input.nextInt();
      
      boolean result1 = (num1>num2);
      boolean result2 = (num1 == num2);
      
      System.out.println("Result 1 (num1 > num2): "+result1);
      System.out.println("Result 2 (num1 == num2): "+result2);
      
      //part 2 : Logical Operator
      boolean result3 = (result1 && result2);
      System.out.println("Result 3 (result1 && result2): "+result3);
      
      boolean result4 = (result1 || result2);
      System.out.println("Result 4 (result1 && result2): "+result4);
      
      
   }
} 