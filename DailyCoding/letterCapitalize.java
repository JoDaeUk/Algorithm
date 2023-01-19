import java.util.HashMap;

public class letterCapitalize {
    public static void main(String[] args) {
        String output1 = letterCapitalize("hello world");
        System.out.println(output1); // "Hello World"

        String output2 = letterCapitalize("java  is good");
        System.out.println(output2); // "Java  Is Good"
    }

    public static String letterCapitalize(String str) {
        // TODO:
        String[] substr = str.split(" ");
        String result = "";
        for (String s : substr){
            if (!s.isEmpty()) {
                result = result + s.substring(0, 1).toUpperCase() + s.substring(1);
                if(s != substr[substr.length-1]) result += " ";
            }
            else result += " ";
        }

        return str.length() == 0 ? "" : result;

    }
}

