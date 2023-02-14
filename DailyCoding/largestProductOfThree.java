import java.util.Arrays;

public class largestProductOfThree {
    public static void main(String[] args) {
        int output = largestProductOfThree(new int[]{2, 1, 3, 7});
        System.out.println(output); // --> 42 (= 2 * 3 * 7)

        output = largestProductOfThree(new int[]{-1, 2, -5, 7});
        System.out.println(output); // --> 35 (= -1 * -5 * 7)
    }

    public static int largestProductOfThree(int[] arr) {
        // TODO:
        // 오름차순으로 정렬
        Arrays.sort(arr);
        // 가장큰수 3을 곱한수
        int num1 = arr[arr.length-1] * arr[arr.length-2] * arr[arr.length-3];
        // 가장큰수 1과 작은수 2을 곱한수 (음수2와 양수1)
        int num2 =  arr[arr.length-1] * arr[0] * arr[1];
        // 비교해서 더큰수를 출력
        return num1 < num2 ? num2 : num1;
    }
}

