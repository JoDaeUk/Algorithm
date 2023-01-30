import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class removeExtremes {
    public static void main(String[] args) {
        String[] output = removeExtremes(new String[]{"a", "b", "c", "def"});
        System.out.println(Arrays.toString(output)); // --> ["a"', "b"]

        output = removeExtremes(new String[]{"where", "is", "the", "longest", "word"});
        System.out.println(Arrays.toString(output)); // --> ["where", "the", "word"]
    }

    public static String[] removeExtremes(String[] arr) {
        // TODO:
        if(arr.length == 0) return null;
        int longIdx = 0;
        int longLength = 0;
        int shortIdx = 0;
        int shortLength = arr[0].length();
        int subNum = 0;
        for(int i = 0; i<arr.length; i++){
            if(arr[i].length() > longLength){
                longIdx = i;
                longLength = arr[i].length();
            }
            if(arr[i].length() <= shortLength){
                shortIdx = i;
                shortLength = arr[i].length();
            }
        }
        if (shortIdx > longIdx){
            subNum = shortIdx;
            shortIdx = longIdx;
            longIdx = subNum;
        }
        ArrayList<String> strList = new ArrayList<>(Arrays.asList(arr));
        strList.remove(longIdx);
        strList.remove(shortIdx);
        arr = strList.toArray(new String[0]);
        return arr;
    }
}

