package programmers;

import java.util.Arrays;

public class 모스부호_1 {
    public static void main(String[] args) {

        String str1 = ".... . .-.. .-.. ---";
        String str2 = ".--. -.-- - .... --- -.";
        System.out.println(solution(str1));
        System.out.println(solution(str2));


    }

    public static String solution(String letter) {
        String[] morseCodeArray = letter.split(" ");
        StringBuilder sb = new StringBuilder();
        for (String code : morseCodeArray) {
            switch (code) {
                case ".-":
                    sb.append('a');
                    break;
                case "-...":
                    sb.append('b');
                    break;
                case "-.-.":
                    sb.append('c');
                    break;
                case "-..":
                    sb.append('d');
                    break;
                case ".":
                    sb.append('e');
                    break;
                case "..-.":
                    sb.append('f');
                    break;
                case "--.":
                    sb.append('g');
                    break;
                case "....":
                    sb.append('h');
                    break;
                case "..":
                    sb.append('i');
                    break;
                case ".---":
                    sb.append('j');
                    break;
                case "-.-":
                    sb.append('k');
                    break;
                case ".-..":
                    sb.append('l');
                    break;
                case "--":
                    sb.append('m');
                    break;
                case "-.":
                    sb.append('n');
                    break;
                case "---":
                    sb.append('o');
                    break;
                case ".--.":
                    sb.append('p');
                    break;
                case "--.-":
                    sb.append('q');
                    break;
                case ".-.":
                    sb.append('r');
                    break;
                case "...":
                    sb.append('s');
                    break;
                case "-":
                    sb.append('t');
                    break;
                case "..-":
                    sb.append('u');
                    break;
                case "...-":
                    sb.append('v');
                    break;
                case ".--":
                    sb.append('w');
                    break;
                case "-..-":
                    sb.append('x');
                    break;
                case "-.--":
                    sb.append('y');
                    break;
                case "--..":
                    sb.append('z');
                    break;
                default:
                    break;
            }

        }
        return sb.toString();
    }
}
