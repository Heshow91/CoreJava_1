package basic;

public class TestMethods {


    public static void main(String[] args) {
       firstMath();
       secondMath(4,11);
    }
// hardcoded
    public static void firstMath(){
        int a = 10;
        int b = 11;
        int c = a+b;
        System.out.println(c);
    }
    // what ever our values are it will return the value
    public static void secondMath(int a, int b){
        int c = a+b;
        System.out.println(c);
    }
    
}
