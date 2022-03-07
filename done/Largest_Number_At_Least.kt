fun main() {
    val arr = intArrayOf(3,5,1,0)
    println(dominantIndex(arr))
}

fun dominantIndex(nums: IntArray): Int {
    var max = 0
    var imax = 0
    for (i in nums.indices) {
        if (nums[i] > max) {
            max = nums[i]
            imax = i
        }
    }

    for (i in nums.indices) {
        if (i == imax) continue
        if (nums[i] > max/2)
            return -1
    }
    return imax
}
