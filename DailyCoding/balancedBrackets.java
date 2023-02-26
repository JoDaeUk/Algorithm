import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class balancedBrackets {
    public static void main(String[] args) {
        boolean output = balancedBrackets("[](){}");
        System.out.println(output); // --> true

        boolean output2 = balancedBrackets("[({})]");
        System.out.println(output2); // --> true

        boolean output3 = balancedBrackets("[(]{)}");
        System.out.println(output3); // --> false
    }

    public static boolean balancedBrackets(String str) {
        // TODO:
        // str 리스트로 바꾸기
        ArrayList<String> strList = new ArrayList<>();
        String[] strArr = str.split("");
        for(String s : strArr) strList.add(s);

        //반복문
        while (strList.size()>0){
            if(strList.get(0).equals("[")){
                for(int i = 1; i<strList.size();i++){
                    if(strList.get(i).equals("]")){
                        strList.remove(0);
                        strList.remove(i-1);
                        break;
                    }
                }
                continue;
            }
            if(strList.get(0).equals("{")){
                for(int i = 1; i<strList.size();i++){
                    if(strList.get(i).equals("}")){
                        strList.remove(0);
                        strList.remove(i-1);
                        break;
                    }
                }
                continue;
            }
            if(strList.get(0).equals("(")){
                for(int i = 1; i<strList.size();i++){
                    if(strList.get(i).equals(")")){
                        strList.remove(0);
                        strList.remove(i-1);
                        break;
                    }
                }
                continue;
            }
            return false;
        }
        System.out.println(strList);
        return true;

    }
}

