package dataStructures.arrayList;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class uniqueValue {
    // you are given an array of int
    //{1,3,2,2,3,7}
    //write code to find the unique values of the array
    //and sort the array

    public static void main(String[] args) {
        //{1,3,2,2,3,10,7,3}
        //1,2,3,7,10 -- should be the out put
        int [] values = {1,3,2,2,3,10,7,3};
        HashSet<Integer> hashSet = new HashSet<>();
        for (int i = 0; i < values.length; i++){
            hashSet.add(values[i]);
        }
        Iterator<Integer> iterator =hashSet.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next()+", ");
        }
        // HashSet does not take duplicates


        }

    }
