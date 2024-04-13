public class FindTheOriginalArrayofPrefixXor {
    public int[] findArray(int[] pref) {
        int n = pref.length;
        int[] res = new int[n];
        int prev = 0;
        for (int i = 0; i < n; i++) {
            if (i == 0) {
                res[i] = pref[i];
                prev = pref[i];
            }
            else {
                int temp = pref[i] ^ prev;
                res[i] = temp;
                prev = prev ^ temp;
            }
        }
        return res;
    }
}
