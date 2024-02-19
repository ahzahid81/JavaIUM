public class Test3 {
    public static void main(String[] args) {
        int num1 = 20;
        int num2 = 7;
        
        int sum = num1 + num2;
        int difference = num1 - num2;
        int product = num1 * num2;
        int division = num1 / num2;

        num1 += 10;
        int combinedExpression = num1 * num2 + 5;

        System.out.println("Sum of num1 and num2: " + sum);
        System.out.println("Difference between num1 and num2: " + difference);
        System.out.println("Product of num1 and num2: " + product);
        System.out.println("Division of num1 by num2: " + division);
        System.out.println("Updated value of num1: " + num1);
        System.out.println("Combined expression: " + combinedExpression);
    }
}
