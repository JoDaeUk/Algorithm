package programmers;

public class 문자열_뒤집기 {

         public static void main(String[] args) {
             String my_string1 = "jaron";
             String my_string2 = "bread";

             System.out.println(solution(my_string1));
             System.out.println(solution(my_string2));
         }
    public static String solution(String my_string) {
        StringBuffer sb = new StringBuffer(my_string);
        String answer = sb.reverse().toString();
        return answer;
    }

}
