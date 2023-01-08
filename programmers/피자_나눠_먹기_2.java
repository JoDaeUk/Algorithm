package programmers;

public class 피자_나눠_먹기_2 {
    public static void main(String[] args) {

        int num1 = 6;
        int num2 = 10;
        int num3 = 4;

        System.out.println(solution(num1));
        System.out.println(solution(num2));
        System.out.println(solution(num3));
    }


    public static int solution(int n) {
            int answer = 6;
            while(true) {
                if (answer % n == 0)
                    return answer / 6;
                answer += 6;
            }
    }
}
