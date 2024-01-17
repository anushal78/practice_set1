
// To calculate the percentage of a given student in CBSE board exam. Marks of his 5 subjects must be taken as input from the user.
import java.util.Scanner;
public class Exercise1 {
    public static void main (String[] args){

        Scanner marks = new Scanner(System.in);
        System.out.println("Enter the marks of sub1");
        float sub1 = marks.nextInt();
        System.out.println("Enter the marks of sub2");
        float sub2 = marks.nextInt();
        System.out.println("Enter the marks of sub3");
        float sub3 = marks.nextInt();
        System.out.println("Enter the marks of sub4");
        float sub4 = marks.nextInt();
        System.out.println("Enter the marks of sub5");
        float sub5 = marks.nextInt();
        //float total = sub1+sub2+sub3+sub4+sub5;
        float total = ((sub1+sub2+sub3+sub4+sub5)/500)*100;
        System.out.println(total);
    }
}
