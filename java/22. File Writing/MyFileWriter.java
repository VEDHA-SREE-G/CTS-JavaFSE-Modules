import java.io.*;
import java.util.Scanner;
public class MyFileWriter {
    public static void main(String args[]){
        Scanner read = new Scanner(System.in);
        System.out.print("Enter a string to write into file: ");
        String input = read.nextLine();
        String filename = "output.txt";
        try{
            FileWriter writer = new FileWriter(filename);
            writer.write(input);
            writer.close();
            System.out.println("File Written Operation Executed Successfully");
        }
        catch(IOException e){
            System.out.println("An Error Occured During Operation");
        }
        read.close();
    }
}
