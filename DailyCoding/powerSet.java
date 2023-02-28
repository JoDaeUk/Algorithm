import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class powerSet {
    public static void main(String[] args) {
        ArrayList<String> output1 = powerSet("abc");
        System.out.println(output1); // ["", "a", "ab", "abc", "ac", "b", "bc", "c"]

        ArrayList<String> output2 = powerSet("jjmpu");
        System.out.println(output2); // ["", "j", "jm", "jmp", "jmpu", "jmu", "jp", "jpu", "ju", "m", "mp", "mpu", "mu", "p", "pu", "u"]
    }

    public static ArrayList<String> powerSet(String str) {
        // 필드 변수를 사용하면 테스트가 정상적으로 작동하지 않습니다.
        // 메서드 내부에서 값을 저장하고 활용해주세요.
        // TODO:
        char[] stringToChar = str.toCharArray();
        Arrays.sort(stringToChar);
        String sortString = new String(stringToChar);
        sortString = sortString+"1";
        // 리스트 만들고 빈 문자열 넣기
        ArrayList<String> result = new ArrayList<>();
        // str 자르기
        String[] strArrSub = sortString.split("");
        //중복제거
        LinkedHashSet<String> linkedHashSet =
                new LinkedHashSet<>( Arrays.asList(strArrSub) );
        String[] strArr =
                linkedHashSet.toArray(new String[] {});
        String resultStr = "";
        for(String s : strArr){
            resultStr += s;
        }
        // 반복문
        for(int i = 1; i<strArr.length; i++){
            // 각각 재귀함수
            String headStr = resultStr.substring(i-1,i);
            String tailStr = resultStr.substring(i, strArr.length);
            result.addAll(powerSetSub(headStr,tailStr));
        }
        //빈배열 넣고 리턴
        result.add(0,"");
        return result;




    }
    public static ArrayList<String> powerSetSub(String headStr,String tailStr){
        ArrayList<String> result = new ArrayList<>();
        String[] tailStrArr = tailStr.split("");
        result.add(headStr);
        for(int i = 1; i<tailStrArr.length; i++){
            String headStrSub = headStr+tailStr.substring(i-1,i);
            result.addAll(powerSetSub(headStrSub,tailStr.substring(i,tailStrArr.length))) ;
        }
        return result;
    }
}

