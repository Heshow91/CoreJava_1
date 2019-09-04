package dataStructures;

import java.util.LinkedList;

public class LinkedListPractice {
    public static void main(String[] args) {


        LinkedList linkedList = new LinkedList();
        linkedList.add("Mr X");
        linkedList.add("My Z");
        linkedList.add("Mr A");
        linkedList.add("Mr B");
        for (int i = 0; i < linkedList.size(); i++) {
            System.out.println(linkedList.get(i));
            // faster for data manipulation, if we have a lot of data
            // compared to array list

        }
        System.out.println("**********AFTER**************");
        System.out.println(linkedList.getLast());
        System.out.println(linkedList.getFirst());


        System.out.println(linkedList.peek());
        System.out.println(linkedList.element());
        //NOSuch Element exception thrown for element
        // getting top index
        System.out.println(linkedList.remove());
        // removes the first one of the que
        System.out.println("**********AFTER2nd**************");
        for (int i = 0; i < linkedList.size(); i++) {
            System.out.println(linkedList.get(i));

        }
        System.out.println(linkedList.get(0));
        linkedList.set(0, "Mr Random");
        System.out.println(linkedList.getFirst());
    }
}
