import java.util.Scanner;
public class Calculator {
   public static void main(String[] args) {
      double a;
      double b;
      double ans;
      String op;
      Scanner reader = new Scanner(System.in);
      System.out.print("Enter two numbers: ");
      num1 = reader.nextDouble();
      num2 = reader.nextDouble();
      System.out.print("\nEnter an operator (+, -, *, /): ");
      op = reader.next().charAt(0);
      switch(op) {
         case '+': ans = a + b;
            break;
         case '-': ans = a - b;
            break;
         case '*': ans = a * b;
            break;
         case '/': ans = a / b;
            break;
      default: System.out.printf("Error! Enter correct operator");
         return;
      }
      System.out.print("\nThe result is given as follows:\n");
      System.out.printf(a + " " + op + " " + b + " = " + ans);
   }
}
