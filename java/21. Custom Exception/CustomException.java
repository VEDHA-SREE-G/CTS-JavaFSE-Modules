import java.util.Scanner;
class InvalidAgeException extends Exception{
    public InvalidAgeException(String message){
        super(message);
    }
}
public class CustomException {
    public static void main(String args[]) {
        Scanner read = new Scanner(System.in);
        System.out.print("Enter age: ");
        try{
            int age = read.nextInt();
            checkAge(age);
            System.out.println("Access granted.");
        }
        catch(InvalidAgeException e){
            System.out.println(e);
        }
        catch(Exception e){
            System.out.println("Invalid input. Please enter a age.");
        }
        read.close();
    }
    public static void checkAge(int age) throws InvalidAgeException{
        if(age < 18) 
            throw new InvalidAgeException("Age must be 18 or older");
    }

}
