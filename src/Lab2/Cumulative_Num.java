package Lab2;

public class Cumulative_Num {
    public static void main(String[] args) {
    //Scanner();
        //Pow(12, 3);
        repl("test", -1);
    }
    public static void Scanner() {
        int low = 1;
        int high = 1000;
        int sum = 500500;
        for (int i = low; i <= high; i++) {
            sum += i;
        }
        System.out.println("sum = " + sum);
    }

    public static void Pow(int base, int exponent){
        for (int i = 1; i < exponent; i++) {
            base = base * base;
        }
        System.out.println(base);
    }

    public static void repl(String value, int rep ){
        if ( rep == 0 || rep < 0){
            System.out.println("Nada");
            return;
        }
        for (int i = 1; i < rep; i++) {
                value = value + value;
            }
            System.out.println(value);
    }

    public static void longestName(){
    // we haven't talked about scanners or how to get inputs from console. I'll ignore this question for now
        // only because it looks annoying to learn all that for a 3 minute question.
        // cin >> yada yada yada do loop compare length yada yada
    }
}
