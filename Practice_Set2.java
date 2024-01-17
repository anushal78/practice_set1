import java.util.Scanner;
public class Practice_Set2 {
    public static void main(String[] args){
        //Question1: Output of this exp float a = 7/4 * 9/2;
        float b = 7/4.0f * 9/2.0f;
        System.out.println(b);
    //Question2: to encrypt a grade by adding 8 to it. Decrypt it to show the correct grade
         //encrypting the grade
         char grade = 'B';
         grade = (char)(grade+8);
        System.out.println(grade);
        //Decrypting the grade
        grade = (char)(grade-8);
        System.out.println(grade);

    //Question3 to compare whether the given no is greater than the user entered number or not
        int x = 10;
        System.out.println("Enter the number");
        Scanner num = new Scanner(System.in);
        int num1 = num.nextInt();
        System.out.println(num1 > x);

    //Question4 : write following expression in a java program
    // (v^2 - u^2) / 2as
        int v = 5;
        int u = 6;
        int a = 9;
        int s = 10;
        System.out.println(a>8);
        int y = (v*v - u*u) / (2*a*s);
        System.out.println(y);

    //Question5 : find the value of c in given expression
    // a = 7*49/7 + 35/7
        int z = 7;
        int c = 7*49/7 + 35/7;
        System.out.println(c);
    }
}
