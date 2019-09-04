package dataStructures.array;

import java.util.ArrayList;
import java.util.Random;

public class RandomNumbers {
    public static void main(String[] args) {

        int [] studentId = new int[5];
            //studentId[0]=10;
            //studentId[1]=1232;

        Random random = new Random();
        for(int i=0;i<5;i++) {
            // running a loop for 5 times
            // going to give a random int from 1-100 and that will store in our new value i
            int newValue = (random.nextInt(100));

            studentId[i] = random.nextInt(100);
            //studentId[i] = newValue;
            // write i because in one go it will insert the values

            System.out.println(studentId.length);
        }

            for(int i = 0; i<studentId.length;i++){

                System.out.println(studentId[i]);
            }

        }
    }


