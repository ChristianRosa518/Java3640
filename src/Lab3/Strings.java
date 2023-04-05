package Lab3;
import java.util.*;  // for Scanner

public class Strings {
    public static void main(String[] args) {
    ProcessName();

    }

        public static void ProcessName() {
            Scanner console = new Scanner(System.in);
            System.out.print("Type your name: ");
            String fname = console.next();
            String lname = console.next();


            System.out.println("Your name is: " + lname + " " + fname.charAt(0));
        }

}
