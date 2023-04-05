package Lab2;

public class While_loops {
    public static void main(String[] args) {
        //one();
        //digitSum(1234);
        //printLetters("string");
        printFactors(12);
    }

    public static void one(){
        int x = 1;
        System.out.print(x);
        while (x < 100) {
            x = x + x;
            System.out.print(", " + x);
        }
    }

    public static void digitSum(int n){
            n = Math.abs(n);
            int sum = 0;

            while(n > 0) {
                sum += n % 10;
                n /= 10;
                System.out.println(n);
            }

            System.out.println(sum);
        }

    public static void printLetters(String value){
        System.out.print(value.charAt(0));                 // |==|==|==|==| fence
        for (int i = 1; i < value.length(); i++) {
            System.out.print("-" + value.charAt(i));      // 1..2..3..4..5
        }
    }
    public static void printFactors(int num){
        System.out.print("1");

        for (int i = 2; i <= num; i++) {
            if (num % i == 0) {
                System.out.print(" and " + i);
            }
        }
    }
}
