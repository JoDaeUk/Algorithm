package programmers;

public class 외계행성의_나이 {
    public static void main(String[] args) {

        System.out.println(solution(23));
        System.out.println(solution(51));
        System.out.println(solution(100));
    }
    public static String solution(int age) {
        String agestr = String.valueOf(age);
        String answer = "";
        for(int i=0;i<agestr.length();i++){
            answer+=(char)(agestr.charAt(i)+49);
        }
        return answer;
    }
}
