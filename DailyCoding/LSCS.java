public class LSCS {
    public static void main(String[] args) {
        int output = LSCS(new int[]{1, 2, 3});
        System.out.println(output); // --> 6

        output = LSCS(new int[]{1, 2, 3, -4});
        System.out.println(output); // --> 6 ([1, 2, 3])

        output = LSCS(new int[]{1, 2, 3, -4, 5});
        System.out.println(output); // --> 7 ([1, 2, 3, -4, 5])

        output = LSCS(new int[]{10, -11, 11});
        System.out.println(output); // --> 11 ([11])
    }

    public static int LSCS(int[] arr) {
        // TODO:
        int maxSum = arr[0];
        int sum = arr[0];
        for (int i = 1; i < arr.length; i++) {
            sum = Math.max(arr[i], sum + arr[i]);
            maxSum = Math.max(maxSum, sum);
        }
        return maxSum;
    }
}

