fun main() {
    val arr = intArrayOf(3,3)
    val res = two_Sum(arr, 6)
    println("${res[0]}\t${res[1]}")
}

fun two_Sum(nums: IntArray, target: Int): IntArray {
    val size = nums.size - 1
    for (i in 0..size) {
        for (j in (i+1)..size) {
            if (nums[i] + nums[j] == target)
                return intArrayOf(i, j)
        }
    }
    return intArrayOf(0,0)
}