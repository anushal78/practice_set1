//Q1 : Create an abstract class pen with methods write () and refill () as abstract methods
abstract class Pen{
    abstract void write();
    abstract void refill();
}

//Q2 : Use the pen class from Q1 to create a concrete class fountain pen with additional method change Nib ()
class FountainPen extends Pen{
    void write(){
        System.out.println("Writing with Fountain Pen");
    }
    void refill(){
        System.out.println("Refilling Fountain Pen");
    }
    void changeNib(){
        System.out.println("changing the nib of fountain pen");
    }
}
class Monkey{
    void jump(){
        System.out.println("Moneky is Jumping");
    }
    void bite(){
        System.out.println("Moneky is biting the food");
    }
}

interface BasicAnimal{
    void eat();
    void sleep();
}
class Human extends Monkey implements BasicAnimal{
    void speak() {
        System.out.println("Human is speaking");
    }
    // void eat() will throw error if we won't mention this as public
    public void eat() {
        System.out.println("Human is eating");
    }
    // void sleep() will throw error if we won't mention this as public
    public void sleep() {
        System.out.println("Human is sleeping");
    }
}
//Q4 : Create a class telephone with ( ) , lift ( ) and disconnected ( ) methods as abstract methods create another class smart telephone and demonstrate polymorphism
abstract class Telephone{
    abstract void lift();
    abstract void disconnected();
}
interface SmartTelephone{
    void photo();
    void video();
}
abstract class Samsung extends Telephone implements SmartTelephone{
    void youtube(){
        System.out.println("I can play youtube in samsung mobile");
    }
    public void photo(){
        System.out.println("I can take picture");
    }
    public void video(){
        System.out.println("I can record videos");
    }
}

//Q6 : Create an interface TVremote and use it to inherit another interface smart TVremote
interface TVRemote {
    void on();
    void off();
}
interface SmartTVRemote extends TVRemote{
    void display();
}
//Q7 : Create a class TV which implements TVremote interface from Q6
class TV implements TVRemote {
    public void on(){
        System.out.println("TV is on");
    }
    public void off(){
        System.out.println("TV is off");
    }
    public void display(){
        System.out.println("TV is displaying");
    }
}

class practice_set11{
    public static void main(String[] args){
        //Q1 + Q2
        FountainPen pen = new FountainPen();
        pen.write();
        pen.refill();
        pen.changeNib();

        //Q3 :
        Human anusha = new Human();
        anusha.speak();
        anusha.eat();
        anusha.sleep(); //Throw error becuase it is abstract method but Human is not abstract until we make it as a public
        anusha.bite(); //Throw error becuase it is abstract method but Human is not abstract until we make it as a public

        //Q5 : Demonstrate polymorphism using using monkey  class from Q3
        Monkey mon = new Human();
        mon.jump();
        mon.bite();
        //mon.speak(); //throw error and can't use speak method because the reference is monkey which doesn't have speak() method.
        BasicAnimal ba = new Human();
        ba.eat();
        ba.sleep();

        //Q4:
        Telephone tel = new Samsung();
        tel.lift();
        tel.disconnected();

        SmartTelephone tel1 = new Samsung();
        tel1.photo();
        tel1.video();
        //tel1.youtube();

        //Q7 :
        TV tv = new TV();
        tv.on();
        tv.off();
        tv.display();
    }
}