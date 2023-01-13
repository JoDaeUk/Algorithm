import java.util.HashMap;

public class computeWhenDouble {
    public static void main(String[] args) {
        int output = computeWhenDouble(7);
        System.out.println(output); // --> 11

        output = computeWhenDouble(10);
        System.out.println(output); // --> 8
    }

    public static int computeWhenDouble(double interestRate) {
        // TODO:
        double money = 100;
        int years = 0;
        while(money < 200){
            money = money + money*interestRate/100;
            years++;
        }
        return years;
    }
}