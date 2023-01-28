package programmers;

public class 특정_문자_제거하기 {

         public static void main(String[] args) {
             String my_string1 = "abcdef";
             String letter1 = "f";
             String my_string2 = "BCBdbe";
             String letter2 = "B";

             System.out.println(solution(my_string1,letter1));
             System.out.println(solution(my_string2,letter2));
         }
    public static String solution(String my_string, String letter) {
        String answer = "";
        for(int i=0; i < my_string.length();i++){
            if(my_string.substring(i,i+1).equals(letter)){
            }
            else {
                answer = answer + my_string.substring(i,i+1);
            }
        }
        return answer;
    }

}
