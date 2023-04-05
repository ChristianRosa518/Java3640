package Lab2;

public class Boolean_Logicx {
    public static void main(String[] args) {
       //allDigitsOdd(234);
        //hasMidpoint(2, 5 , 6);
    }

    public static boolean allDigitsOdd(int n){
        n = Math.abs(n);
        int sum = 0;

        while(n > 0) {
            sum += n % 10;
            if ( sum % 2 == 0){
                return false;
            }
            n /= 10;
        }
        return true;
    }

    public static boolean hasMidpoint(int x, int y, int z){
        int max = Math.max(x, Math.max(y,z));
        int min = Math.min(x, Math.min(y,z));
        int mid = x + y + z - max - min;
        System.out.println(mid);

        if ( max - mid == mid - min){
            System.out.println("true");
            return true;
        }
        System.out.println("false");
        return false;
    }

    public static boolean before(int month, int day, int month2, int day2) {
        if (month2 > month) {
            System.out.println("True");
            return true;
        } else if (month2 < month) {
            System.out.println("False");
            return false;
        } else if (month == month2) {
            if (day2 > day) {
                System.out.println("True");
                return true;
            } else if (day2 < day) {
                System.out.println("False");
                return false;
            } else if (day2 == day) {
                System.out.println("False");
                return false;
            }
        }
        System.out.println("True");
        return true;
    }
}
