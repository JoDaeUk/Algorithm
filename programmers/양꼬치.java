package programmers;

import java.util.Arrays;

public class 양꼬치 {
    public static void main(String[] args) {
        System.out.println(solution(10,3));
        System.out.println(solution(64,6));


    }
    public static int solution(int n, int k) {
        int answer = 0;
        k = k - n / 10;
        answer = n * 12000;
        answer = answer + k * 2000;
        return answer;
    }
}