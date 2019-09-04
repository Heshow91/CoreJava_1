package javaPractice;

public class ExecutionClassForSingleton {
    public static void main(String[] args) {
        // only for one object
        TestClassForSingleton testClassForSingleton1 = TestClassForSingleton.getInstance();
        TestClassForSingleton testClassForSingleton2 = TestClassForSingleton.getInstance();
        // it wont create a new object, because it is null

        testClassForSingleton1.x= testClassForSingleton1.x.toUpperCase();
        testClassForSingleton2.x= testClassForSingleton2.x.toLowerCase();
        // database connectivity
        // will take the last value
        //-- so this wont work testClassForSingleton2.x=testClassForSingleton2.x.toLowerCase();
        System.out.println(testClassForSingleton1.x);
        System.out.println(testClassForSingleton2.x);

    }
}
