import java.util.HashMap;

public class rotatedArraySearch {
    public static void main(String[] args) {
        int output1 = rotatedArraySearch(new int[]{4, 5, 6, 0, 1, 2, 3}, 2);
        System.out.println(output1); // --> 5

        int output2 = rotatedArraySearch(new int[]{4, 5, 6, 0, 1, 2, 3}, 100);
        System.out.println(output2); // --> -1
    }

    public static int rotatedArraySearch(int[] rotated, int target) {
        // TODO:
        for (int i = 0; i<rotated.length; i++){
            if(rotated[i]==target){
                return i;
            }
        }
        return -1;
    }
}

