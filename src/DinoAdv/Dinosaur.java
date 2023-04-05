package DinoAdv;

public class Dinosaur implements DietBehavior {
//    The basis of all dinos.
    protected String diet;
    protected String dietDescription;
    protected String name;
    protected String sound;
    protected String funny;

    String getName(){
        return this.name;
    }
    public void makeSound(){
        System.out.println(this.sound);
    }

    public String getDietType(){
        return this.diet;
    }

    public String getDietDescription(){
        return this.dietDescription;
    }

    public String funFact(){
        return this.funny;
    }
//        Initializers

}