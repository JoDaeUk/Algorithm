import java.util.Arrays;
import java.util.HashMap;
import java.util.stream.Stream;

public class aa {
    public static void main(String[] args) {
        int[] output = reverseArr(new int[]{1, 2, 3});
        System.out.println(Arrays.toString(output)); // --> [3, 2, 1]
    }

    public static int[] reverseArr(int[] arr) {
        // TODO:
        if (arr.length <= 1) return arr; // 빈 배열을 입력받은 경우

        int[] head = Arrays.copyOfRange(arr, 0, 1); //배열 1번
        int[] tail = reverseArr(Arrays.copyOfRange(arr, 1, arr.length));

        int[] result = new int[tail.length+1];
        System.arraycopy(tail, 0, result, 0, tail.length);
        System.arraycopy(head, 0, result, tail.length, head.length);
        return result;
    }
}