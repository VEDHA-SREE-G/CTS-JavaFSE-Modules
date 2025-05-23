import java.util.Scanner;
public class GradeCalculator {
    public static void main(String args[]){
        Scanner read = new Scanner(System.in);
        System.out.println("Grade Calculator");
        System.out.print("Enter marks out of 100: ");
        int marks = read.nextInt();
        char grade = ' ';
        if(marks > 100 || marks < 0) {
            System.out.print("Enter Valid Marks Out Of 100");
            read.close();
            return;
        }
        else if(marks >= 90) grade = 'A';
        else if(marks >= 80) grade = 'B';
        else if(marks >= 70) grade = 'C';
        else if(marks >= 60) grade = 'D';
        else grade = 'F';
        System.out.println("Secured Grade : "+ grade);
        read.close();
    }
}
