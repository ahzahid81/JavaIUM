public class Test2{
   public static void main (String[] args){
      int initialValue = 10;
      int changingValue = initialValue;
      changingValue *=3;
      
      final double PI = 3.14159;
      
      //PI = 3.14; Compiler Error

      System.out.println("Intital Value: " + initialValue);
      System.out.println("Changing Value: " +changingValue);
      System.out.println("PI Value:" +PI);
      
      byte byteValue = 3;
      short shortValue = 1;
      long longValue = 10000;
      
      System.out.println("Byte Value: " +byteValue);
      System.out.println("Short Value: " +shortValue);
      System.out.println("Long Value: " +longValue);
      
      byteValue +=20;
      shortValue *=2;
      longValue -=1000;
      
      System.out.println("Modified Value");
      System.out.println("Byte Value: " +byteValue);
      System.out.println("Short Value: " +shortValue);
      System.out.println("Long Value: " +longValue);
   }
}