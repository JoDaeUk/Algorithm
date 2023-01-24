package programmers;

public class 문자_반복_출력하기 {

         public static void main(String[] args) {
             String my_string1 = "helloo";

             System.out.println(solution(my_string1,3));
         }
    public static String solution(String my_string, int n) {
        String answer = "";
        String[] array = my_string.split("");
        for (String s : array){
            answer = answer + s.repeat(n);
        }
        return answer;
    }

}
