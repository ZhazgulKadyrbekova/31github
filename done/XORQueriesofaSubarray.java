package done;

public class XORQueriesofaSubarray {
    public int[] xorQueries(int[] arr, int[][] queries) {       //n, m
        int[] pre = new int[arr.length];
        int[] res = new int[queries.length];

        pre[0] = arr[0];
        for (int i = 1; i < arr.length; i++) {
            pre[i] = pre[i - 1] ^ arr[i];
        }

        for (int i = 0; i < queries.length; i++) {
            int left = queries[i][0];
            int right = queries[i][1];

            res[i] = left == 0 ? pre[right] : pre[right] ^ pre[left - 1];
        }

        return res;

        //Time - O(n+m)     2ms         100%
        //Space - O(n+m)    57.46MB     66.37%
    }

    public int[] xorQueries2(int[] arr, int[][] queries) {
        int[] res = new int[queries.length];
        int sum = 0;
        for (int i : arr) {
            sum ^= i;
        }

        for (int i = 0; i < queries.length; i++) {
            res[i] = sum;
            int left = queries[i][0], right = queries[i][1];
            for (int k = 0; k < left; k++) {
                res[i] ^= arr[k];
            }
            for (int k = right + 1; k < arr.length; k++) {
                res[i] ^= arr[k];
            }
        }

        return res;

        //Time - O(n*m) - O(n2)     546ms       16.28%
        //Space - O(n)              56.08MB     76.31%
    }
}
