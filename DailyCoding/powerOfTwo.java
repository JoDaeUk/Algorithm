public class powerOfTwo {
    public static void main(String[] args) {
        boolean output1 = powerOfTwo(16);
        System.out.println(output1); // true
        boolean output2 = powerOfTwo(22);
        System.out.println(output2); // false
    }

    public static boolean powerOfTwo(long num) {
        // 금지된 문자열은 주석까지 확인합니다.
        // TODO:
        long i = 1;
        while(i<=num){
            if (i==num) return true;
            i = i * 2;
        }
        return false;
    }
}