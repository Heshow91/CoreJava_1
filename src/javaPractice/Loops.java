package javaPractice;

public class Loops {
    // loops is duplicating the work

    // for( -- loop condition starts

    // for ( dataType variable = where to start; where to finish ; Increment/Decrement)
    // each ; is a part

    public static void main(String[] args) {

        for (int a = 0; a < 5; a++) {
            System.out.println(a+" Books ");
        }
        // Inner Loop
        // print selenium 5times, and for each time you print selenium, print java 2 times

        for(int x = 0; x < 5; x++){
            System.out.println("Selenium");
            for(int z = 0; z < 2; z++){
                System.out.println("Java");
            }

        }

        // while loop
        int x = 0;
        while (x < 5){
            System.out.println(x+ "Java Books");
            x++;
        }
        // do while loop
        int s = 0;
        do{
            System.out.println("I love Java");
            s++;
        }
        while(s <5 );
    }
}
