
public class binarySearch {
    public static void main(String[] args) {
        int output = binarySearch(new int[]{0, 1, 2, 3, 4, 5, 6}, 2);
        System.out.println(output); // --> 2

        output = binarySearch(new int[]{4, 5, 6, 9}, 100);
        System.out.println(output); // --> -1
    }
    public static int binarySearch(int[] arr, int target) {
        // TODO:
        int index = arr.length/2;
        if (arr[index] > target){
            for(int i = index-1; i>0; i--){
                if(arr[i] == target){
                    return i;
                }
            }
        }
        else if (arr[index] < target){
            for (int i = index+1; i<arr.length;i++){
                if(arr[i]== target){
                    return i;
                }
            }
        }
        else if(arr[index] == target){
            return index;
        }
        return -1;
    }
}
