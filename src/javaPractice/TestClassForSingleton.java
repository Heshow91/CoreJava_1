package javaPractice;

public class TestClassForSingleton {
    // type of class, so that we can create same objects in multiple places
    // create our constructor as private
    String x;



    private static TestClassForSingleton testClassForSingleton = null;
        private TestClassForSingleton(){
            x="This is a singleton class";
    }

    public static TestClassForSingleton getInstance(){
                // need get instance because its private
            // made method to return the class
        // if object is nul then run second part of the object creating
    if(testClassForSingleton==null){
        // only when the object is null then create the object
        testClassForSingleton = new TestClassForSingleton();

    }
    return testClassForSingleton;
    }


}