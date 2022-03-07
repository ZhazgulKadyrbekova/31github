fun main() {
//    val arr = buildArray(intArrayOf(0,2,1,5,3,4))
    val arr = buildArray(intArrayOf(5,0,1,2,3,4))
    for (i in arr)
        println(i)
}

fun buildArray(nums: IntArray): IntArray {
    val size = nums.size
    val ans = IntArray(size)
    val index = size - 1

    for (i in 0..index)
        ans[i] = nums[nums[i]]

    return ans
}