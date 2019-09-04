package basic;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
// automation takes one click so it runs a test case really fast, makes methods patermeterized
public class TestReader {


    public static void main(String[] args) {
        try {

            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("src/basic/text2.txt", false));
            // false will replace anything you have in the text file
            // true will add to it
            bufferedWriter.write("Why does the sky look so Nice");
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
