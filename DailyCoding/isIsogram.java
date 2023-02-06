public class isIsogram {
    public static void main(String[] args) {
        boolean output = isIsogram("aba");
        System.out.println(output); // false

        output = isIsogram("Dermatoglyphics");
        System.out.println(output); // true

        output = isIsogram("moOse");
        System.out.println(output); // false
    }

    public static boolean isIsogram(String str) {
        // TODO:
        // 문자열 대문자로 변경
        str = str.toUpperCase();
        // 반복문 진입
        for(int i=0; i<str.length(); i++){
            // j = i+1 중첩반복문
            for(int j=i+1; j<str.length(); j++){
                // i == j 일때 false 출력
                if(str.charAt(i) == str.charAt(j)) return false;
            }
        }
        // 반복문 모두 통과후 true 출력
        return true;
    }
}

