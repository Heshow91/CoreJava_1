package javaPractice;

public class ExceptionTest {
    public static void main(String[] args) {
        //Array --[] index starts from 0
        String[] name = {"Hisham", "Wayel", "Caca"};

        System.out.println(name[0]);
        System.out.println(name[1]);
        System.out.println(name[2]);


        //try -- keyword (-- try block starts
        // body of the try blocks
        // } -- try block ends catch -- keyword( exceptions name which we are trying to catch e --
        // body of the catch block
        //}-- catch block ends

        //if

        try {
            System.out.println(name[3]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("exception occurred");
        }

    }
}



