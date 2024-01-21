import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {

//while loop : we use while loop when we don't know how many times we need to iterate
//write a program to print natural numbers from 100 to 200
        int n = 100;
        while (n <= 200) {
            System.out.println(n);
            n++;
        }
        System.out.println("Finish running while loop");

//Infinite while loop : while loop will run infinite times if condition won't becomes false if it becomes false it will terminate
//        while (true) {
//            System.out.println("This is an infinite while loop");
//        }
//do-while loop : we use do-while loop if we don't know how many times to iterate and also atmost we have to execute once
// write a program to print first n natural numbers using a do-while loop
        int a = 10;
        do {
            System.out.println(a);
            a++;
        } while(a<6);
        System.out.println("\n");

        int b = 1;
        do {
            System.out.println(b);
            b++;
        }while(b<=12);
//for loop : we use for loop when we know already how times we need to iterate
//write a program to print first n odd and even numbers using a for loop.
// for odd no's it is (2n+1) and for even it is 2n.
        System.out.print("Enter the number ");
        Scanner sc = new Scanner(System.in);
        int c = sc.nextInt();
        for (int i=0;i<=c;i++){
            System.out.println(2*i+1);
            System.out.println(2*i);
        }
//write a program to print first n natural numbers in reverse order
        System.out.print("Enter the positive integer value ");
        Scanner sc1 = new Scanner(System.in);
        int d = sc1.nextInt();
        for (int i=d; i!=0; i--){
            System.out.println(i);
        }

// break and continue statement:
// break statement will exit the loop continouesly and continue statement will skip that condition and executes further statements until the condition is met
// break using for loop
        for(int i =0; i<=5;i++){
            System.out.println(i);
            if(i==2){
                System.out.println("ending the loop");
                break;
            }
        }
// break using do-while loop
         int e = 0;
         do{
             System.out.println(e);
             System.out.println("Java is great");
             if(e==2){
                 System.out.println("ending the loop");
                 break;
             }
             e++;
         }while(e<=5);
        System.out.println("Loop ends here");

// continue using for loop
         for(int j =0; j<=10; j++){
             if(j==2){
                 continue;
             }
             System.out.println(j);

         }
// continue using do-while loop
         int g = 0;
         do {
             g++;
             if(g==3); {
                 System.out.println("ending the loop");
                 continue;
             }

         }while(g<5);
        System.out.println("loop ends here");

    }

}
