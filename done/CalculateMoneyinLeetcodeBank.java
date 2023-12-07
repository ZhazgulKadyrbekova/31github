package done;

//1716. Calculate Money in Leetcode Bank
public class CalculateMoneyinLeetcodeBank {

    public static void main(String[] args) {
        System.out.println(totalMoney(20));
    }

    public static int totalMoney(int n) {
        var rem = n % 7;
        var div = n / 7;
        var start = 0;
        for (int i = 1; i <= div; i++) {
            start += i + 3;
        }

        var sum = start * 7;
        for (int i = div + 1; i <= rem + div; i++) {
            sum += i;
        }
        return sum;
    }

}
