package programmers;

import java.util.Arrays;

public class 구슬을_나누는_경우의_수 {
    public static void main(String[] args) {

        System.out.println(solution(3,2));
        System.out.println(solution(5,3));

    }
    public static int solution(int balls, int share) {

        return combination(balls,share);
        }
    public static int combination(int n, int m) {
        if (m == 0 || n == m) {
            return 1;
        } else {
            return combination(n-1, m-1) + combination(n-1, m);
        }
    }
}
