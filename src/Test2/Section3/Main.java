package Test2.Section3;

public class Main {
    public static void main(String[] args) {
        Animal myAnimal = new Dog();
        myAnimal.makeSound();
    }
    // a) Abstract is used so you can't make a class animal, and only use it as an interface/extends.
    // b) polymorphism is the use of a superclass to provide a interface/abstract class
    //    so these other classes require a method
    //    public class cat extends animal, or public class dog extends animal. Used for reusability

}
