package dataStructures;

import java.util.ArrayList;
import java.util.jar.JarOutputStream;

public class ArrayListPractice {
    //extends abstract list and implements
    public static void main(String[] args) {
        // can grow in a dynamic way, array only specified
        ArrayList arrayList = new ArrayList();
        arrayList.add("Mr X");
        arrayList.add("Mr Y");
        arrayList.add("Mr Z");
        System.out.println(arrayList.get(0));

        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i));
        }
        System.out.println(arrayList.size());
        arrayList.remove(2);
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i));
        }
        System.out.println(arrayList.size());

        System.out.println(arrayList.get(1));
        arrayList.clear();
        System.out.println(arrayList.size());

        System.out.println("******************");


        ArrayList<String> stringArrayList = new ArrayList<>();
        stringArrayList.add("Ron");
        stringArrayList.add("John");
        for (int i = 0; i < stringArrayList.size(); i++) {
            System.out.println(stringArrayList.get(i));
        }
    }
}
