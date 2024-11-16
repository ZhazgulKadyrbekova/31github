import done.KthLargestElementinanArray;

public class Solution {
    public static void main(String[] args) {
        var solution = new KthLargestElementinanArray();

//        var res = solution.findKthLargest(new int[] {3,2,1,5,6,4}, 2);
        var res = solution.findKthLargest(new int[] {3,2,3,1,2,4,5,5,6},4);
        System.out.println(res);
    }

}
