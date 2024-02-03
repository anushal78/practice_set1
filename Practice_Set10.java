//Q1 : Create a class circle and use inheritance to create another class cylinder from it

class Circle1{
    int radius;

    Circle1(){
        System.out.println("This is a non param constructor of circle1");
    }
    Circle1(int r){
        System.out.println("This is parameterised constructor");
        this.radius = r;
    }
   //Q3 :Create a method for area and volume in Q1
    public double area(int r){
        return Math.PI*this.radius*this.radius;
    }
}

class Cylinder1 extends Circle1 {
    int height;

    Cylinder1(int r, int h) {
        super(r);
        System.out.println("This is parameterised contructor for cylinder1");
        this.height = h;
    }
    //Q3 :Create a method for area and volume in Q1
    public double volume(){
        return Math.PI*this.radius*this.radius*this.height;
    }
}
//Q2 : Create a class rectangle and use inheritance to create another class cuboid, try to keep it as close to the real-world scenario as possible

class Rectangle2{
    private int length;
    private int breadth;
    Rectangle2() {

    }
    Rectangle2(int l, int b){
        this.length = l;
        this.breadth = b;
    }
    //setters and getters
    //Q4 : create methods for area & volume in 2 also create getters and setters
    public void setLengthBreadth(int l, int b){
        this.length = l;
        this.breadth = b;
    }
    public int getLength(){
        return length;
    }
    public int getBreadth(){
        return breadth;
    }
    //Q4 : create methods for area & volume in 2 also create getters and setters
    public int area(int l, int b){
        return l*b;
    }
}
class Cuboid extends Rectangle2 {
    private int height;
    Cuboid(int l, int b, int h){
        super(l,b);
        this.height = h;
    }
    public void setHeight(int h){
        this.height = h;
    }
    public int getHeight() {
        return height;
    }
    public int volume(){
        return this.getLength()*this.getBreadth()*this.getHeight();
    }

}
public class Practice_Set10 {
    public static void main(String[] args){
        Cylinder1 cir = new Cylinder1(3,4);
        Cuboid cub = new Cuboid(2,3,4);
    }
}
