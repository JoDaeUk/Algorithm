package programmers;

public class 피자_나눠_먹기_1 {
    public static void main(String[] args) {

        int num1 = 7;
        System.out.println(solution(num1));

        num1 = 1;
        System.out.println(solution(num1));

        num1 = 15;
        System.out.println(solution(num1));
    }


    public static int solution(int n) {
        int answer = (n+6)/7;

        return answer;
    }
}
