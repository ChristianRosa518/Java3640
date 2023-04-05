package DinoAdv;

public class DinosaurAdventure {
    public static void main(String[] args){

        Herbivore jerry = new Herbivore("Jerry");
        System.out.println(jerry.getDietType());
        System.out.println(jerry.getDietDescription());
        Carnivore greg = new Carnivore("Jerry");
        System.out.println(greg.getDietType());
        System.out.println(greg.getDietDescription());
        Omnivore ChickenSalad = new Omnivore("MeatBerry");
        System.out.println(ChickenSalad.getDietType());
        System.out.println(ChickenSalad.getDietDescription());

    }
}
