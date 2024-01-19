import java.util.Scanner;

public class Practice_Set5 {
    public static void main(String[] args){
//Q1 : write a program to print the following pattern
/*
 ****

 ***

 **

 *
 */
        int n = 4;
        for(int i=n;i>0;i--){
          for(int j=0;j<i;j++){
              System.out.println("*");
          }
          System.out.println("\n");
      }
//Q2 : Write a program to sum first n even no's using a whle loop
        System.out.print("Enter the number");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int x = 0;
        int sum =0;
        while(x<=a){
            //System.out.println(2*x);
            System.out.println(sum+(2*x));
            x++;
        }
//Q3: Write a program to print the multiplication table of a given number n.
        System.out.print("Enter the number");
        Scanner sc1 = new Scanner(System.in);
        int b = sc.nextInt();
        for(int i=1;i<=10;i++){
            System.out.printf("%d x %d = %d\n",b, i, b*i);
        }
//Q4 : Write a program to print a multiplication table of 10 in reverse order.
       int c = 10;
        for(int j=10;j>0;j--){
            System.out.printf("%d x %d = %d\n", c, j, c*j);
        }
//Q5 : Write a program to find the factorial of a given number using for loops.
       int fact = 1, d = 5;
        for(int k=1;k<=d;k++){
            fact = fact*k;
        }
        System.out.println("Factorial of " + d + " is " + fact);
//Q6 : Repeating Q5 with while loop
        int y = 1, fact1 = 1;
        while(y<=d) {
            fact1 = fact1*y;
            y++;
        }
        System.out.println("Factorial of " + d + " is " + fact1);
//Q7 : Repeat Q1 using while loop.
        int z = 4;
        int m = 1;
        int p = 0;
        while(m<=z && p<m) {
            m--;

                System.out.println("*");
            }
//Q8 :
// What can be done using one type of loop can also be done using the other two types of loops - True or False.
//Answer : True

//Q9 :  Write a program to calculate the sum of the numbers occurring in the multiplication table of 8.
        int q = 8;
        int sum1 = 0;
        for(int l = 1; l<=10; l++) {
            sum1 = sum1+ (q*l);
        }
        System.out.println("sum of the numbers occuring in a multiplication table of 8 is " + sum1);
/*
Q10 :
        A do-while loop is executed:

        1. At least once : This is executed at least once, regardless of whether the condition is true or false.
        2. At least twice: This is executed as long as condition is false.
        3. At most once: This is executed at most once when the loop condition is false from the beginning.
*/
//Q11 :  Repeat problem 2 using for loop.

        System.out.print("Enter the number");
        Scanner sc2 = new Scanner(System.in);
        int r = sc2.nextInt();
        int sum2 = 0;
        for (int s = 0; s<r;s++) {
            System.out.println(sum2+(2*s));
        }
    }
}
