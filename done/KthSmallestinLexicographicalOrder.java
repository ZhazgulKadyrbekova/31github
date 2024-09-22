package done;

public class KthSmallestinLexicographicalOrder {
    int getA(long a, long b, int n) {
        int res = 0;
        while (a <= n) {
            res += Math.min(n + 1, b) - a;
            a *= 10;
            b *= 10;
        }

        return res;
    }

    public int findKthNumber(int n, int k) {
        long num = 1;
        for (int i = 1; i < k;) {
            int a = getA(num, num + 1, n);
            if (i + a <= k) {
                i += a;
                num++;
            }
            else {
                i++;
                num *= 10;
            }
        }

        return (int)num;
    }

}