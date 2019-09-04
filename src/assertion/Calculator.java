package assertion;

import org.testng.annotations.Test;

public class Calculator {

    public int addition(int a, int b){

        return a+b;
    }
    @Test
    // we use test when we wana test and use many main methods
    public void additionExecutable(){
        System.out.println(10+11);
    }

    public int additions(int a, int b){

        int c = a+b;
        return c;
    }
}
