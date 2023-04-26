import java.util.HashMap;

public class ABCheck {
    public static void main(String[] args) {
        boolean output = ABCheck("lane Borrowed");
        System.out.println(output); // --> true
    }

    public static boolean ABCheck(String str) {
        // TODO:
        String[] arr = str.toUpperCase().split("");
        for (int i = 0; i<arr.length-5; i++){
            if(arr[i].equals("A")){
                if(arr[i+4].equals("B")) return true;
            }
            if(arr[i].equals("B")){
                if(arr[i+4].equals("A") ) return true;
                //ABCheck
            }
        }
        return false;
    }
}

