//Q1 : Create a class Employee with the following properties and methods:
//Salary (property) (int)
//getSalary (method returning int)
//name (property) (String)
//getName (method returning String)
//setName (method changing name)
class Employee{
    int salary;
    String name;
    public int getSalary() {
        return salary;
    }
    public String getName(){
        return name;
    }
    public void setName(String n) {
        name = n;
    }
}
//Q2 : Create a class cellphone with methods to print “ringing…”, “vibrating…”, etc.
class CellPhone{
    public void ring() {
        System.out.println("Ringing");
    }
    public void vibrate() {
        System.out.println("Vibrating");
    }
    public void call(){
        System.out.println("Calling");
    }
    public void text(){
        System.out.println("Texting");
    }
}
//Q3 : Create a class Square with a method to initialize its side, calculating area, perimeter etc.
    class Square{
         int n;
//    public int side(int n) {
//        return n;
//    }
//    public int area(int n) {
//        return n*n;
//    }
//    public int peri(int n){
//        return 4*n;
//    }
    public int area(){
        return n*n;
    }
    public int peri(){
        return 4*n;
    }
}
//Q4 : Repeat the third problem for Rectangle
class Rectangle {
    int length;
    int breadth;
    public int area(){
        return length*breadth;
    }
    public int peri(){
        return 2*(length+breadth);
    }
}

//Q5 : Create a class TommyVecetti for Rockstar Games capable of hitting (print hitting…), running, firing, etc.
class TommyVecetti{
    public void hit(){
        System.out.println("Hitting");
    }
    public void run(){
        System.out.println("Running");
    }
    public void fire(){
        System.out.println("Firing");
    }
}
//Q6 : Repeat the fourth problem for a circle
class Circle {
    int r;
    public double area(){
        return 3.14*r*r;
    }
    public double peri(){
        return 2*3.14*r;
    }
}

public class Practice_Set8 {
    public static void main(String[] args){
        //Q1
        Employee anu = new Employee();
        anu.salary = 1000;
        anu.setName("anusha");
        System.out.println(anu.getSalary());
        System.out.println(anu.getName());

        //Q2 :
        CellPhone cell = new CellPhone();
        cell.ring();
        cell.call();
        cell.text();
        cell.vibrate();

        //Q3 :
        Square squ = new Square();
        squ.n = 2;
        System.out.println("area of a square : " + squ.area());
        System.out.println("perimeter of a square : " + squ.peri());

        //Q4 :
        Rectangle rec = new Rectangle();
        rec.length = 3;
        rec.breadth = 2;
        System.out.println("area of a rectangle : "+rec.area());
        System.out.println("perimeter of a rectangle : "+rec.peri());

        //Q5 :
        TommyVecetti tommy = new TommyVecetti();
        tommy.run();
        tommy.hit();
        tommy.fire();

        //Q6 :
        Circle cir = new Circle();
        cir.r = 3;
        System.out.println("area of a circle : "+cir.area());
        System.out.println("perimeter of a rectangle : "+cir.peri());
    }
}
