package programmers;

import java.util.Arrays;

public class 짝수는_싫어요 {
    public static void main(String[] args) {

        int numbers = 10;
        System.out.println(Arrays.toString(solution(numbers)));

        int numbers1 = 15;
        System.out.println(Arrays.toString(solution(numbers1)));


    }
        public static int[] solution(int n) {
            int num = 1;

            if(n%2 == 0)
                num = n/2;
            else if(n%2 !=0)
                num = (n+1)/2;
            int[] answer =new int [num];
            num = 0;

            for (int i = 1; i<=n; i++){
                if(i%2 !=0){
                    answer[num]=i;
                    num++;
                }
            }
            return answer;
        }
    }

