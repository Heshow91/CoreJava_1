package dataStructures;

import java.util.HashMap;

// hashMap and ArrayList go over like crazy because its very important
public class HashMapPractice {
    public static void main(String[] args) {
        // we can specify what we want to store with HashMap
        // each key we can store values
        // must use <>
        HashMap<Integer, String> hashMap = new HashMap<>();
        //out 1st is a ket and 2nd is a value
        hashMap.put(1, "NYC");
        hashMap.put(2, "NJ");
        hashMap.put(3, "VA");
        // implements map and extracts the Abstract
        System.out.println(hashMap);

        System.out.println(hashMap.size());

        System.out.println(hashMap.get(3));
        // contains key is for boolean to see if that key exist or not
        System.out.println(hashMap.containsKey(3));
        System.out.println(hashMap.containsKey(4));


        HashMap<String, Integer> hashMap2 = new HashMap<>();
        hashMap2.put("NYC", 1);
        hashMap2.put("NJ", 2);
        hashMap2.put("VA", 3);

        System.out.println(hashMap2.containsKey("NYC"));

        //hashMap2.containsValue()
        //hashMap2.put()


    }
}
