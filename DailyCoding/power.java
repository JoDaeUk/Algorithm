public class power {
    public static void main(String[] args) {
        long output = power(3, 40);
        System.out.println(output); // --> 19334827
    }

    public static long power(int base, int exponent) {
        // 금지된 문자열은 주석까지 확인합니다.
        // TODO:
        // exponent 가 0 일경우 1 리턴
        if (exponent == 0) {
            return 1;
        } else if (exponent % 2 == 0) {
            long result = power(base, exponent / 2);
            return result * result % 94906249;

        } else {
            long result = power(base, (exponent - 1) / 2);
            return base * result * result % 94906249;
        }

    }
}

