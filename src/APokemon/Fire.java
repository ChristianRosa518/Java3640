package APokemon;

import java.util.Scanner;

public class Fire extends Pokemon{
    protected String sigMove;
    protected String move1;
    protected String move2;

    protected String[] moves = {"Tackle", "Ember", "FlameThrower"};

    public String performAttack(int attackIndex, Pokemon defender ){
        int previousHealth = defender.health;
        switch (attackIndex){
            case 1:
                System.out.println("Use Tackle!");
                // Tackle, normal move, flat hp decrease.
                defender.setHealth(30);
                break;
            case 2:
                System.out.println("Use Ember!");
                switch(defender.type){
                    case "Water" :
                        defender.setHealth(15);
                        break;
                    case "Fire" :
                        defender.setHealth(30);
                        break;
                    case "Grass" :
                        defender.setHealth(60);
                        break;
                }
                break;
            case 3:
                System.out.println("SIGNATURE MOVE FLAMETHROWER");
                switch(defender.type){
                    case "Water" :
                        defender.setHealth(23);
                        break;
                    case "Fire" :
                        defender.setHealth(45);
                        break;
                    case "Grass" :
                        defender.setHealth(90);
                        break;
                }
                break;
        }
        return "Attack Successful! Current Health : " + previousHealth + " Reduced to " + defender.health + " !" + "\n";
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
    public Fire(String n, int h){
        this.name = n;
        this.sigMove = "FlameThrower";
        this.health = h;
        this.type = "Fire";
        this.move1 = "Tackle";
        this.move2 = "Ember";
    }
}
