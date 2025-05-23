import java.util.Scanner;
public class EvenOrOdd {
    public static void main(String args[]){
        Scanner read = new Scanner(System.in);
        System.out.println("Even Or Odd Checker");
        System.out.print("Enter Number To Check: ");
        int num = read.nextInt();
        if(num%2 == 0) System.out.println(num + " is an even number");
        else System.out.println(num + " is an odd number");
        read.close();
    }
}
