public class fibonacci {
    public static void main(String[] args) {
        int output = fibonacci(0);
        System.out.println(output); // --> 0

        output = fibonacci(1);
        System.out.println(output); // --> 1

        output = fibonacci(5);
        System.out.println(output); // --> 5

        output = fibonacci(9);
        System.out.println(output); // --> 34
    }

    public static int fibonacci(int num) {
        // 금지된 문자열은 주석까지 확인합니다.
        // TODO:
        // 탈출문 num = 1 또는 0 이면 출력
        if (num <= 1) return num;
        //재귀
        return fibo(num-1, 1,1,0);
    }
    //재귀함수 생성
    public static int fibo(int num, int fibo, int prve1, int prve2){
        //재귀 탈출
        if(num == 0) return fibo;
        //재귀 수식
        fibo = prve1+prve2;
        return fibo(num-1, fibo, fibo, prve1);
    }
}

