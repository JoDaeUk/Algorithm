package programmers;

public class 숫자_비교하기 {
    public static void main(String[] args) {

        int num1 = 2;
        int num2 = 3;
        System.out.println(solution(num1,num2));

        num1 = 11;
        num2 = 11;
        System.out.println(solution(num1,num2));

        num1 = 7;
        num2 = 99;
        System.out.println(solution(num1,num2));
    }

        public static int solution(int num1, int num2) {
            int answer = 0;
            if (num1 == num2)
                return 1;
            else
                return -1;
        }

}
