package programmers;

import java.util.Scanner;

public class 직삼각혁_출력하기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        String s = "*";
        for(int i = 0; i<n; i++){
            System.out.println(s);
            s += "*";
        }
    }
}
