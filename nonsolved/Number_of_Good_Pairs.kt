package nonsolved

fun main() {
    println(numIdenticalPairs(intArrayOf(1,2,3, 1)))
}

fun numIdenticalPairs(nums: IntArray): Int {
    var count = 0
    val size = nums.size - 1
    for (i in 0..size) {
        for (j in (i+1)..size) {
            if (nums[i] == nums[j]) count++
        }
    }
    return count
}