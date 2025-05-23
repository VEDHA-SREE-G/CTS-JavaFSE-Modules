import java.util.Scanner;
public class SimpleCalculator {
    public static void main(String args[]){
        Scanner read = new Scanner(System.in);
        System.out.println("Simple Calculator");
        System.out.print("Enter number - 1: ");
        int a = read.nextInt();
        System.out.print("Enter number - 2: ");
        int b = read.nextInt();
        System.out.println("1.Addition\n2.Subraction\n3.Multiplication\n4.Division");
        System.out.print("Enter choice (1 or 2 or 3 or 4): ");
        int choice = read.nextInt();
        int result;
        switch(choice){
            case 1:
                result = a + b;
                System.out.println("Addition Result : "+ result);
                break;
            case 2:
                result = a - b;
                System.out.println("Subtraction Result: "+ result);
                break;
            case 3:
                result = a * b;
                System.out.println("Multiplication Result: "+ result);
                break;
            case 4:
                float divResult = a / (float) b;
                System.out.println("Division Result: "+divResult);
                break;
        }
        read.close();
    }
}
