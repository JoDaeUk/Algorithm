import java.util.Arrays;

public class readVertically {
    public static void main(String[] args) {
        String[] input = new String[]{
                "hello",
                "wolrd",
        };
        String output = readVertically(input);
        System.out.println(output); // --> "hweolllrod"

        input = new String[]{
                "hi",
                "wolrd",
        };
        output = readVertically(input);
        System.out.println(output); // --> "hwiolrd"
    }

    public static String readVertically(String[] arr) {
        // TODO:
        String result = "";
        // 문자열중 가장 긴 문자열 찾아서 변수 num에 넣기
        int num = 0;
        for (String s : arr){
            if(num < s.length()){
                num = s.length();
            }
        }
        // 반복문
        for (int i=0; i<num; i++){
            for(String s : arr){
                if(s.length()>i){
                    result = result + s.substring(i,i+1);
                }
            }
        }
        return result;
    }
}