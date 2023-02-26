package programmers;

public class 순서쌍의_개수 {

         public static void main(String[] args) {

             int num1 = 20;
             int num2 = 100;
             System.out.println(solution(num1));
             System.out.println(solution(num2));
         }
    public static int solution(int n) {
        int count = 0;
        for(int i = 1; i <= n; i++){
            if(n%i==0){
                count++;
            }
        }
        return count;
    }

}
