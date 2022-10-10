fun main() {
    println(pivotIndex(intArrayOf(1,7,3,6,5,6)))
}

fun pivotIndex(nums: IntArray): Int {
    var i = 0; var left = 0; var right = nums.sum()
    while (i < nums.size) {
        right -= nums[i]
        if (left == right) return i
        left += nums[i]
        i++
    }
    return -1
}