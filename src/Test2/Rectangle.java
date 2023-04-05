package Test2;

public class Rectangle implements Scalable {
    double height;
    double width;
    public void scale(double n){
        this.height = this.height * n;
        this.width = this.width * n;

        System.out.println("New height " + this.height * n);
        System.out.println("New width " + this.width * n);
    }

    public Rectangle(double h, double w){
        this.height = h;
        this.width = w;
    }

    public Rectangle(){
        this.height = 5;
        this.width = 5;
    }
}
