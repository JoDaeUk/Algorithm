import java.util.ArrayList;
import java.util.Arrays;

public class quickSort {
    public static void main(String[] args) {
        int[] output = quickSort(new int[]{3, 1, 21});
        System.out.println(Arrays.toString(output)); // --> [1, 3, 21]
        int[] output1 = quickSort(new int[]{20, -10, -11, 2, 29});
        System.out.println(Arrays.toString(output1)); // --> [1, 2, 21, 43, 100]
    }

        public static int[] quickSort(int[] arr) {
            // TODO:
            // 리스트 만들기
            ArrayList<Integer> list = new ArrayList<>();
            for (int i : arr){
                list.add(i);
            }
            // 반복문을 사용하여 리스트에 인덱스로 넣기
            for (int i = 0; i<list.size()-1; i++){
                if(list.get(i) > list.get(i+1)){
                    list.add(list.get(i));
                    list.remove(i);
                    i--;
                }
            }
            // 리스트 배열로 바꾸기
            int[] result = new int[list.size()];

            for (int i = 0; i < list.size(); i++) {
                result[i] = list.get(i);
            }
            return result;
        }
}
