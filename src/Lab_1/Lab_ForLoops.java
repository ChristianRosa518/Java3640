public class Lab_ForLoops {
    public static void main(String[] args) {
    //Beer();
    //problem9();
        SlashFigure();

    }
    public static void Beer(){
        // don't know how to add variable into string, pretty sure you can do `${}` in js but this idk?
        for (int i = 0; i < 10; i++) {
            var beer = 10 - i;
            var nextBeer = 10 - i - 1;
            System.out.println( beer + " bottles of beer on the wall, " + beer + " bottles of beer\n" +
                    "Take one down, pass it around, " + nextBeer + " bottles of beer on the wall");
        }
    }

    public static void problem3(){
        //set it to 1 to = what it shows.
        for (int i = 1; i < 5; i++) {
            var result = 2 * i;
            System.out.println("2 times " + i + " = " + result);
    }
    }

    public static void problem4(){
        //set it to 1 to = what it shows.
        for (int i = 0; i < 6; i++) {
            var result = 8 + 3 * i;
            System.out.println(result);
        }
    }

    public static void problem5(){
        //set it to 1 to = what it shows.
        for (int i = 0; i < 6; i++) {
            var result = 8 + 3 * i;
            for (int j = 0; j < result; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void problem6() {
        int number = 32;
        for (int count = 1; count <= number; count++) {
            System.out.println(number);
            number = number / 2;
        }
    }
    public static void problem7() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j <= 9; j++){
                for (int k = 0; k < 3; k++){
                    System.out.print(j);
                }
            }
            System.out.println();
        }

    }
    public static void problem8() {
        for (int i = 0; i < 3; i++) {
            for (int j = 9; j >= 0; j--){
                for (int k = 0; k < 5; k++){
                    System.out.print(j);
                }
            }
            System.out.println();
        }

    }
    public static void problem9() {
        for (int i = 0; i < 4; i++) {
            for (int j = 9; j >= 0; j--){
                for (int k = 0; k < j; k++){
                    System.out.print(j);
                }
            }
            System.out.println();
        }

    }
    public static void SlashFigure(){
        int ePoint = 22, slash = 0, bSlash = 0;
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < bSlash; j++) {
                System.out.print("\\");
            }
            for (int k = 0; k < ePoint; k++) {
                System.out.print("!");
            }
            for (int j = 0; j < slash; j++) {
                System.out.print("/");
            }
            ePoint = ePoint - 4;
            slash = slash + 2;
            bSlash = bSlash + 2;
            System.out.println();
        }
    }
}
