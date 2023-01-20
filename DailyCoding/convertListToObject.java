import java.util.HashMap;

public class convertListToObject {
    public static void main(String[] args) {
        String[][] arr = new String[][]{
                {"make", "Ford"},
                {"model", "Mustang"},
                {"year", "1964"},
                {"make", "Bill"},
        };

        HashMap<String, String> output = convertListToHashMap(arr);

        System.out.println(output); // -->
//          {
//            "make" = "Ford"
//            "model" = "Mustang",
//            "year" = "1964"
//          }
    }

    public static HashMap<String, String> convertListToHashMap(String[][] arr) {
        // TODO:
        HashMap<String,String> resultMap = new HashMap<>();
        for (int i=0; i<arr.length; i++){
            if(arr[i].length != 0){
                if(!resultMap.containsKey(arr[i][0])){
                    resultMap.put (arr[i][0],arr[i][1]);
                }
            }
        }
        return arr.length == 0 ? new HashMap<>() : resultMap;
    }
}

