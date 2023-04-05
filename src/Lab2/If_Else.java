package Lab2;

public class If_Else {

    public static void main(String[] args) {
    //numUnique(10, 10 ,120);
        //Quadrant(-10.2,0);
        //factoring(2.3);
        fix();
    }


    public static void mystery(int n) {
        System.out.print(n + " ");
        if (n > 10) {
            n = n / 2;
        } else {
            n = n + 7;
        }
        if (n * 2 < 25) {
            n = n + 10;
        }
        System.out.println(n);
    }

    public static void numUnique(int x, int y, int z){
        if ( x == y && y == z){
            System.out.println("All three match");

        }
        else if ( x == y || y == z || x == z){
            System.out.println("Two match");
        }
        else{
            System.out.println("No match");
        }
    }

    public static void Quadrant(double x, double y){
        if (x > 0 && y > 0){
            System.out.println("Quadrant 1");
        }
        else if ( x < 0 && y > 0){
            System.out.println("Quadrant 2");
        }
        else if ( x > 0 && y < 0){
            System.out.println("Quadrant 3");
        }
        else if ( x < 0 && y < 0){
            System.out.println("Quadrant 4");
        }
        else if ( x == 0 || y == 0){
            //return 0
            System.out.println("0");
        }
    }

    public static void factoring(double gpa) {
        int credits = -1;
        if (gpa == 4.0) {
            credits = 5;
            System.out.println("I'm valedictorian for this class! Woo hoo!");
            System.out.println("I made the dean's list for this class!");
        } else if (gpa >= 3.5) {
            credits = 5;
            System.out.println("I made the dean's list for this class!");
        } else {
            credits = 5;
        }

        if (gpa < 1.5) {
            System.out.println("Uh-oh..I probably should have studied a little more.");
        }
        System.out.println("I received " + credits + " credits for this class.");
    }

    public static void fix() {
        // smaller?
        int a = 7, b = 42;
        minimum(a, b);

    }

    public static void minimum(int a, int b) {  // returns which int is smaller
        if (a < b) {
            int smaller = a;
                System.out.println("a is the smallest!");
        } else if (a > b) {
            int smaller = b;
        }
    }

    public static void seeMovie(double cost, double rating){
        if ( cost < 5.00){
            System.out.println("See Movie");
        }
        else if ( cost > 12.00 && rating == 5.00){
            System.out.println("Consider seeing movie");
        }
        else if ( cost < 12.00 && rating == 5.00){
            System.out.println("Absolutely see movie");
        }
        else if ( cost > 5 && cost < 12 && rating > 2.00 && rating < 4){
            System.out.println("Ponder seeing movie");
        }
        else {
            System.out.println("Don't see Movie");
        }
    }
}

