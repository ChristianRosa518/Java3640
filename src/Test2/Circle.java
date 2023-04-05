package Test2;

public class Circle implements Scalable{
    private double radius;
    public Circle(double radius) {
        this.radius = radius;
    }
    public double area() {
        return Math.PI * radius * radius;
    }
    public void scale(double n){
        this.radius = this.radius * n;
      System.out.println("New radius " + this.radius);
    }

   public Circle(int h){
        this.radius = h;
   }

   public Circle(){
        this.radius = 5;
   }
}
