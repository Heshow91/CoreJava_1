package dataStructures.array;

import java.util.Scanner;

public class ScannerArray {

    // Create an array and store 5 numbers from console
    // and print all the values from array

    public static void main(String[] args) {
        int[] StudentID = new int[5];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Value");


        System.out.println(StudentID.length);

        for (int i = 0; i < 5; i++) {
            System.out.println(StudentID[i]);

        }
    }
}