// Lab 3
//Question 1
import java.util.Scanner;

public class BookDiscountStore{
   public static void main (String [] args){
      Scanner scanner = new Scanner (System.in);
      System.out.print("Enter the number of books: ");
      int numberOfBooks = scanner.nextInt();
      int discount=0;
      
      if(numberOfBooks < 0){
         System.out.println("Invalid Input");
         return;
      }
      else if(numberOfBooks <=5)
         discount = 5;
      else if(numberOfBooks <=10)
         discount = 10;
      else if(numberOfBooks > 10)
         discount = 15;
         
      System.out.println("You've chosen to buy "+numberOfBooks +" books.");
      System.out.println("Congratulations! You qualify for a " +discount +"% discount on your purchase.");
      
      
   }
}
