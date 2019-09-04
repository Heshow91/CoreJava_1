package sorting;

public class InsertionSort {
    public static void main(String[] args) {
// ZUHA KNOWS THIS SO BOTHER HIM
        int [] arrayOfNumbers = {22,1,33,42,4,7,2,9};

        for (int i = 1; i <arrayOfNumbers.length; i++){
            int j = i-1;
            int point = arrayOfNumbers[i];

            while (j>=0 && arrayOfNumbers[j]>point){
                arrayOfNumbers[j+1]= arrayOfNumbers[j];
                j=j-1;

            }
            arrayOfNumbers[j+1]=point;
        }
        for (int x = 0; x <arrayOfNumbers.length; x++){
            System.out.println(arrayOfNumbers [x]);
        }


    }
}
