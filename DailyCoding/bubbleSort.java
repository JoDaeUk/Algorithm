import java.util.Arrays;

public class bubbleSort {
    public static void main(String[] args) {
        int[] output = bubbleSort(new int[]{2, 1, 3});
        System.out.println(Arrays.toString(bubbleSort(output)));; // --> [1, 2, 3]
    }
    public static int[] bubbleSort(int[] arr) {
        // TODO:
        int chNum = 0;
        // arr 의 길이만큼 반복문
        for (int i = 0; i < arr.length; i++){
            int swaps = 0;
            // 반복문 안에 arr 만큼 반복문
            for (int j = 1; j<arr.length-i; j++){
                // j, j+1 비교후 값 바꾸기
                if(arr[j]<arr[j-1]){
                    chNum = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = chNum;
                    swaps++;
                }
            }
            if(swaps == 0) break;
        }
        // 출력
        return arr;
    }
}
