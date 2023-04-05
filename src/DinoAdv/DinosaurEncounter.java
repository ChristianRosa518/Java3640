package DinoAdv;
import java.util.Scanner;
public class DinosaurEncounter {
    public static void main(String[] args){
//        initialize 5 dinos, then run them through 2 loops
//        one to show all their info
//        another to grab user input and check if they chose a dino
        Herbivore Cherry = new Herbivore("Cherry");
        Herbivore Berry = new Herbivore("Berry");
        Carnivore David = new Carnivore("David");
        Carnivore Greg = new Carnivore("Greg");
        Omnivore Sally = new Omnivore("Sally");
        Dinosaur[] dinoPark = {Cherry, Berry, David, Greg, Sally};

        for (var i: dinoPark){
            System.out.println(i.getName());
            System.out.println(i.getDietType());
            System.out.println(i.getDietDescription());
            i.makeSound();
            System.out.println(" ");
        }

        Scanner console = new Scanner(System.in);
        System.out.println("Which dinosaur is your choice? ");
        String choice = console.next();

        for (var i : dinoPark){
            if(i.getName().equals(choice)) {
                System.out.println("You chose a dinosaur!");
                System.out.println(i.funFact());
            }

        }
    }
}
