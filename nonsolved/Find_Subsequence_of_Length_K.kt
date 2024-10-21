package nonsolved

fun main() {
    val arr = intArrayOf(2,1,3,3)
    val k = 2
    val res = maxSubsequence(arr,k)
    for (i in res) {
        println(i)
    }
}

fun maxSubsequence(nums: IntArray, k: Int): IntArray {
    nums.sort()
    val size = nums.size - 1
    var arr = intArrayOf(nums[size-k])
    var j = 1
//    var arr = mutableListOf<Int>(nums[size-k])
    for (i in nums[size-k+1]..(size-1)) {
        arr[j++] = nums[i]
//        arr.add(nums[i])
    }
    return arr
}
