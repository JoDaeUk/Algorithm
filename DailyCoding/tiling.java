import java.util.Arrays;

public class tiling {
    public static void main(String[] args) {
        int output = tiling(2);
        System.out.println(output); // --> 2

        output = tiling(30);
        System.out.println(output); // --> 5
    }

    public static int tiling(int num) {
        // TODO:
        int[] arr = new int[num+1];
        Arrays.fill(arr, 0);
        if (num == 1) return 1;

        if (num == 2) return 2;

        if (arr[num] != 0) return arr[num];
        return arr[num] = (tiling(num - 1) + tiling(num - 2));

    }
}
/*
1 1 3 3 5
2 2 4 4 5 ==3
1 1 3 3 5 6
2 2 4 4 5 6==6+1
1 1 3 3 5 6 7
2 2 4 4 5 6 7 ==10+3
 */

