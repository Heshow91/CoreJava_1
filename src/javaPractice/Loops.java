package javaPractice;

public class Loops {
    // loops is duplicating the work
    // in order to execute a set of functions or discussions, condition statements to come to truth
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

        // while loop testing for true or false, run the statement if its true exit if false
        int x = 0;
        while (x < 5){
            System.out.println(x+ "Java Books");
            x++;
        }
        // do while loop test condition after we execute the loop
        int s = 0;
        do{
            System.out.println("I love Java");
            s++;
        }
        while(s <5 );
    }
}
