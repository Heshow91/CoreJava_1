package string;

public class Split {

    public static void main(String[] args) {
        // how many duplicate values there are

        String st = "Java is a programming language. Java is also an island of Indonesia";

        // a way to split the string
        //[] = array
        String[] words = st.split(" ");
        System.out.println(words.length);

    }
}
