public class Solution {
    public static void main(String[] args) {
        var solution = new FindTheOriginalArrayofPrefixXor();
        int[] arr = new int[] {5,2,0,3,1};
        int[] res = solution.findArray(arr);

        for (int i : res)
            System.out.println(i);
    }
}
