package programmers;

public class 점의_위치_구하기 {
    public static void main(String[] args) {

        System.out.println(solution(new int[]{2, 4}));
        System.out.println(solution(new int[]{-7,9}));

    }
    public static int solution(int[] dot) {
        int result;
        if(dot[0] * dot[1] > 0) {
            result = 1;
        }
        else {
            result = 2;
        }
        if(dot[1]>0) return result;
        else return result+2;
    }
}
