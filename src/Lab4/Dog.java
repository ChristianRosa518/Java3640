package Lab4;

import java.util.Date;

public class Dog{

    public static void main(String[] args){
        Date x = new Date();
        Dog main = new Dog(10, 20, "Gerald", x);
        Dog main2 = new Dog(10, 20, "Fitz Gerald");
        Dog main3 = new Dog();

        main.bark();
        main2.bark();
        main3.bark();
    }
    private double weight;
    private double height;
    private String name;
    private Date birthday;

    public Dog(double h, double w, String n, Date bd){
    this.weight = w;
    this.height = h;
    this.name = n;
    this.birthday = bd;
    }
    public Dog(double h, double w, String n){
        Date x = new Date();
        this.weight = w;
        this.height = h;
        this.name = n;
        this.birthday = x;
    }

    public Dog(){
        Date x = new Date();
        this.height = 100;
        this.weight = 50;
        this.name = "Spot";
        this.birthday = x;
    }


    double getWeight(){
        return weight;
    }

    double getHeight(){
        return height;
    }
    String getName(){
        return name;
    }

    Date getBirthday(){
        return birthday;
    }

    void setWeight(double w){
        this.weight = w;
    }

    void setHeight(double h){
        this.height = h;
    }

    void setName(String s){
        this.name = s;
    }

    void setBirthday(Date d){
        this.birthday = d;
    }

     void bark(){
        System.out.println("Woof woof! I'm " + this.name +"! Bow Wow!");
    }

    double doggieBmi(){
        return this.weight/(this.height * this.height);
    }
}

