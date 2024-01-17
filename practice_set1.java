
//Question 1 : To add three numbers.
import java.util.Scanner; //importing Scanner class to take user input
public class practice_set1 {
    public static void main(String[] args) {
        int a = 4;
        int b = 6;
        int c = 10;
        int sum = a+b+c;
        System.out.println(sum);

//Question 2 : To calculate CGPA using marks of 3 subjects
         float sub1 = 56;
         float sub2  = 65;
         float sub3  = 72;
         float cgpa = (sub1+sub2+sub3)/30;
         System.out.println(cgpa);

//Question 3 : Taking input from user and to give output as a greeting with that name
        System.out.println("Enter the name ");
        Scanner name = new Scanner(System.in);
          String person = name.next();
        System.out.println("Hello " + person+","+"have a good day");

//Question 4 : TO convert kilometer to miles
            float k = 2.5f;
            double result = k * 0.621371d;
        System.out.println(result);

//Question 5 : To detect whether a number entered by user is an integer or not
        System.out.println("Enter the number ");
        Scanner number = new Scanner(System.in);
        System.out.println(number.hasNextInt());
//hasNextInt is a method to check whether the given no is integer or not.

    }
}




