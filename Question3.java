public class Question3{
   public static void main (String [] args){
      double item1 = 20;
      double item2 = 15.5;
      double item3 = 8.75;
      double item4 = 30.25;
      double item5 = 12.0;
      double discountPercentage = 15;
      double taxPercentage = 7.5;
      
      double sumBeforeDiscount = item1 + item2 + item3 + item4 + item5;
      double discountAmount = (sumBeforeDiscount/100)*discountPercentage;
      double totalCostAfterDiscount = sumBeforeDiscount - discountAmount;
      double taxAmount = (totalCostAfterDiscount/100)*taxPercentage;
      double finalTotalCost = totalCostAfterDiscount + taxAmount;
      
      System.out.println("Welcome to the Shopping Cart Calculator!");
      System.out.println("Item prices: $"+item1 +", $" +item2 +", $" +item3 +", $" +item4 +", $" +item5);
      System.out.println("Discount Percentage:" +discountPercentage +"%");
      System.out.println("Tax Percentage: " +taxPercentage + "%");
      System.out.println();
      System.out.println("Total cost before discount: $"+sumBeforeDiscount);
      System.out.println("Discount amount: $" +discountAmount);
      System.out.println("Total cost after discount: $"+totalCostAfterDiscount);
      System.out.println("Tax amount: $"+taxAmount);
      System.out.println("Final toatl cost: $"+finalTotalCost);
   }
}