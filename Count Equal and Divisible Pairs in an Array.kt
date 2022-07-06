fun main() {
//    val arr = intArrayOf(3,1,2,2,2,1,3)
//    val k = 2
    val arr = intArrayOf(1,2,3,4)
    val k = 1
    println(countPairs(arr, k))
}

fun countPairs(nums: IntArray, k: Int): Int {
    val size = nums.size - 1
    var count = 0
    for (i in 0..size) {
        for (j in (i+1)..size) {
            if (nums[i] == nums[j] && (i*j % k == 0)) {
                count++
            }
        }
    }
    return count
}
