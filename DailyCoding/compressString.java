public class compressString {
    public static void main(String[] args) {
        String output = compressString("abc");
        System.out.println(output); // --> "abc"

        output = compressString("wwwggoppopppp");
        System.out.println(output); // --> "3wggoppo4p"
    }

    public static String compressString(String str) {
        // TODO:
        // 빈배열이면 출력
        if(str.length() == 0) return "";
        // result 문자 생성
        String result = str.substring(0,1);
        // cout 변수 생성
        int cout = 1;
        // str 문자열 반복 해서 result 추가하기
        for(int i = 1; i<str.length(); i++){
            // 뒷문자와 같다면 cout ++
            if(str.charAt(i-1)==str.charAt(i)){
                cout ++;
            }
            else {
                cout = 1;
            }
            // cout 2이하면 result에 추가하기
            if(cout <= 2){
                result = result + str.substring(i,i+1);
            }
            // cout 3이상이면 숫자로 변경하기
            else {
                result = result.substring(0,result.length()-2) + cout +result.substring(result.length()-1);
            }
        }
        // result 리턴
        return result;
    }
}

