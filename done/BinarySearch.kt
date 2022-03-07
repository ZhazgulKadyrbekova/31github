fun main() {
    println(search(intArrayOf(-1,0,3,5,9,12), 9))
    println(search(intArrayOf(-1,0,3,5,9,12), 2))
    println(search(intArrayOf(-1,0,3,5,9,12), -1))
}

fun search(nums: IntArray, target: Int): Int {
    return binarySearch(nums, 0, nums.size - 1, target)
}

fun binarySearch(nums: IntArray, start: Int, end: Int, target: Int): Int {
    if (end >= start) {
        val half = start + (end - start) / 2
        return if (nums[half] == target) half
        else if (nums[half] > target) binarySearch(nums, start, half - 1, target)
        else binarySearch(nums, half + 1, end, target)
    }
    return -1
}