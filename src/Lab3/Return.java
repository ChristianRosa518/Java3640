package Lab3;

public class Return {
    public static void main(String[] args) {
        System.out.print(pay(5.5,6));

    }
    public static double pay(double x, int y ){
        if ( y > 8){
            double base = x * 8;
            double overtime = x * 1.5 * (y - 8);
            return (base + overtime);
        }
        return (x * y);
    };
}
