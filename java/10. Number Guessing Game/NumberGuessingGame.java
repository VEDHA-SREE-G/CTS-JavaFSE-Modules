import java.util.Random;
import java.util.Scanner;
public class NumberGuessingGame {
    public static void main(String args[]){
        System.out.println("Number Guessing Game");
        Scanner read = new Scanner(System.in);
        Random random = new Random();
        int num = random.nextInt(1,101);
        System.out.print("Enter a number to guess: ");
        int guess = read.nextInt();
        while(guess != num){
            if(guess > num) System.out.println("Almost There...Guess a bit Lower");
            else System.out.println("Almost There...Guess a bit Higher");
            System.out.print("Enter a number to guess: ");
            guess = read.nextInt();
        }
        System.out.println("Congrats! You Guessed Correctly");
        read.close();
    }
}
