package utility;


import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class DataReader {
    public static void main(String[] args) {

        String text;
        String a  = null;
        //null is where we are storing our varibales
        try {
            // created trhe object of the filereader and is required inside the bufferreader
            // using buffer reader we can use readline
            FileReader fileReader = new FileReader("/Users/heshow/Desktop/weekdays august/src/utility/information.txt");

            BufferedReader bufferedReader = new BufferedReader(fileReader);

            while ((text= bufferedReader.readLine()) != null) {
                a = text;

            }
            fileReader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();

        }
        System.out.println(a);

    }
}