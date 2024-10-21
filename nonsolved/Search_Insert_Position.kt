package nonsolved

fun main() {
    println(searchInsert(intArrayOf(1,3,5,6), 5))
    println(searchInsert(intArrayOf(1,3,5,6), 2))
    println(searchInsert(intArrayOf(1,3,5,6), 7))
}

fun searchInsert(nums: IntArray, target: Int): Int {
    val size = nums.size - 1
    for (i in 0..size) {
        if (nums[i] == target) return i
        else if (nums[i] > target) return i
    }
    return size + 1
}
