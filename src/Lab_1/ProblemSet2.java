public class ProblemSet2 {

    public static void main(String[] args){
        //   Spikey();
        // lanScript();
        //name();
    }
    public static void Spikey(){
        System.out.println("  \\/");
        System.out.println(" \\\\//");
        System.out.println("\\\\\\///");
        System.out.println("///\\\\\\");
        System.out.println(" //\\\\");
        System.out.println("  /\\");
    }

    public static void lanScript(){
        // I could reduce it more but i decided not too, I show that I can with lanHead and lanLight.
        lanHead();
        System.out.println("");
        lanHead();
        lanLight();
        System.out.println("*************");
        lanHead();
        System.out.println("");
        lanHead();
        System.out.println("    *****    ");
        lanLight();
        lanLight();
        System.out.println("    *****    ");

    }
    public static void lanHead(){
        System.out.println("    *****    ");
        System.out.println("  *********  ");
        System.out.println("*************");
    }

    public static void lanLight(){
        System.out.println("* | | | | | *");
    }

    public static void name() {
        c();
        r();

    }

    public static void c(){
        System.out.println("CCCCCC");
        System.out.println("C");
        System.out.println("C");
        System.out.println("C");
        System.out.println("C");
        System.out.println("C");
        System.out.println("C");
        System.out.println("CCCCCC");
    }

    public static void r(){
        System.out.println("RRRRRR");
        System.out.println("R    R");
        System.out.println("R    R");
        System.out.println("RRRRRR");
        System.out.println("RR    ");
        System.out.println("R R");
        System.out.println("R  R");
        System.out.println("R   R");
    }
    public static void song() {
        System.out.println("Go, team, go!\n" +
                "You can do it.");
        System.out.println("You're the best,\n" +
                "In the West.");
    }
}
