import java.util.*

fun main() {
//    val arr = sortedSquares(intArrayOf(-4,-1,0,3,10))
    val arr = sortedSquares(intArrayOf(-7,-3,2,3,11))
    for (i in arr)
        println(i)
}

fun sortedSquares(nums: IntArray): IntArray {
    val size = nums.size - 1
    for (i in 0..size) {
        nums[i] = nums[i] * nums[i]
    }
    Arrays.sort(nums)
    return nums
}