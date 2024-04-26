package done;

public class RotateArray {
    public void rotate(int[] nums, int k) {
        int size = nums.length;
        k = k % size;

        reverse(nums, 0, size - k - 1);
        reverse(nums, size - k, size - 1);
        reverse(nums, 0 , size - 1);
    }
    private void reverse(int[] nums, int start, int end) {
        for (int i = start; i <= (start + end) / 2; i++) {
            int temp = nums[i];
            nums[i] = nums[end + start - i];
            nums[end + start - i] = temp;
        }
    }

    //TL
    public void rotate2(int[] nums, int k) {
        int size = nums.length;
        k = k % size;
        while (k-- > 0) {
             shift(nums);
        }
    }
    private void shift(int[] nums) {
        int size = nums.length;
        int last = nums[size - 1];
        for (int i = size - 2; i >= 0; i--) {
            nums[i+1] = nums[i];
        }

        nums[0] = last;
    }
}
