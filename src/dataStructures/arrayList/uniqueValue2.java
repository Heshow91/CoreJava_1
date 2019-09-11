package dataStructures.arrayList;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class uniqueValue2 {
    public static void main(String[] args) {
        int [] array = {1,3,2,2,3,10,7,3};

        ArrayList arrayList = new ArrayList();
        for (int i=0; i<array.length;i++){
            boolean flag = false;

            for (int j=0; j<i; j++){
                if (array[i]==array[j]){
                    flag = true;
                    break;
                }
            } // ! NOT so in this case it will bring a false
            if (!flag){
                arrayList.add(array[i]);
            }
        }
        Collections.sort(arrayList);
        System.out.println(arrayList);

    }
}
