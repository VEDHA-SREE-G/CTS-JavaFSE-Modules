import java.io.FileReader;

public class FileReading{
    public static void main(String args[]){
        String filename = "output.txt";
        try{
            FileReader reader = new FileReader(filename);
            int ch = reader.read();
            while(ch != -1){
                System.out.print((char)ch);
                ch = reader.read();
            }
            reader.close();
        }
        catch(Exception e){
            System.out.println("An error occured during file reading operation");
        } 
    }
}