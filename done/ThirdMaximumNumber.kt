fun main() {
    println(thirdMax(intArrayOf(3,2,1)))
    println(thirdMax(intArrayOf(3,2,1,6,8,7)))
    println(thirdMax(intArrayOf(3,2,2,1)))
    println(thirdMax(intArrayOf(1,2)))
    println(thirdMax(intArrayOf(2,2,3,1)))
    println(thirdMax(intArrayOf(1,2,-2147483648))) //2147483648
}

fun thirdMax(nums: IntArray): Int {
    val sortedList = nums.toList().sortedByDescending { it }.distinct()
    val size = sortedList.size
    return if (size >= 3) sortedList[2]
    else sortedList[0]
}
