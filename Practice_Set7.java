import java.util.Scanner;
// class table{
//   public int multi(int n1, int n2){
//     return n1*n2;
//   }
// }
public class Practice_Set7 {
    public static void main(String[] args){

//Q1 :    Write a Java method to print the multiplication table of a number n.
        // table product = new table();
        //  for(int i=1;i<=10;i++){
        //  int n = product.multi(5,i);
        //    System.out.println(n);
        //}

//Q2 :  Write a program using functions to print the following pattern
        // *
        // **
        // ***
        // ****
        // *****

        // class pattern {
        //   public void star() {
        //     //System.out.print("*");
        //     //System.out.println( );
        //   }
        // }
        // pattern obj1 = new pattern();
        // for (int j = 1; j <= 5; j++)
        //   for(int k=1;k<=j;k++) {
        //     obj1.star();
        //     System.out.print("*");
        //     System.out.println( );
        //   }

//Q3:     Write a recursive function to calculate the sum of first n natural numbers.
        // public class Main {
        //   public static void main(String[] args) {
        //     int result = sum(2);
        //     System.out.println(result);
        //   }
        //   public static int sum(int k) {
        //     if (k > 0) {
        //       return k + sum(k - 1);
        //     } else {
        //       return 0;
        //     }
        //   }
        // }
//Q4 : Write a function to print the following pattern:
        // class pattern1 {
        //     public void star() {
        //       System.out.print("*");
        //       System.out.println( );
        //     }
        //   }
        // pattern1 obj1 = new pattern1();
        // for (int m=5;m>0;m--)
        //   for(int n=0;n<m;n++) {
        //     System.out.print("*");
        //     System.out.println( );
        //   }

//Q5 : Write a function to print the nth term of the Fibonacci series using recursion.
        // public class Fibonacci{
        //   public static int fibonacciRecursion(int n){
        //   if(n == 0){
        //     return 0;
        //   }
        //   if(n == 1 || n == 2){
        //       return 1;
        //     }
        //   return fibonacciRecursion(n-2) + fibonacciRecursion(n-1);
        //   }
        //     public static void main(String args[]) {
        //   int maxNumber = 10;
        //   System.out.print("Fibonacci Series of "+maxNumber+" numbers: ");
        //   for(int i = 0; i < maxNumber; i++){
        //       System.out.print(fibonacciRecursion(i) +" ");
        //     }
        //   }
        // }

//Q6 : Write a function to find the average of a set of numbers passed as arguments.
        // class HelloWorld {
        //     class average {
        //       static int add (int...arr){
        //         int result = 0;
        //         for(int element:arr)
        //           result = result + element;
        //         return result;
        //       }
        //     }
        //     public static void main(String[] args) {
        //         System.out.println(add(1,2,3));
        //     }
        // }

//Q7 : Repeat problem 4 using Recursion.

//Q8 : Repeat problem 2 using Recursion.

//Q9 :  Write a function to convert Celsius temperature into Fahrenheit
        // class Temp {
        //     public double converter(double a1){
        //         return (a1 * 1.8) + 32;
        //     }
        // }
        // class HelloWorld {
        //     public static void main(String[] args) {
        //         Temp conv = new Temp();
        //         double x = conv.converter(38.5);
        //         System.out.println(x);
        //     }
        // }

//Q10 :   Repeat problem 3 using an iterative approach.
        System.out.print("Enter the n natural numbers : ");
        Scanner sc = new Scanner(System.in);
        int y = sc.nextInt();
        int sum = 0;
        for(int r=1;r<=y;r++){
            sum = sum + r;
        }
        System.out.println(sum);
    }
}
