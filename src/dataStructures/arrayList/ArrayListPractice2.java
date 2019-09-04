package dataStructures.arrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListPractice2 {

    public static void main(String[] args) {
        ArrayList<String>arrayList=new ArrayList<>();
        arrayList.add("NY");
        arrayList.add("NJ");
        arrayList.add("VA");

        // using for loop
        for (int i=0;i<arrayList.size();i++){
            System.out.println(arrayList.get(i)+" ");
        }
        System.out.println("");

        // to print from array list using Iterator
        Iterator it = arrayList.iterator();
        // while it. has a value it will keep giving the next one****
        while (it.hasNext()){
            System.out.println(it.next());
        }
    }
}

