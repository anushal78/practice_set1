//Q1 : Create an ArrayList and store the names of ten students inside it.
// Print it using a for each loop.
import java.util.ArrayList;
import java.util.Date; //Q2
import java.util.Calendar; //Q3
import java.time.LocalDateTime; //Q4
import java.time.format.DateTimeFormatter; //Q4
import java.util.HashSet; //Q5
public class AdvPractice_Set1 {
    public static void main(String[] args){
        ArrayList ar =new ArrayList();
        ar.add("student 1");
        ar.add("student 2");
        ar.add("student 3");
        ar.add("student 4");
        ar.add("student 5");
        ar.add("student 6");
        for(Object o: ar){
            System.out.println(o);
        }
//Q2 : Use the Date class in Java to print the time in the following format : 21:47:02.
        Date d = new Date();
        System.out.println(d.getHours() + ":" + d.getMinutes() + ":" + d.getSeconds());

//Q3 : Repeat question number 2 using the Calendar class.
       Calendar c = Calendar.getInstance();
        System.out.println(c.get(Calendar.HOUR_OF_DAY)+":"+c.get(Calendar.MINUTE)+":"+c.get(Calendar.SECOND));

//Q4 : Repeat question number 2 using java.time API.
       LocalDateTime dt = LocalDateTime.now();//This is date
       DateTimeFormatter df = DateTimeFormatter.ofPattern("H:m:s"); //This is format
       String myDate = dt.format(df); //creating date string using date and format
        System.out.println(myDate);

//Q5 : Create a Set in java. Try to store the duplicate values elements inside this set and verify that only one instance is stored.
         HashSet<Integer> s = new HashSet();
         s.add(5);
         s.add(6);
         s.add(7);
         s.add(8);
         s.add(6);
        System.out.println(s);
    }
}
