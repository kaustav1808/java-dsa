package cheatsheet;

import java.util.HashMap;
import java.util.HashSet;

public class Preq2 {
    public static void main(String[] args) {
        System.out.println("----------------------------------------");
        System.out.println("Hash Map");
        System.out.println("----------------------------------------");

        //hashmap
        HashMap<Integer, String> map = new HashMap<Integer, String>();
        map.put(1,"a");
        map.put(2,"b");
        map.put(3,"c");
        System.out.println(map.get(1));
        System.out.println(map.get(3));
        System.out.println(map.containsKey(2));
        System.out.println(map.remove(1));
        System.out.println(map.toString());

        System.out.println("----------------------------------------");
        System.out.println("Hash Set");
        System.out.println("----------------------------------------");

        //hashset
        HashSet<Integer> set = new HashSet<Integer>();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(1);
        System.out.println(set.contains(2));
        System.out.println(set.remove(1));
        set.add(2);
        System.out.println(set.toString());
    }
}
