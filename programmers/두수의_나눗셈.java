package programmers;

public class 두수의_나눗셈 {
    public static void main(String[] args) {
        int num1 = 3;
        int num2 = 2;
        System.out.println(solution(num1,num2));

        num1 = 7;
        num2 = 3;
        System.out.println(solution(num1,num2));

        num1 = 1;
        num2 = 16;
        System.out.println(solution(num1,num2));
    }


        public static int solution(int num1, int num2) {
            int answer;
            float dnum1 = (float)num1;
            float dnum2 = (float)num2;
            answer=(int)(dnum1/dnum2*1000);
            return answer;
        }
    }


