package assertion;

import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class TestCalculator {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int value1 = calculator.addition(10,22);
        //give a negative message because it only gives a message when it has failed
        Assert.assertEquals(value1, 32,"Calculator Assertion Failed");


        int value2 = calculator.addition(6,3);
        int value3 = calculator.addition(2,2);
        int value4 = calculator.addition(1,5);

        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(value2,9,"1st try Assertion has Failed");
        softAssert.assertEquals(value3,4,"2nd try Assertion has failed");
        softAssert.assertEquals(value4,4,"3rd try Assertion has failed");

        softAssert.assertAll();


    }
}
