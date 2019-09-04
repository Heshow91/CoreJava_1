package assertion;


import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class TestAssertion {
    public static void main(String[] args) {


        int x = 10;
        int z = 110;
        int a = 13;
        int b = 12;

        // hard assert
        // (actualvalue, expected value
       // Assert.assertEquals(x,z,"Custom Message Assertion failed");
        //
       Assert.assertEquals(a,b);

        // try to assert but if for some reason a is greater than b then we might want it to fail
        if (b > a) {
            Assert.fail("Fail to validate");
        }


        // soft assert continues
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(a,b,"1st try Custom message Assertion failed");
        softAssert.assertEquals(x,z,"2nd try Custom message Assertion failed");

        softAssert.assertAll();




//        if(x==z){
//            System.out.println("matched");
//
//        }else System.out.println("didn't match");

    }
}
