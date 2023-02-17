public class isSubsetOf {
    public static void main(String[] args) {
        int[] base = new int[]{1, 2, 3, 4, 5};
        int[] sample = new int[]{1, 3};
        boolean output = isSubsetOf(base, sample);
        System.out.println(output); // --> true

        sample = new int[]{6, 7};
        output = isSubsetOf(base, sample);
        System.out.println(output); // --> false

        base = new int[]{10, 99, 123, 7};
        sample = new int[]{11, 100, 99, 123};
        output = isSubsetOf(base, sample);
        System.out.println(output); // --> false
    }

    public static boolean isSubsetOf(int[] base, int[] sample) {
        // TODO:
        int cout = 0;
        // sample 반복문
        for (int i : sample) {
            // base 반복문
            for (int j : base) {
                // base 요소가 sample 요소랑 같을때 cout++, break
                if (i == j) {
                    cout++;
                    break;
                }
            }
        }
        //cout == sample.length 이면 true
        return cout == sample.length ? true : false;
    }
}

