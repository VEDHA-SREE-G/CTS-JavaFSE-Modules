import java.util.Scanner;
public class PalindromeChecker {
    public static void main(String args[]){
        Scanner read = new Scanner(System.in);
        System.out.println("Palindrome Checker");
        System.out.print("Enter a string to check its palindrome or not: ");
        String input = read.nextLine();
        int n = input.length();
        int left = 0, right = n - 1;
        while(left < right){
            if(!Character.isDigit(input.charAt(left)) && !Character.isLetter(input.charAt(left))){
                left++;
                continue;
            } 
            else if(!Character.isDigit(input.charAt(right)) && !Character.isLetter(input.charAt(right))){
                right--;
                continue;
            }
            if(input.charAt(left) == input.charAt(right)){
                right--;
                left++;
            }
            else {
                System.out.println(input+" is not a palindrome");
                read.close();
                return;
            }
        }
    System.out.println(input+" is a palindrome");
    read.close();
    }
}
