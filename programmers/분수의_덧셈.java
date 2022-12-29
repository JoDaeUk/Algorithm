package programmers;

import java.util.Arrays;

public class 분수의_덧셈 {
    public static void main(String[] args) {
        int[] answer1 = {0,2};

        int num1 = 2;
        int num2 = 4;
        int denum1=1;
        int denum2=3;
        System.out.println(Arrays.toString(solution(denum1,num1,denum2,num2)));

        denum1 = 9;
        num1 = 2;
        denum2 = 1;
        num2 = 3;
        System.out.println(Arrays.toString(solution(denum1,num1,denum2,num2)));
    }
    public static int[] solution(int denum1, int num1, int denum2, int num2) {
            int[] answer = {0,0};
            int denum=0;
            int bnum=0;
            if(num1!=num2){
                denum=denum1*num2+denum2*num1;
                num1=num1*num2;
            }
            else
                denum = denum1 + denum2;

            for(int i=1; i<=denum && i<=num1; i++)
            {
                if(denum%i==0 && num1%i==0)
                {
                    bnum = i;
                }
            }

            answer[0] = denum/bnum;
            answer[1] = num1/bnum;
            return answer;
        }
    }

