package Lab3;

public class Parameters {
    public static void main(String[] args) {
    //printGrid(4, 6);
//        printSquare(3,6);
        num(110);
    }
    public static void printGrid(int x, int y){
        for (int i = 1; i <= x; i++) {
            for (int j = 0; j < y; j++) {
                int k = i + (j * 4);
                System.out.print(k + " ");
            }
            System.out.println();
        }
    }

    public static void num(int x){
        int i, j = 0;
        for (i = 0; i < x; i++){
            j = j + i ;
        }
        System.out.println(j);
    }

    public static void printSquare(int min, int max){
        for (int i = min; i <= max; i++) {

            for (int j = i; j <= max; j++) {
                System.out.print(j);
            }

            for (int j = min; j < i; j++) {
                System.out.print(j);
            }

            System.out.println();
        }
    }
}
