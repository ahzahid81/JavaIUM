public class Test5{
   public static void main (String [] args){
      int x = 5;
      int y = x;
      y = ++x;
      System.out.println("The result of after the pre-increment\nThe value of x is :" +x +" and the value of y is: "+y);
      
      y = x++;
      System.out.println("The result of after the post-increment\nThe value of x is :" +x +" and the value of y is: "+y);       
   }
}