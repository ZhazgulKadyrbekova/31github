fun main() {
    println(findPeakElement(intArrayOf(1)))
    println(findPeakElement(intArrayOf(1,2)))
    println(findPeakElement(intArrayOf(1,2,3)))
    println(findPeakElement(intArrayOf(1,2,3,1)))
    println(findPeakElement(intArrayOf(1,2,1,3,5,6,4)))
}

fun findPeakElement(nums: IntArray): Int {
    if (nums.size == 1) return 0
    if (nums.size == 2) return if (nums[0] > nums[1]) 0
    else 1
    val size = nums.size - 2
    for (i in 1..size) {
//        println("$i\t${nums[i]}")
        if (nums[i] > nums[i-1] && nums[i] > nums[i+1]) {
            return i
        }
    }
    return if (nums[0] > nums[size + 1]) 0
    else size + 1
}
