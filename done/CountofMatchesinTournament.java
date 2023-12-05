package done;

//1688. Count of Matches in Tournament
public class CountofMatchesinTournament {
    public static void main(String[] args) {
        System.out.println(numberOfMatches(7));
        System.out.println(numberOfMatches(140));
    }

    public static int numberOfMatches(int n) {
        var count = 0;
        while (n > 1) {
            count += n/2;
            if (n % 2 == 1) count += 1;
            System.out.println(n + "\t" + count);
            n /= 2;
        }
        return count;
    }
}
