package programmers;

import java.util.Arrays;

public class 최빈값_구하기 {
    public static void main(String[] args) {

        int[] result = {1, 2, 3, 3, 3, 4};
        System.out.println(solution(result));

        int[] result1 = {1, 1, 2, 2};
        System.out.println(solution(result1));

        int[] result2 = {1};
        System.out.println(solution(result2));

    }

    public static int solution(int[] array) {
        int answer = -1;
        int count1 = 1;
        int count2 = 1;
        Arrays.sort(array);

        if (array.length == 1)
            answer = array[0];

        else {
            for (int i = 1; i < array.length; i++) {
                if (array[i - 1] == array[i]) {
                    count1++;

                    if (count1 == count2) {
                        answer = -1;
                    } else if (count1 > count2) {
                        count2 = count1;
                        answer = array[i - 1];
                    }

                } else
                    count1 = 1;

            }
        }


        return answer;
    }
}