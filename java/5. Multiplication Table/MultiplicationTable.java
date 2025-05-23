import java.util.Scanner;
public class MultiplicationTable {
    public static void main(String args[]){
        Scanner read = new Scanner(System.in);
        System.out.println("Multiplication Table");
        System.out.print("Enter number to generate multiplication table: ");
        int n = read.nextInt();
        for(int i=1; i<=10; i++){
            System.out.println(n + " x " + i + " = " + n*i);
        }
        read.close();
    }
}
