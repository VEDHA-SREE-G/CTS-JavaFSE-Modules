import java.util.Scanner;
public class RecursiveFibonacci {
    public static void main(String args[]){
        System.out.println("Recursive Fibonacci Series");
        Scanner read = new Scanner(System.in);
        System.out.print("Enter no of Terms: ");
        int n = read.nextInt();
        RecursiveFibonacci obj = new RecursiveFibonacci();
        int result = obj.fibonacciNumber(n);
        System.out.println(n +" th Fibonacci Number is : " +result);
        read.close();
    }
    public int fibonacciNumber(int n){
        if(n<=0) return 0;
        else if(n == 1) return 1;
        return fibonacciNumber(n-1) + fibonacciNumber(n-2);
    }
}
