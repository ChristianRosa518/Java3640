package Test2.Section3;

public class Dog extends Animal implements Pet{

    void makeSound() {
        System.out.println("woof");
    }

    public void play(){
        System.out.println("plays with cat toy");
    }
}
