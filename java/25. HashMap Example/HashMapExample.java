import java.util.*;
public class HashMapExample {
    public static void main(String args[]){
        Scanner read = new Scanner(System.in);
        System.out.println("Map Student ID's to Names");
        Map<Integer,String> students = new HashMap<>();
        System.out.println("1.Add\n2.Display\n3.Exit");
        System.out.print("Enter Choice: ");
        int choice = read.nextInt();
        read.nextLine();
        while(choice != 3){
            if(choice == 3) break;
            switch(choice){
                case 1:
                    System.out.print("Enter Student ID: ");
                    int id = read.nextInt();
                    read.nextLine();
                    System.out.print("Enter Student Name: ");
                    String name = read.nextLine();
                    students.put(id,name);
                    break;
                case 2:
                    System.out.println("Display Student");
                    System.out.print("Enter Student ID: ");
                    int ID = read.nextInt();
                    System.out.println("Student Name: "+ students.get(ID));
                    break;
            }
            System.out.print("Enter Choice: ");
            choice = read.nextInt();
            read.nextLine();
        }
        read.close();
    }
}
