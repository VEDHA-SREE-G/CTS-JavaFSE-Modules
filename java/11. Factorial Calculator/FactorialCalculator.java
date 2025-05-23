import java.util.Scanner;
public class FactorialCalculator {
    public static void main(String args[]){
        Scanner read = new Scanner(System.in);
        System.out.println("Factorial Calculator");
        System.out.print("Enter a Non-Negative Number to find Factorial: ");
        int num = read.nextInt();
        if(num < 0){
            System.out.println("Please Enter a Non Negative Number");
            read.close();
            return;
        } 
        int result = 1;
        for(int i=1; i<=num; i++) result *= i;
        System.out.println("Factorial of " + num +" is "+ result);
        read.close();
    }
}
