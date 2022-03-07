package done

fun main() {
    val arr: IntArray = intArrayOf(1,2,3,1,2,3)
//    [-2147483648,2147483647]
//    1
//    1
    println(containsNearbyDuplicate(arr,2))
}

fun containsNearbyDuplicate(nums: IntArray, k: Int): Boolean {
//    nums[i] == nums[j]
//    abs(i - j) <= k
    val size: Int = nums.size - 1
    for (i in 0..size) {
        for (j in (i+1)..size) {
            if (nums[i] == nums[j] && Math.abs(i - j) <= k) return true
        }
    }
    return false
}