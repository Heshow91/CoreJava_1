package string;

public class StringCompare {
    public static void main(String[] args) {
        String value = "peoplentech";
        String value2 = "people";
        String value3 ="PEOPLE";

        System.out.println(value.compareTo(value2));
        // compares the values differences
        System.out.println(value.compareToIgnoreCase(value3));
        // to compare between case sensitive cases, we might not know if it is caps or lowercase

        //ends with and starts with
        System.out.println(value.endsWith("h"));
        System.out.println(value.startsWith("p"));

        //replace
        System.out.println(value.replace('n','&'));

        //too.println(value.toUpperCase());
        System.out.println(value.toUpperCase());
        System.out.println(value.toLowerCase());


    }
}
