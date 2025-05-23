import java.util.*;
public class ArrayListExample {
    public static void main(String args[]){
        Scanner read = new Scanner(System.in);
        System.out.println("Managing A List Of Students");
        List<String> students = new ArrayList<>();
        System.out.println("1.Add\n2.Display\n3.Exit");
        System.out.print("Enter Choice: ");
        int choice = read.nextInt();
        read.nextLine();
        while(choice != 3){
            if(choice == 3) break;
            switch(choice){
                case 1:
                    System.out.print("Enter Student Name: ");
                    String name = read.nextLine();
                    students.add(name);
                    break;
                case 2:
                    System.out.println("Student List");
                    for(String names : students) 
                        System.out.println(names);
                    break;
            }
            System.out.print("Enter Choice: ");
            choice = read.nextInt();
            read.nextLine();
        }
        read.close();
    }
}
