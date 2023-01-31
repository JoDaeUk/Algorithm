import java.util.Arrays;

public class reverseArr {
    public static void main(String[] args) {
        int[] output = reverseArr(new int[]{1, 2, 3});
        System.out.println(Arrays.toString(output)); // --> [3, 2, 1]
    }

    public static int[] reverseArr(int[] arr){
        // 금지된 문자열은 주석까지 확인합니다.
        // TODO:
        // 배열의 길이가 1보다 작경우 그냥 리턴
        if(arr.length <= 1) return arr;
        // tail 배열과 head 배열생성
        // head 배열에 arr 마지막 인덱스 넣기
        // tail 배열에 나머지 인덱스재귀함수로넣기
        int[] head = Arrays.copyOfRange(arr, arr.length-1, arr.length);
        int[] tail = reverseArr(Arrays.copyOfRange(arr, 0, arr.length-1));
        // head와 tail 배열 합쳐서 리턴
        int[] newArr = new int[head.length + tail.length];
        System.arraycopy(head, 0, newArr, 0, head.length);
        System.arraycopy(tail, 0, newArr, head.length, tail.length);
        return newArr;

    }
}