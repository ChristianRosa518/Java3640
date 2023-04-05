package Test2.Section3.Shapes;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
    ThreePointOne();

    ArrayList<Shape> num = new ArrayList<>();

    Circle circ = new Circle(3);
    Circle circer = new Circle(5);
    Rectangle rect = new Rectangle(4, 5);
    Rectangle recter = new Rectangle(6, 8);

    num.add(circ);
    num.add(circer);
    num.add(rect);
    num.add(recter);
        totalArea(num);
    }

    public static void ThreePointOne(){
        System.out.println("The shape interface requires them to both implement the method area");
    }

    public static void totalArea(ArrayList<Shape> n){
        double y = 0;
    for (int i = 0; i < n.size(); i++){
        y = y + n.get(i).area();
    }
    System.out.println(y);
    }
}
