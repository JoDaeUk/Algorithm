import java.util.HashMap;

public class matrix {
    public static void main(String[] args) {
        Character[][] matrix = new Character[][]{
                {'A', 'B', 'C'},
                {'D', 'E', 'F'},
                {'G', 'H', 'I'},
        };
        String output = spiralTraversal(matrix);
        System.out.println(output); // --> "ABCFIHGDE"

        matrix = new Character[][]{
                {'T', 'y', 'r', 'i'},
                {'i', 's', 't', 'o'},
                {'n', 'r', 'e', 'n'},
                {'n', 'a', 'L', ' '},
        };
        output = spiralTraversal(matrix);
        System.out.println(output); // --> 'Tyrion Lannister'
    }

    public  static String spiralTraversal(Character[][] matrix) {
        // TODO:
        int top = 0 ;
        int bottom = matrix.length - 1;
        int left = 0;
        int right = matrix[0].length - 1;
        int direction = 0;
        String result = "";

        while (top <= bottom && left <= right) {
            if (direction == 0) { // 왼쪽에서 오른쪽
                for (int i = left; i <= right; i++) {
                    result= result+ matrix[top][i];
                }
                top++;
            } else if (direction == 1) { // 위에서 아래로
                for (int i = top; i <= bottom; i++) {
                    result= result+ matrix[i][right];
                }
                right--;
            } else if (direction == 2) { // 오른쪽에서 왼쪽
                for (int i = right; i >= left; i--) {
                    result= result+ matrix[bottom][i];
                }
                bottom--;
            } else if (direction == 3) { // 아래에서 위로
                for (int i = bottom; i >= top; i--) {
                    result= result+ matrix[i][left];
                }
                left++;
            }
            direction = (direction + 1) % 4;
        }
        return result;
    }
}

