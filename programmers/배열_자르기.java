package programmers;

import java.util.Arrays;

public class 배열_자르기 {

         public static void main(String[] args) {
             int[] number1 = {1,2,3,4,5};
             int[] number2 = {1,3,5};

             System.out.println(Arrays.toString(solution(number1,1,3)));

             System.out.println(Arrays.toString(solution(number2,1,2)));
         }
    public static int[] solution(int[] numbers, int num1, int num2) {

        return Arrays.copyOfRange(numbers,num1,1+num2);
    }

}
