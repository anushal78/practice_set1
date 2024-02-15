import java.util.Scanner;

import static sun.security.util.KeyUtil.validate;

//Q4 : Modify program in Q3 to throw a custom Exception if max retries are reached.
class CustomException extends Exception{

}

public class Practice_Set14 {
    public static void main(String[] args){
        //Q1 : Write a java program to demonstrate syntax, logical 2 runtime errors.
        //int x = 10 //syntax error
        //int age = 20;
        //int yearOfBorn = 2000-78;
        //System.out.println(yearOfBorn); //logical error
        //System.out.println(6/0); //runtime error
//Q2 : Write a java program that prints "HaHa" during Arithmetic exception and "HeHe" during an Illegal argument exception.
        try{
            int i = 0;
            int j = 18/i;
        }
        catch (ArithmeticException e){
            System.out.println("HaHa");
        }
        catch (IllegalArgumentException e){
            System.out.println("HeHe");
        }
//Q3 :  Write a program that allows you to given. If max retries exceed 5 print "errors".
        boolean flag = true;
        int [] marks = new int[3];
        marks[0] = 7;
        marks[1] = 56;
        marks[2] = 6;
        Scanner sc = new Scanner(System.in);
        int index;
        int i =0;
        //Q5 :Wrap the program in Q3 inside a method which throws your custom Exception.
        while(flag && i<5) {
            try{
                System.out.println("enter the value of index");
                index = sc.nextInt();
                System.out.println("The value of marks[index] is " + marks[index]);
                break;
            }
            catch (Exception e) {
                System.out.println("Invalid index");
                i++;
            }
        }
        if(i>=5){
            System.out.println("Error");
        }

        //Q4 :
        try{
            validate(2);
        }
        catch (CustomException ex) {
            System.out.println("caught the exception");
            System.out.println("Exception occured :" + ex);
        }
        System.out.println("rest of the code");
    }
}
