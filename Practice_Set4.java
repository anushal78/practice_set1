
import java.util.Scanner;
public class Practice_Set4 {
    public static void main(String[] args) {
        //Question1 : what will be the output of following program
        /*
        * int a = 10;
         if (a=11)
        System.out.println(“I am 11”);
         else
        System.out.println(“I am not 11”);
        * */
        int a = 11;
        if (a == 11) {
            System.out.println("I am 11");
        } else {
            System.out.println("I am not 11");
        }
//Question2
        /*
         * Write a program to find out whether a student is pass or fail;
         * if it requires a total of 40% and at least 33% in each subject to pass.
         *  Assume 3 subjects and take marks as input from the user.*/
        float sub1, sub2, sub3, total;
        Scanner marks = new Scanner(System.in);
        System.out.print("Enter the marks of sub1 ");
        sub1 = marks.nextInt();
        System.out.print("Enter the marks of sub2 ");
        sub2 = marks.nextInt();
        System.out.print("Enter the marks of sub3 ");
        sub3 = marks.nextInt();
        total = ((sub1 + sub2 + sub3) / 300) * 100;
        System.out.println("Your total percentage is " + total);

        if (total >= 40 && sub1 >= 33 && sub2 >= 33 && sub3 >= 33) {
            System.out.println("PASS");
        } else {
            System.out.println("FAIL");
        }
//Question3 :
/*
Calculate income tax paid by an employee to the government
as per the slabs mentioned below.there is not tax below 2.5L.
*Take the input amount as input from the user
* 2.5L- 5.0L -> 5%, 5.0 l-10.0L-> 20%, above 10.0L -> 30%
*/
        float tax = 0;
        Scanner salary = new Scanner(System.in);
        System.out.print("Enter your income in lakhs per annum: ");
        float income = salary.nextFloat();
        if (income <= 2.5f) {
            tax = tax + 0;
            //System.out.println("You are not eligible for paying the tax");
        } else if (income >= 2.5f && income <= 5f) {
            tax = tax + 0.05f * (5.0f - 2.5f);

            System.out.println("Total tax paid by the employee is " + tax);
        } else if (income >= 5.0f && income <= 10.0f) {
            tax = tax + 0.05f * (5.0f - 2.5f);
            tax = tax + 0.2f * (income - 5f);
            System.out.println("Total tax paid by the employee is " + tax);
        } else if (income >= 10.0f) {
            tax = tax + 0.05f * (5.0f - 2.5f);
            tax = tax + 0.05f * (10.0f - 5f);
            tax = tax + 0.2f * (income - 10.0f);
            System.out.println("Total tax paid by the employee is " + tax);
        }

//Question4 :
        /*
         *Write a Java program to find out the day of the week given the number
         *[1 for Monday, 2 for Tuesday … and so on!]*/
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number between 1 to 7 : ");
        int day = sc.nextInt();
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid number");
        }


//Question 5 :
        /*
         * Write a Java program to find whether a year entered by the user is a leap year or not.*/

        System.out.print("Enter the year ");
        Scanner sc1 = new Scanner(System.in);
        int year = sc.nextInt();
        if (year % 4 == 0) {
            System.out.println(year + " is a leap year");
        } else {
            System.out.println(year + " is not a leap year");
        }
//Question 6 : Write a program to find out the type of website from the URL:
// .com = commercial website; .org=organization website; .in = indian website

        System.out.print("Enter the website ");
        Scanner s = new Scanner(System.in);
        String webSite = s.next();
        if (webSite.endsWith(".com")) {
            System.out.println(webSite + " is an commerical website");
        } else if (webSite.endsWith(".org")) {
            System.out.println(webSite + " is an organization website");
        } else if (webSite.endsWith(".in")) {
            System.out.println(webSite + " is an indian website");
        } else {
            System.out.println(webSite + " is other website");
        }
    }
}
