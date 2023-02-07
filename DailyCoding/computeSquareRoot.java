public class computeSquareRoot {
    public static void main(String[] args) {
        String output = computeSquareRoot(9);
        System.out.println(output); // --> "3.00"

        output = computeSquareRoot(6);
        System.out.println(output); // --> "2.45"
    }

    public static String computeSquareRoot(int num) {
        // TODO:
        // 자릿수 배열, root 만들기
        double[] arr = new double[]{1,0.1,0.01,0.001};
        double root = 1;
        // 자릿수 반복문 만들기
        for(double n : arr){
            // 제곱했을때 num보다 작을경우 무한반복
            while (root * root < num){
                // 루트에 자릿수 더하기
                root += n;
                // 제곱했을때 num과 같으면 그냥 출력
                if(root * root == num){
                    return String.format("%.2f",root);
                }
            }
            root -= n;
        }
        return String.format("%.2f",root);
    }
}

