class Animal{
    public void makeSound(){
        System.out.println("Animal makes a sound");
    }
}
class Dog extends Animal{
    public void makeSound(){
        System.out.println("Dog Barks");
    }
}
public class InheritanceExample {
    public static void main(String args[]){
        Animal animal = new Animal();
        animal.makeSound();
        Dog dog = new Dog();
        dog.makeSound();
        Animal animalDog = new Dog();
        animalDog.makeSound();
    }
}
