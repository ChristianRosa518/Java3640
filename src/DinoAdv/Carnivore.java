package DinoAdv;

public class Carnivore extends Dinosaur {

    public Carnivore(String n){
        this.name = n;
        this.diet = "Carnivore";
        this.dietDescription = "Eats meat";
        this.funny = "Eats only humans, and mostly babies";
        this.sound = "Crunch";
    }
}