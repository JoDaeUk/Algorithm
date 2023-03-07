public class rotateMatrix {
    public static void main(String[] args) {
        int[][] matrix = new int[][]{
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        };
        int K = 1;

        System.out.println(matrix[0][0]); // --> 1
        System.out.println(matrix[3][2]); // --> 15

        int[][] rotatedMatrix = rotateMatrix(matrix, K);
        System.out.println(rotatedMatrix[0][0]); // --> 13
        System.out.println(rotatedMatrix[3][2]); // --> 8
        for(int[] arr : rotatedMatrix){
            for(int i : arr){
                System.out.print(i+",");
            }
            System.out.println();
        }
    }

    public static int[][] rotateMatrix(int[][] matrix, int K) {
        // 필드 변수를 사용하면 테스트가 정상적으로 작동하지 않습니다.
        // 메서드 내부에서 값을 저장하고 활용해주세요.
        // TODO:
        K = K % 4;
        if(matrix == null) return null;
        if(K == 0) return matrix;
        for (int count=0; count<K; count++){
            int[][] rotateMat = new int[matrix.length][matrix.length];
            for(int i=0; i< matrix.length; i++){
                for(int j=0; j< matrix.length; j++){
                    rotateMat[j][matrix.length-i-1] = matrix[i][j];
                }
            }
            matrix = rotateMat;
        }
        return matrix;
    }
}

