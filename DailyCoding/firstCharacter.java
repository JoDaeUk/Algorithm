public class firstCharacter {
    public static void main(String[] args) {
        String output = firstCharacter("hello world");
        System.out.println(output); // --> "hw"

        output = firstCharacter(
                "The community at Code States might be the biggest asset"
        );
        System.out.println(output); // --> "TcaCSmbtba"
    }

    public static String firstCharacter(String str) {
        // TODO:
        String[] array = str.split(" ");
        String result = "";
        for (String s : array){
            result = result + s.substring(0, 1);;
        }
        return result;


    }
}