package programmers;

import java.time.LocalDate;
import java.util.Arrays;

public class 아이스_아메리카노 {
    public static void main(String[] args) {

        int money1 = 5500;
        int money2 = 15000;

        System.out.println(Arrays.toString(solution(money1)));
        System.out.println(Arrays.toString(solution(money2)));
    }

    public static int[] solution(int money) {
        int[] answer = {0, 0};
        answer[0] = money / 5500;
        answer[1] = money % 5500;
        return answer;
    }
}
