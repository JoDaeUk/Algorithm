package programmers;

public class 가위_바위_보 {

         public static void main(String[] args) {

             System.out.println(solution("2"));
             System.out.println(solution("205"));

         }
    public static String solution(String rsp) {
        String answer = "";

        for(int i=0; i<rsp.length(); i++){
            answer += (rsp.split("")[i].equals("0") ? "5"
                    : rsp.split("")[i].equals("2") ? "0"
                    : rsp.split("")[i].equals("5") ? "2" : "9");
        }

        return answer;
    }

}
