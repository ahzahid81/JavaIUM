public class Average{
   public static void main (String [] args){
      int i, avg, sum=0;
      
      for(i=1; i<=5; i++){
         sum = sum + i;
      }
      
      avg = sum/(i-1);
      
      System.out.print(avg);
   }
}