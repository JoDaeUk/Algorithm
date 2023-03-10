import java.util.HashMap;

public class transformFirstAndLast {
    public static void main(String[] args) {
        String[] arr = new String[]{"Queen", "Elizabeth", "Of Hearts", "Beyonce"};
        HashMap<String, String> output = transformFirstAndLast(arr);
        System.out.println(output); // --> { Queen : 'Beyonce' }

        String[] arr1 = new String[]{"Kevin", "Bacon", "Love", "Hart", "Costner", "Spacey"};
        HashMap<String, String> output1 = transformFirstAndLast(arr1);
        System.out.println(output1); // --> { Kevin : 'Spacey' }
    }

    public static HashMap<String, String> transformFirstAndLast(String[] arr) {
        // TODO:
        if(arr.length == 0)
            return null;
        HashMap<String, String> result = new HashMap<String, String>();
        result.put(arr[0], arr[arr.length-1]);
        return result;
    }
}

