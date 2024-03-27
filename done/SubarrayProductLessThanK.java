package done;

public class SubarrayProductLessThanK {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int count = 0, prev = 1;
        for (int i = 0; i < nums.length; i++) {
            prev = 1;
            for (int j = i; j < nums.length; j++) {
//                System.out.print(i + "\t" + j + "\t");
                prev *= nums[j];
//                System.out.print(prev + "\t");
                if (prev < k) {
//                    System.out.println("+");
                    count++;
                    continue;
                }
//                System.out.println("-");
                prev = 1;
                break;

            }
        }
        return count;
    }
}
