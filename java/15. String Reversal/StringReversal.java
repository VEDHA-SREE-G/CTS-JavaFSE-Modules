import java.util.Scanner;
public class StringReversal {
    public static void main(String args[]){
        Scanner read = new Scanner(System.in);
        System.out.println("String Reversal");
        System.out.print("Enter a string to reverse: ");
        String input = read.nextLine();
        String reverse = new StringBuilder(input).reverse().toString();
        System.out.println("Reversed String : "+reverse);
        read.close();
    }
}
