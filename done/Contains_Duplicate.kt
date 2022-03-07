package done

fun main() {
    val arr: IntArray = intArrayOf(1,1,1,3,3,4,3,2,4,2)
    println(containsDuplicate(arr))
}

fun containsDuplicate(nums: IntArray): Boolean {
    val size: Int = nums.size - 1
    for (i in 0..size) {
        for (j in (i+1)..size) {
            if (nums[i] == nums[j]) return true
        }
    }
    return false
}