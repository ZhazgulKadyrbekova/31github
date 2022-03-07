fun main() {
    val arr = runningSum(intArrayOf(3,1,2,10,1))
    for (i in arr)
        println(i)
}

fun runningSum(nums: IntArray): IntArray {
    val res = IntArray(nums.size)
    res[0] = nums[0]
    for (i in 1..(nums.size - 1)) {
        res[i] = nums[i] + res[i-1]
    }
    return res
}