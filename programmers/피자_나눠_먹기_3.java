package programmers;

public class 피자_나눠_먹기_3 {
    public static void main(String[] args) {

        int num1 = 10;
        int num2 = 12;

        int slice1 = 7;
        int slice2 = 4;

        System.out.println(solution(slice1, num1));
        System.out.println(solution(slice2, num2));
    }

    public static int solution(int slice, int n) {
        return n % slice == 0 ? n / slice : n / slice + 1;
    }
}
