package Lab3;
import java.util.*;  // for Scanner

public class Scanners {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        //CollegeAdmit();
        //Sum();
        //longestname(console, 4);
    }
    public static void CollegeAdmit(){
        Scanner console = new Scanner(System.in);
        System.out.println("What is your gpa? ");
        double gpa = console.nextDouble();
        System.out.println("What is your SAT score? ");
        int sat = console.nextInt();

        if (gpa < 1.8 || sat < 900){
            System.out.println("Rejected");
        }
        else{
            System.out.println("Accepted");
        }

    }

    public static void Sum() {
        Scanner console = new Scanner(System.in);
        System.out.println("Enter lowest number ");
        int low = console.nextInt();
        System.out.println("enter highest number ");
        int high = console.nextInt();
        int sum = 0;
        for (int i = low; i <= high; i++) {
            sum += i;
        }
        System.out.println("sum = " + sum);
    }

    public static void longestname(Scanner console, int n){
    String longest = "";
    for (int i = 0; i < n; i++){
        System.out.println("Enter name ");
        String name = console.next();
        if( longest.length() < name.length()){
            longest = name;
        }

    }
        System.out.println(longest);
    }
}
