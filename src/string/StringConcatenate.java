package string;

import java.util.jar.JarOutputStream;

public class StringConcatenate {
    public static void main(String[] args) {
        //a+b+c
        String a = "people";
        String b = "and";
        String c = "tech";
        System.out.println(a+b+c);

        System.out.println("****************");
        //concat
        String x = "Rock";
        String y ="Star";
        String z = x.concat(y);
        System.out.println(z);

        System.out.println("****************");
        //StringBuilder
        // it will keep the
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Rock");
        stringBuilder.append("Star");
        System.out.println(stringBuilder);

        String numbers = "";
        StringBuilder stringBuilder2 = new StringBuilder();
        for (int i= 0; i<5; i++){
            stringBuilder2.append(i);

        }
        System.out.println(stringBuilder2);


        String number ="";
        for (int i= 0; i<5; i++){
            number=number+i;
            //numbers+=i;
        }
        System.out.println("***********");
        System.out.println(number);

    }
}
