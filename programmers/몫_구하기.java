

package programmers;

public class 몫_구하기 {
    public static void main(String[] args) {

        int num1 = 10;
        int num2 = 5;
        System.out.println(solution(num1,num2));

        num1 = 7;
        num2 = 2;
        System.out.println(solution(num1,num2));
    }

    public static int solution(int num1, int num2) {
        return num1/num2;

    }
}