//Q1 : Write a program to print "Good morning" and "Welcome" continuously on the screen in Java using threads.
class Thread1 extends Thread{
    public void run(){
        while(true){
            System.out.println("Good Morning");
        }
    }
}
class Thread2 extends Thread{
    public void run(){
        while(true){
            System.out.println("Welcome");
        }
    }
}

//Q2 : Add a step method in the welcome thread of question 1 to delay its execution for 200ms.
class Thread3 extends Thread {
    public void run() {
        try {
            Thread.sleep(200);
        }
        catch(InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Welcome");
    }
}

//Q3 : Demonstrate gerPriority() and setPriority() methods in Java threads.
class Thread4 extends Thread {
    public void run(){
        System.out.println("Thread of highest priority is running");
    }
}
class Thread5 extends Thread {
    public void run(){
        System.out.println("Thread of medium priority is running");
    }
}
class Thread6 extends Thread {
    public void run(){
        System.out.println("Thread of lowest priority is running");
    }
}
public class Practice_Set13 {
    public static void main(String[] args){
        //Q1 :
        Thread1 t1 = new Thread1();
        Thread2 t2 = new Thread2();
        t1.start();
        t2.start();
        //Q2 :
        Thread3 t3 = new Thread3();
        t3.start();

        //Q3 :
        Thread4 t4 = new Thread4();
        Thread5 t5 = new Thread5();
        Thread6 t6 = new Thread6();
        t4.start();
        t5.start();
        t6.start();
        t4.setPriority(10);
        t5.setPriority(5);
        t6.setPriority(1);
        System.out.println(t4.getPriority());
        System.out.println(t5.getPriority());
        System.out.println(t6.getPriority());
    }
}
