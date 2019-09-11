package string;

public class ReversedString {


    // you are given a string
    // create a method which will take a string param
    // and return reversed sting of that


    public String getReversed(String value){

        StringBuilder stringBuilder = new StringBuilder();

        // starting a loop from the last index until 0
        for (int i=value.length()-1;i>=0;i--){
            stringBuilder.append(value.charAt(i));
        }

        return stringBuilder.toString();

    }

    public static String getReversedVia(String value){
        //using string
        String finalText ="";
        for (int i = value.length()-1; i >=0;i--){
            finalText = finalText+value.charAt(i);

        }
        return finalText;
    }
    public static void main(String[] args) {
        System.out.println(getReversedVia("EXAMPLE"));


    }
}
