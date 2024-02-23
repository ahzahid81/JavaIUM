public class Test6{
   public static void main (String[] args){
      int a = 8;
      int b = a;
      b = --a;
      
      System.out.println("After pre-decrement");
      System.out.println("a: " +a);
      System.out.println("b: " +b);
      
      b = a--;
      
      System.out.println("After post-decrement");
      System.out.println("a: " +a);
      System.out.println("b: " +b);
       
   }
}