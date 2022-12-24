package programmers;

public class 두수의_합{

         public static void main(String[] args) {

             int num1 = 2;
             int num2 = 3;
             System.out.println(solution(num1,num2));

             num1 = 100;
             num2 = 2;
             System.out.println(solution(num1,num2));
         }
        public static int solution(int num1, int num2) {
            int answer = -1;
            return num1+num2;
        }

}
