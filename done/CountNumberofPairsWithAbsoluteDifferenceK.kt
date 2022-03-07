fun main() {
    println(countKDifference(intArrayOf(1,2,2,1), 1))
    println(countKDifference(intArrayOf(1,3), 3))
    println(countKDifference(intArrayOf(3,2,1,5,4), 2))
}

fun countKDifference(nums: IntArray, k: Int): Int {
    val size = nums.size - 1
    var count = 0

    for (i in 0..size) {
        for (j in (i+1)..size) {
            if (Math.abs(nums[i] - nums[j]) == k)
                count++
        }
    }

    return count
}