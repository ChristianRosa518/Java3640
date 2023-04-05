package Test2.Section3;

public class Cat extends Animal implements Pet{
    void makeSound() {
        System.out.println("Meow!");
    }

    public void play(){
        System.out.println("plays with cat toy");
    }
}
