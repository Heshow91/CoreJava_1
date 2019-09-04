package string;

import com.sun.tools.javac.comp.Flow;

public class StringConvert {


    public static void main(String[] args) {
        //Homework
        // String ---> to decimal, boolean
        //Boolean.valueOf();
        // Float.valueOf();

        String a = "10";
        //include this 10 into an int
        Integer b = Integer.valueOf(a);
        System.out.println(b);

        //using Integer.parseInt()

        int c = Integer.parseInt(a);
        System.out.println(c);

        //

        String x = "12A";
        try {
            Integer y = Integer.valueOf(x);
            System.out.println(y);
            //when trying to add a string value into an integer we will get a NumberFormatException
        } catch (NumberFormatException ee) {
            System.out.println("NumberFormatException");
            ee.printStackTrace();
            // use stack trace because from the report we can see it easier
        }


    }

}
