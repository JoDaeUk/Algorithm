package programmers;

public class 옷가게_할인_받기 {
    public static void main(String[] args) {
        int price1 = 150000;
        int price2 = 580000;
        System.out.println(solution(price1));
        System.out.println(solution(price2));
    }

    public static int solution(int price) {
        if(price >= 100000 && price < 300000)
            return price * 95 / 100;
        else if(price >= 300000 && price < 500000)
            return price * 90 / 100;
        else if(price >= 500000)
            return price * 80 / 100;
        else return price;

    }
}

