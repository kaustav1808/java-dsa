package cheatsheet;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.TreeMap;

public class Preq3 {
    public static void main(String[] args) {
        System.out.println("----------------------------------------");
        System.out.println("Linked HashMap");
        System.out.println("----------------------------------------");

        //linkedhashmap (guranted order of insertion)
        LinkedHashMap<Integer, String> map = new LinkedHashMap<Integer, String>();
        map.put(1,"a");
        map.put(2,"b");
        map.put(3,"c");
        System.out.println(map);
        System.out.println(map.get(1));
        System.out.println(map.replace(2,"d"));
        System.out.println(map);

        System.out.println("----------------------------------------");
        System.out.println("Tree Map");
        System.out.println("----------------------------------------");

        //tree map (sorted order of keys)
        TreeMap<Integer, String> treeMap = new TreeMap<Integer, String>();
        treeMap.put(3,"c");
        treeMap.put(1,"a");
        treeMap.put(2,"b");
        System.out.println(treeMap);
        System.out.println(treeMap.get(3));
        System.out.println(treeMap.firstKey());
        System.out.println(treeMap.lastKey());
        Map.Entry<Integer, String> firstEntry = treeMap.firstEntry();
        Map.Entry<Integer, String> lastEntry = treeMap.lastEntry();
        System.out.println(firstEntry.getValue());
        System.out.println(lastEntry.getValue());

        System.out.println("----------------------------------------");
        System.out.println("Priority Queue");
        System.out.println("----------------------------------------");

        //Priority Queue
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>(5);
        pq.add(1);
        pq.add(21);
        pq.add(42);
        pq.add(96);
        System.out.println(pq.offer(5));
        System.out.println(pq);
        System.out.println(pq.poll());
        System.out.println(pq.peek());
        System.out.println(pq);
        System.out.println(pq.remove(21));
        System.out.println(pq);

    }
}
