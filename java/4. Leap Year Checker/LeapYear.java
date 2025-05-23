import java.util.Scanner;
public class LeapYear {
    public static void main(String args[]){
        Scanner read = new Scanner(System.in);
        System.out.println("Leap Year Checker");
        System.out.print("Enter a year to check: ");
        int year = read.nextInt();
        if((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) System.out.println(year + " is a leap year");
        else System.out.println(year + " is not a leap year");
        read.close();
    }
}
