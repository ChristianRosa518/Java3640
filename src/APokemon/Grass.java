package APokemon;

import java.util.Scanner;

public class Grass extends Pokemon {
    protected String sigMove;
    protected String move1;
    protected String move2;

    protected String[] moves = {"Tackle", "EnergyBall", "LeafStorm"};

    public String performAttack(int attackIndex, Pokemon defender ){
        int previousHealth = defender.health;
        switch (attackIndex){
            case 1:
                System.out.println("Use Tackle!");
                // Tackle, normal move, flat hp decrease.
                defender.setHealth(30);
                break;
            case 2:
                System.out.println("Use Energy Ball!");
                switch(defender.type){
                    case "Water" :
                        defender.setHealth(60);
                        break;
                    case "Fire" :
                        defender.setHealth(15);
                        break;
                    case "Grass" :
                        defender.setHealth(30);
                        break;
                }
                break;
            case 3:
                System.out.println("SIGNATURE MOVE LEAF STORM!");
                switch(defender.type){
                    case "Water" :
                        defender.setHealth(90);
                        break;
                    case "Fire" :
                        defender.setHealth(23);
                        break;
                    case "Grass" :
                        defender.setHealth(45);
                        break;
                }
                break;
        }
        return "Attack Successful! Current Health : " + previousHealth + " Reduced to " + defender.health + " !";
    }
    public int chooseMove(){
        int currentMove = 0;
        Scanner console = new Scanner(System.in);
        System.out.println(this.moves[0]);
        System.out.println(this.moves[1]);
        System.out.println(this.moves[2]);

        for (var i = 0; i < 1000; i++){
            String choice = console.next();
            for(var j = 0; j < 3; j++){
                if(moves[j].equals(choice)){
                    currentMove = j + 1;
                    return currentMove;
                }
            }
            System.out.println("Please choose a move");
        }
        return currentMove;
    }
    public Grass(String n, int h){
        this.name = n;
        this.sigMove = "Leaf Storm";
        this.health = h;
        this.type = "Grass";
        this.move1 = "Tackle";
        this.move2 = "Energy Ball";
    }
}
