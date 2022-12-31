package programmers;

import java.util.Arrays;

public class 중앙값_구하기 {
    public static void main(String[] args) {

        int[] result = {1, 2, 7, 10, 11} ;
        System.out.println(solution(result));

        int[] result1 = {9, -1, 0};
        System.out.println(solution(result1));

    }
        public static int solution(int[] array) {
            Arrays.sort(array);

            return array[(array.length-1)/2];
        }
    }

