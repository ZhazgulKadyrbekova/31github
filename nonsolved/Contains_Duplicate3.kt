package nonsolved

fun main() {
    val arr: IntArray = intArrayOf(-2147483648,2147483647)
//    [-2147483648,2147483647]
//    1
//    1
    println(containsNearbyAlmostDuplicate(arr,1, 1))
}

fun containsNearbyAlmostDuplicate(nums: IntArray, k: Int, t: Int): Boolean {
//    nums[i] == nums[j]
//    abs(i - j) <= k
    val size: Int = nums.size - 1
    for (i in 0..size) {
        for (j in (i+1)..size) {
            val a: Long = nums[i].toLong() - nums[j].toLong()

            if (Math.abs(a) <= t && Math.abs(i-j) <= k)
                return true
        }
    }
    return false
}