import java.util.Scanner;
public class TryCatchExample {
    public static void main(String args[]){
        Scanner read = new Scanner(System.in);
        System.out.print("Enter Dividend: ");
        int num1 = read.nextInt();
        System.out.print("Enter Divisor: ");
        int num2 = read.nextInt();
        try{
            float result = num1 / (float) num2;
            System.out.println("Result: " + result);
        }
        catch(ArithmeticException e){
            System.out.println("Error: Division by zero is not allowed.");
        }
        finally{

        }
        read.close();
    }
}
