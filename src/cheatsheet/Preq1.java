package cheatsheet;

//this is for different java collections and their methods to used during coding interviews

import java.util.ArrayDeque;
import java.util.ArrayList;

public class Preq1 {
    public static void main(String[] args) {
        //Dynamic ArrayList
        System.out.println("----------------------------------------");
        System.out.println("Array List");
        System.out.println("----------------------------------------");
        ArrayList<Integer> list = new ArrayList<Integer>(10);

        list.add(4);
        list.add(5);
        list.add(19);
        list.add(20);

        System.out.println("Size of list: " + list.size());
        System.out.println(list.toString());

        list.remove(2);
        System.out.println("Size of list after removing element at index 2: " + list.size());
        System.out.println(list.toString());
        System.out.println(list.get(2));
        System.out.println(list.set(1,23));
        System.out.println(list.toString());
        System.out.println(list.contains(23));

        System.out.println("----------------------------------------");
        System.out.println("Array Deque");
        System.out.println("----------------------------------------");

        //array deque
        ArrayDeque<Integer>  deque = new ArrayDeque<Integer>(10);

        deque.add(1);
        System.out.println("Size of deque: " + deque.size());
        System.out.println(deque.toString());
        deque.addFirst(3);
        deque.addLast(2);
        System.out.println("Size of deque after adding elements: " + deque.size());
        System.out.println(deque.toString());
        System.out.println(deque.pollFirst());
        System.out.println(deque.pollLast());
        System.out.println(deque.peekFirst());
        System.out.println(deque.peekLast());
        System.out.println("Size of deque elements: " + deque.size());
        System.out.println(deque.toString());

    }
}
