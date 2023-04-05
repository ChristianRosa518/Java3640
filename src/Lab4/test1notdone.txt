package Lab4;

import java.util.*;

public class Test{

    public static void main(String[] args){
        System.out.println(sum(5));
        System.out.println(positiveQuadratic(1,1,1));
        nameAbbreviator();
        System.out.println(areEqual("boat", "BOAT"));
        fizzBuzz(20);
    }

    public static int sum(int x){
        int y = 0;
        for (int i = 1; i <= x; i++){
            y += i;
        }
        return y;
    }

    public static double positiveQuadratic(double a, double b, double c){
        double d = b * -1;
        return (d + Math.sqrt(Math.abs((b*b)-(4*a*c))))/(2*a);
    }

    public static void nameAbbreviator(){
    Scanner console = new Scanner(System.in);
        System.out.println("What is your first name? ");
        String first = console.next();
        System.out.println("What is your last name? ");
        String last = console.next();

        String firstInit = first.substring(0, 1);
        String lastInit = last.substring(0 , 1);

        System.out.println("Hi " + firstInit + "." + lastInit);
        System.out.println("or can I call you " + first + "?");
    }

    public static boolean areEqual(String s1, String s2){
        s1 = s1.toLowerCase();
        s2 = s2.toLowerCase();

        if (s1.equals(s2)){
            return true;
        }
        else return false;

    }

    public static void fizzBuzz(int n){
        for(int i = 1; i <= n; i++) {
            if (i % 15 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");

            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else System.out.println(i);
        }
    }

}

