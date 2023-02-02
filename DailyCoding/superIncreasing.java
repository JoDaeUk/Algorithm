import java.util.HashMap;

public class superIncreasing {
    public static void main(String[] args) {
        boolean output = superIncreasing(new int[]{1, 3, 6, 13, 54});
        System.out.println(output); // --> true

        output = superIncreasing(new int[]{1, 3, 5, 9});
        System.out.println(output); // --> false
    }

    public static boolean superIncreasing(int[] arr) {
        // TODO:
        // 변수 sum
        int sum = arr[0];
        // arr 배열 반복문
        for (int i = 1; i<arr.length;i++){
            // 합이 sum >= i 일경우 false 리턴
            if(sum >= arr[i]) return false;
            // 아닐경우 sum += i
            sum += arr[i];
        }
        // true 리턴
        return true;
    }
}

