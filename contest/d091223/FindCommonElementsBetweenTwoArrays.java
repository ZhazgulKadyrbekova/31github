package contest.d091223;

//Find Common Elements Between Two Arrays
public class FindCommonElementsBetweenTwoArrays {
    public static void main(String[] args) {
        int[] nums1 = new int[]{3,4,2,3};
        int[] nums2 = new int[]{1,5};

        var res = findIntersectionValues(nums1, nums2);
        for (int i : res) {
            System.out.println(i);
        }
    }

    public static int[] findIntersectionValues(int[] nums1, int[] nums2) {
        int[] res = new int[2];
        var count = 0;
        for (int num : nums1) {
            if (contains(nums2, num)) {
                count++;
            }
        }
        res[0] = count;
        count = 0;
        for (int num : nums2) {
            if (contains(nums1, num)) {
                count++;
            }
        }
        res[1] = count;
        return res;
    }

    public static boolean contains(int[] nums, int target) {
        for (int i : nums) {
            if (i == target) {
                return true;
            }
        }
        return false;
    }
}