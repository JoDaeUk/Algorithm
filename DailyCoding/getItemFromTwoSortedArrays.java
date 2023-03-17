import java.util.Arrays;

public class getItemFromTwoSortedArrays {
    public static void main(String[] args) {
        int[] arr1 = new int[]{1, 4, 8, 10};
        int[] arr2 = new int[]{2, 3, 5, 9};
        int result = getItemFromTwoSortedArrays(arr1, arr2, 6);
        System.out.println(result); // --> 8

        arr1 = new int[]{1, 1, 2, 10};
        arr2 = new int[]{3, 3};
        result = getItemFromTwoSortedArrays(arr1, arr2, 4);
        System.out.println(result); // --> 3
    }

    public static int getItemFromTwoSortedArrays(int[] arr1, int[] arr2, int k) {
        // 필드 변수를 사용하면 테스트가 정상적으로 작동하지 않습니다.
        // 메서드 내부에서 값을 저장하고 활용해주세요.
        // TODO:
        int[] mergedArr = new int[arr1.length + arr2.length];

        System.arraycopy(arr1, 0, mergedArr, 0, arr1.length);
        System.arraycopy(arr2, 0, mergedArr, arr1.length, arr2.length);

        Arrays.sort(mergedArr); // 오름차순으로 정렬
        return mergedArr[k-1];

    }
}

