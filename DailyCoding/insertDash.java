import java.util.HashMap;

public class insertDash {
    public static void main(String[] args) {
        String output = insertDash("454793");
        System.out.println(output); // --> 4547-9-3
    }

    public static String insertDash(String str) {
        // TODO:
        if(str.length()==0) return null;
        String result = "";
        result += str.charAt(0);
        for(int i = 1; i<str.length(); i++){
            if((int)str.charAt(i)%2!=0 && (int)str.charAt(i-1)%2!=0){
                result = result+ "-"+str.charAt(i);
            }
            else result = result + str.charAt(i);
        }
        return result;
    }
}

