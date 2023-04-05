package Lab4;

import java.time.Clock;

public class Classes_and_Objects {
    public static void main(String[] args) {
        //PointClient();
        //pointMain();
        // exe10();
        //ClockTime t0 = new ClockTime(6, 45, "AM");

    }

    // A Rectangle stores an (x, y) coordinate of its top/left corner, a width and height.
    public static class Rectangle {
        private int x;
        private int y;
        private int width;
        private int height;

        // constructs a new Rectangle with the given x,y, width, and height
        public Rectangle(int x, int y, int w, int h){
            this.x = x;
            this.y = y;
            width = w;
            height = h;
        }

        // returns the fields' values
        public String union(Rectangle other){
            int newX = Math.min(x, other.x);
            int newY = Math.min(y, other.y);

            int newWidth = Math.max(other.x + other.width - newX,
                    this.x + this.width - newX);
            int newHeight = Math.max(other.y + other.height - newY,
                    this.y + this.height - newY);

            return "{"+"("+newX+","+newY+")"+","+newWidth+"x"+newHeight+"}";
        }
        public int getX(){
            return x;
        }
        public int getY(){
            return y;
        }
        public int getWidth(){
            return width;
        }
        public int getHeight(){
            return height;
        }

        // returns a string such as {(5,12), 4x8}
        public String toString(){
            return "{"+"("+x+","+y+")"+","+width+"x"+height+"}";
        }

    }
    public static class ClockTime {
        private int hour;
        private int minute;
        private String amPm;

        // Constructs a new time for the given hour/minute
        public ClockTime(int h, int m, String ap){
            hour = h;
            minute = m;
            amPm = ap;
            isWorkTime();
        }

        public void isWorkTime(){
            if (amPm == "PM"){
                hour = hour + 12;
            }

            if ( hour > 9 && hour < 17){
                if ( hour >= 17 && minute > 0 ){
                    System.out.println("false");
                }
                else System.out.println("True");
            }
            else if (hour < 9){
                System.out.println("false");
            }
            else if (hour > 17){
                System.out.println("false");
            }
        }

        // returns the field values
        public String advance(int n){
            hour = hour + (n / 60);
            minute = minute + (n % 60);
            return hour + ":" + minute;

        }
        public int getHour(){
            return hour;
        }
        public int getMinute(){
            return minute;
        }
        public String getAmPm(){
            return amPm;
        }

        // returns a String for this time; for example, "6:27 PM"
        public String toString(){
            return hour + ":" + minute;
        }


    }

    public static class Circle{
        int x;
        int y;
        int radius;
    }
    public static class TimeSpan{
        int hours;
        int minutes;

        public void Span(TimeSpan other){

            if (this.minutes >= 60){
                this.hours = this.hours + 1;
                this.minutes = this.minutes - 60;
            }
            if (other.minutes >= 60){
                other.hours = other.hours + 1;
                other.minutes = other.minutes - 60;
            }

            System.out.println("Difference in hours is: " + Math.abs(this.hours - other.hours));
            System.out.println("Difference in minutes is: " + Math.abs(this.minutes - other.minutes));

        }
    }

    public static class Point {
        int x;
        int y;

        public double distanceFromOrigin() {
            double dist = Math.sqrt(x*x + y*y);
            return dist;
        }

        public int manhattanDistance(Point other){
            int xMan = this.x - other.x;
            int yMan = this.y - other.y;
            return xMan + yMan;
        }

        public void flip(){
            int z = this.x;
            x = this.y;
            y = z;
        }
        public int quadrant(){
            if (x > 0 && y > 0){
                return 1;
            }
            else if ( x < 0 && y > 0){
                return 2;
            }
            else if ( x > 0 && y < 0){
                return 3;
            }
            else if ( x < 0 && y < 0){
                return 4;
            }
            else if ( x == 0 || y == 0){
                return 0;

            }
            else return 0;
        }

        public double distance(Point other) {
            int dx = other.x - x;
            int dy = other.y - y;
            double dist = Math.sqrt(dx*dx + dy*dy);
            return dist;
        }

        public void translate(int dx, int dy) {
            x = x + dx;
            y = y + dy;
        }

        public String toString() {
            return "(" + x + ", " + y + ")";
        }

    }

    public static void PointClient(){
        Point first = new Point();
        Point second = new Point();

        first.x = 8;
        first.y = 2;

        second.x = 4;
        second.y = 3;

        System.out.println("p1 is " + first.toString());
        System.out.println("p2 is " + second.toString());

        Point origin = new Point();

        origin.x = 0;
        origin.y = 0;
        System.out.println("p2 is " + first.distance(origin));

        first.x = 9;
        first.y = 4;

        second.x = 3;
        second.y = 13;

        System.out.println("p1 is " + first.toString());
        System.out.println("p2 is " + second.toString());

    }


    public static class BankAccount {
        String name;
        double balance;
        double transaction;
        double transactionFee = 0.00;

        public void deposit(double amount) {
            balance = balance + amount;
        }

        public void withdraw(double amount) {
            transaction = balance - amount - transactionFee;
            if (transaction < 0){
                balance = balance;
            }
            else {
                balance = transaction;
            }
        }

        public String overview(){
           return String.format(this.name + ", " + this.balance);
        }
    }

    public static void pointMain() {
        Point p1 = new Point();
        p1.x = 81;
        p1.y = 21;
        Point p2 = new Point();
        p2.x = -52;
        p2.y = 32;
        Point p3 = new Point();
        p3.x = -93;
        p3.y = -13;
        Point p4 = new Point();
        p4.x = 64;
        p4.y = -44;
        Point p0 = new Point();
        p0.x = 0;
        p0.y = 0;

        // this code tests the quadrant method
        System.out.println("p1 " + p1 + " quadrant = " + p1.quadrant());
        System.out.println("p2 " + p2 + " quadrant = " + p2.quadrant());
        System.out.println("p3 " + p3 + " quadrant = " + p3.quadrant());
        System.out.println("p4 " + p4 + " quadrant = " + p4.quadrant());
        System.out.println("p0 " + p0 + " quadrant = " + p0.quadrant());
        System.out.println();

        // this code tests the flip method (un-comment it to enable the code)
		p1.flip();
		System.out.println("p1 after flip = " + p1);
		p2.flip();
		System.out.println("p2 after flip = " + p2);
		p3.flip();
		System.out.println("p3 after flip = " + p3);
		p4.flip();
		System.out.println("p4 after flip = " + p4);
		p0.flip();
		System.out.println("p0 after flip = " + p0);
    }

    public static void exe10(){
        Point x = new Point();
        x.x = 5;
        x.y = -17;

        System.out.println(x);

        // I don't know how to do that? how to return java.awt.Point. We haven't learned that.
    }
}

