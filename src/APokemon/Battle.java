package APokemon;
import java.util.Scanner;
import java.util.Random;
public class Battle {
    public static void main(String[] args){
        Player Ash = new Player();
        Grass Bulb = new Grass("Bulb", 100);
        Fire Char = new Fire("Char", 100);
        Water Squirt = new Water("Squirt", 100);

        Ash.pokemon.add(Bulb);
        Ash.pokemon.add(Char);
        Ash.pokemon.add(Squirt);

        Player Emerald = new Player();
        Grass Turt = new Grass("Turt", 100);
        Fire Chim = new Fire("Chim", 100);
        Water Pip = new Water("Pip", 100);

        Emerald.pokemon.add(Turt);
        Emerald.pokemon.add(Chim);
        Emerald.pokemon.add(Pip);

//        Battle example.
//        System.out.println(Ash.pokemon.get(1).performAttack(2, Emerald.pokemon.get(2)));
//            Choose mon

        int current = chooseMon(Ash);
        System.out.println("");
        int opponent = enemyMon(Emerald);


//      Opponent Choice
//
        for ( var i = 0; i < 1000 ; i++){
            System.out.println("Battle Start!");
            System.out.println("Your opponent is " + Emerald.pokemon.get(opponent).name + "! it's a " + Emerald.pokemon.get(opponent).type + " type!");
            System.out.println("");
            for (var j = 0; j < 1000; j++){
                print("Your move!");
                System.out.println("");
                for (int k = 0; k < 1000; k++){
                    Random rand = new Random();
                    int random = rand.nextInt(3) + 1;
                    int move = Ash.pokemon.get(current).chooseMove();
                    System.out.println("");
                    System.out.println(Ash.pokemon.get(current).performAttack(move, Emerald.pokemon.get(opponent)));
                    opponent = checkEnemy(Emerald, opponent, Emerald.pokemon.get(opponent));
                    if(opponent == 9999){
                        System.out.println("GAME OVER YOU WIN");
                        return;

                    }
                    System.out.println("");
                    System.out.println("Enemy's Turn!");
                    System.out.println(Emerald.pokemon.get(opponent).performAttack(random, Ash.pokemon.get(current)));
                    System.out.println("");
                    current = checkMon(Ash, current, Ash.pokemon.get(current));
                    if ( current == 9999){
                        System.out.println("GAME OVER YOU LOSE");
                        return;
                    }
                }
            }
        }

    }

    public static int enemyMon(Player n){
        int size = n.pokemon.size();
        if (size == 0){
           return 9999;
        }
        Random rand = new Random();
        int random = rand.nextInt(size);
        return random;
    }

    public static int chooseMon(Player n){
        int currentMon = 0;
        Scanner console = new Scanner(System.in);
        int size = n.pokemon.size();
        if (size == 0){
            return 9999;
        }
        for (var x : n.pokemon){
            System.out.println(x.name);
        }
        for (var i = 0; i < 1000; i++){
            String choice = console.next();
            for(var j = 0; j < n.pokemon.size(); j++){
                if(n.pokemon.get(j).name.equals(choice)){
                    currentMon = j;
                    return currentMon;
                }
            }
            print("Please choose a mon");
        }
        return currentMon;
    }

    public static int checkEnemy(Player n, int current, Pokemon x){
        int y = x.getHealth();
        if (y < 0){
            n.pokemon.remove(current);
            return enemyMon(n);
        }
        else return current;
    }

    public static int checkMon(Player n, int current, Pokemon x){
        int y = x.getHealth();
        if (y < 0){
            n.pokemon.remove(current);
            int nextMon = chooseMon(n);
            return nextMon;
        }
        else return current;
    }



    public static void print(String n){
        System.out.println(n);
    }
    public static void print(int n){
        System.out.println(n);
    }

}
