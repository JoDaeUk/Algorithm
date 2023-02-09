public class secret {
    public static void main(String[] args) {
        String output = decryptCaesarCipher("khoor", 3);
        System.out.println(output); // --> hello

        output = decryptCaesarCipher("zruog", 3);
        System.out.println(output); // --> world
    }

    public static String decryptCaesarCipher(String str, int secret) {
        // TODO:
        // result 스트링 생성
        String result = "";
        // str문자열 길이만큼의 반복문 만들기
        for(int i = 0; i<str.length(); i++){
            // 공백일 경우 넘어가기
            if(str.charAt(i) == ' '){
                result += str.charAt(i);
            }
            // str 요소 - secret이 a 보다 적을경우 처리하기
            else if(str.charAt(i) - secret < 'a') {
                result += (char)(str.charAt(i) + 26 - secret);

            }else {
                result += (char)(str.charAt(i) - secret);
            }
            // str 요소 - secret 을 result에 붙이기
        }
        // reslut 출력
        return result;
    }
}