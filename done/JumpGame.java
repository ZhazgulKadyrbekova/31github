package done;

public class JumpGame {
    public boolean canJump(int[] nums) {
        int size = nums.length;
        boolean[] reachFinish = new boolean[size];
        reachFinish[size - 1] = true;
        for (int i = size - 2; i >= 0; i--) {
            int distance = size - 1 - i;
            if (nums[i] >= distance) {
                reachFinish[i] = true;
            }
            else {
                reachFinish[i] = false;
                for (int j = i; j <= i + nums[i]; j++) {
                    if (reachFinish[j]) {
                        reachFinish[i] = true;
                    }
                }
            }
        }
        return reachFinish[0];
    }
}
