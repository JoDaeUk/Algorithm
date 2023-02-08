public class numberSearch {
    public static void main(String[] args) {
        int output = numberSearch("Hello6 ");
        System.out.println(output); // --> 1

        output = numberSearch("Hello6 9World 2,");
        System.out.println(output); // --> 2

        output = numberSearch("Hello6 9World 2, Nic8e D7ay!");
        System.out.println(output); // --> 2
    }

    public static int numberSearch(String str) {
        // TODO:
        // sum 변수 생성
        double sum = 0;
        // 공백 문자변수 생성
        String s = " ";
        // 길이 변수 생성
        double len = str.length();
        // str 문자열 길이 반복문 생성
        for(int i = 0; i<str.length(); i++){
            // 숫자일 경우 sum에 더하기 + 길이변수 -1
            if(Character.isDigit(str.charAt(i))){
                sum += Integer.valueOf(str.substring(i,i+1));
                len --;
            }
            // 공백일 경우 길이변수 -1
            if(str.substring(i,i+1).equals(s)){
                len --;
            }
        }
        // 나누고 반올림하기
        double result = sum / len;
        return (int) Math.round((result * 10) / 10);
    }
}

