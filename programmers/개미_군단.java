package programmers;

public class 개미_군단 {

         public static void main(String[] args) {

             System.out.println(solution(23));
             System.out.println(solution(24));
             System.out.println(solution(999));

         }
    public static int solution(int hp) {
        int count = hp / 5;
        hp = hp-count*5;
        int att = hp/3;
        count = count + att;
        hp = hp-att*3;
        return count+hp;

    }

}
