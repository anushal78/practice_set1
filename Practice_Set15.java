//Arraylist

import java.util.*;
public class practice_set15 extends Thread{
    public static void main(String[] args) {
        ArrayList<Integer> l1 = new ArrayList<>();
        //To add an elements to arraylist
        l1.add(1);
        l1.add(2);
        l1.add(3);
        l1.add(3,4); //inserts 4 at index 3
        l1.add(5);
        l1.add(5,6);
        System.out.print(l1);

        //To remove an element from arraylist l1.remove(index number)
        System.out.println("Arraylist before removing element : "+ l1);
        l1.remove(1); //here 1 is index not the element
        System.out.println("Arraylist after removing element : "+ l1);

        //to check arraylist contains a specific value or not
        System.out.println("Arraylist contains 3 :" + l1.contains(3)); //true
        System.out.println("Arraylist contains 8 :" + l1.contains(8)); //false

        //Merging of two arrays
        ArrayList<Integer> l2 = new ArrayList<>();
        l2.add(7);
        l2.add(8);
        l2.add(9);
        l2.add(10);
        l2.add(11);
        l2.add(9);
        l2.add(12);
        l2.add(13);

        l1.addAll(l2); // for merging two arrayslist we use this method.
        System.out.println("Arraylist l1 after merging " + l1);
        System.out.print("Arralist l2 " + l2);

        //to find the first occurrence of a specified number in the arraylist we use indexof() method
        System.out.println("The first occurrence of 9 in l2 is at index :" + l2.indexOf(9));
        System.out.println("The last occurrence of 9 in l2 is at index :" + l2.lastIndexOf(9));

        //LinkedList
        LinkedList<Integer> l3 = new LinkedList<>();
        LinkedList<Integer> l4 = new LinkedList<>();
        l3.add(10);
        l3.add(20);
        l3.add(30);
        l3.add(40);
        l4.add(50);
        l4.add(60);
        l4.add(70);
        l4.add(0,80);
        l4.add(0,90);
        l4.add(0,100);
        l4.addAll(0, 12);
        l4.addLast(13);
        l4.addFirst(14);
        System.out.println(l4.contains(27));
        System.out.println(l4.indexOf(27));
        System.out.println(l4.lastIndexOf(6));
        l4.set(1,566);
        for(int i=0;i<l4.size();i++) {
            System.out.print(l4.get(i));
            System.out.print(",");
        }

        //ArrayDeque :
        ArrayDeque<Integer> ad1 = new ArrayDeque<>();
        //To insert an element at front
        ad1.add(6);
        ad1.add(7);
        ad1.add(8);
        ad1.addFirst(9);
        ad1.offerFirst(10);
        ad1.add(11);
        ad1.add(12);
        ad1.add(13);
        ad1.add(14);
        System.out.println(ad1);

        //to insert an element at end
        ad1.addLast(11);
        ad1.offerLast(12);
        System.out.println(ad1);

        //accessing the element from the head(start) of the deque array
        System.out.println(ad1.peekFirst());
        System.out.println(ad1.getFirst());

        //accessing the element from the last
        System.out.println(ad1.peekLast());
        System.out.println(ad1.getLast());

        //removing the first element
        ad1.pollFirst();
        ad1.removeFirst();
        ad1.getFirst();
        System.out.println(ad1);

        //removing the last element
        ad1.pollLast();
        ad1.removeLast();
        ad1.getLast();
        System.out.println(ad1);

        //Hashset
        //insering elements to hashset
        HashSet<Integer> hs1 = new HashSet<>();
        hs1.add(2);
        hs1.add(4);
        hs1.add(6);
        hs1.add(8);
        hs1.add(10);
        hs1.add(12);
        hs1.add(12); //This element will be ignored
        System.out.println(hs1);

        //removing elements from hashset
        hs1.remove(12);
        System.out.println("hashset after removing the elements:" +hs1);
        //checking hashset is empty or not
        HashSet1<Integer> hs2 = new HashSet1<>();
        System.out.println(hs2.isEmpty());
        System.out.println(hs1.isEmpty());

        //removing all the elements from hashset
        //hs1.clear(); //deletes all the elements from hashset
        //System.out.println(hs1);

        //to print the size of the hashset
        System.out.println(hs1.size());
    }
}