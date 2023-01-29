package programmers;

import java.util.Arrays;

public class 각도기 {
    public static void main(String[] args) {

        int angle1 = 70;
        int angle2 = 91;
        int angle3 = 180;

        System.out.println(solution(angle1));
        System.out.println(solution(angle2));
        System.out.println(solution(angle3));
    }

    public static int solution(int angle) {
        int answer = 0;
        if(angle < 90) answer = 1;
        else if(angle == 90) answer = 2;
        else if(angle < 180) answer = 3;
        else if(angle == 180) answer = 4;
        return answer;
    }
}
