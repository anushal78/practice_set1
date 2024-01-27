//Q1 : create a class cylinder and use getter and setters to set its radius and height
class Cylinder{
    private int radius;
    private int height;
//Q3 : Repeating Q1 using Constructor
    Cylinder(int radius, int height){
        this.radius = radius;
        this.height = height;
    }
    public void setRadius(int r){
        this.radius = r;
    }
    public int getRadius(){
        return radius;
    }
    public void setHeight(int h){
        this.height = h;
    }
    public int getHeight(){
        return height;
    }
//Q2 : calculating surface area and volume using Q1
    public double surface_area(){
        return 2*Math.PI*radius*(radius+height);
    }
    public double volume(){
        return Math.PI*radius*radius;
    }
}
//Q4 : Overload a constructor used to initialize a rectangle of length and breadth using custom parameters
class Rectangle1{
    private int length;
    private int breadth;
    Rectangle1() {
        this.length = 4;
        this.breadth = 5;
    }
    Rectangle1(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    //getters to access private variables from rectangle class
    public int getLength(){
        return length;
    }
    public int getBreadth(){
        return breadth;
    }
}
//Q5 : Repeating a Q1 for a sphere
class Sphere{
    private int radius;
    public void setRadius(int r){
        this.radius = r;
    }
    public int getRadius(){
        return radius;
    }
}
public class Practice_set9 {
    public static void main(String[] args){
        //Q1, Q2, Q3
        Cylinder cyl = new Cylinder(3,2);
        //cyl.setRadius(3);
        //cyl.setHeight(2);
        int x = cyl.getRadius();
        int y = cyl.getHeight();
        System.out.println(x);
        System.out.println(y);
        System.out.println(cyl.surface_area());
        System.out.println(cyl.volume());
        //double surface_area = 2*3.14*x*(x+y);
        //System.out.println("surface area of cylinder : " + surface_area);
        //double volume = 3.14 * x*x;
        //System.out.println("volume of a cylinder : " + volume);

        //Q4:
        Rectangle1 rec = new Rectangle1(24,12);
        System.out.println(rec.getLength());
        System.out.println(rec.getBreadth());

        //Q5 :
        Sphere sph = new Sphere();
        sph.setRadius(5);
        System.out.println(sph.getRadius());

    }
}
