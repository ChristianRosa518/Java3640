package Lab2;

import java.util.Random;

public class Random_Num {

    public static void main(String[] args) {
    //rand();

        makeGuesses();
    }

    public static void rand(){
        Random randy = new Random();
        int aRandomNumber = randy.nextInt(10);
        System.out.println(aRandomNumber);
    }

    public static void makeGuesses(){
        Random randy = new Random();
        int aRandomNumber = 0;
        int guesses = 0;
        while (aRandomNumber < 48){
            aRandomNumber = randy.nextInt(50);
            guesses += 1;
            System.out.println(aRandomNumber);
            if (aRandomNumber >= 48){
                System.out.println("Number obtained: " + aRandomNumber);
                System.out.println("Guesses: " + guesses);
            }
        }
    }
}
