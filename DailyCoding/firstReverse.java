import java.util.HashMap;

public class  firstReverse{
    public static void main(String[] args) {
        String output = firstReverse("codestates");
        System.out.println(output); // "setatsedoc"

        output = firstReverse("I love codestates");
        System.out.println(output); // "setatsedoc evol I"
    }

    public static String firstReverse(String str) {
        // TODO:
        return new StringBuilder(str).reverse().toString();

        //   StringBuilder sb = new StringBuilder(str);
        //   return sb.reverse().toString();
        // }
    }
}

