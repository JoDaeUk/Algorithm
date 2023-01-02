package programmers;

import java.util.Arrays;

public class 최빈값_구하기 {
    import java.util.Arrays;
    class Solution {
        public int solution(int[] array) {//테스트
            int answer = array[0];
            int count1 = 1;
            int count2 = 0;
            Arrays.sort(array);
            int num = array[0];

            for(int i=1;i<array.length;i++){
                count2=0;
                if(num==array[i]){
                    count1++;
                }
                else{
                    count2++;
                    for(int j=i+1;j<array.length;j++){
                        if(array[j]==array[j-1]){
                            count2++;
                        }
                        else{
                            i = j-1;
                            break;
                        }
                    }
                    if(count1==count2){
                        num=-1;
                    }
                    else if(count1>count2){

                    }
                    else{
                        num=array[i-2];
                        count1=count2;

                    }
                }
                answer=num;
            }

            return answer;
        }
    }
}
