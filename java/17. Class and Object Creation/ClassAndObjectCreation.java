class Car{
    String model,make;
    int year;
    public void displayDetails(){
        System.out.println("Car Details:");
        System.out.println("-----------------------");
        System.out.println("Make  : " + make);
        System.out.println("Model : " + model);
        System.out.println("Year  : " + year);
        System.out.println("-----------------------");
    }
}
public class ClassAndObjectCreation {
    public static void main(String args[]){
        Car car1 = new Car();
        car1.make = "Toyota";
        car1.model = "Camry";
        car1.year = 2022;
        car1.displayDetails();
        Car car2 = new Car();
        car2.make = "Honda";
        car2.model = "Civic";
        car2.year = 2023;
        car2.displayDetails();
    }
}
