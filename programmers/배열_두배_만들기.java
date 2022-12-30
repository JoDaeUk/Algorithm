package programmers;

import java.util.Arrays;

public class 배열_두배_만들기 {
    public static void main(String[] args) {

        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(solution(numbers)));

        int[] numbers1 = {2, 4, 200, -198, 2, 4, 6};
        System.out.println(Arrays.toString(solution(numbers1)));


    }
        public static int[] solution(int[] numbers) {
            int[] answer = new int[numbers.length];
            for(int i=0 ; i<numbers.length ; i++){
                answer[i]=numbers[i]*2;
            }
            return answer;
        }


}
