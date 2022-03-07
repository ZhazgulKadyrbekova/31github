fun main() {
//    println(searchA(intArrayOf(4,5,6,7,0,1,2),0))
//    println(searchA(intArrayOf(4,5,6,7,0,1,2),3))
    println(searchA(intArrayOf(5,1,3),3))
}

fun searchA(nums: IntArray, target: Int): Int {
    val size = nums.size - 1
    var left = 0
    var right = size

    while (left <= right) {
        val mid = left + (right - left) / 2

        println("$left\t$mid\t$right")
        if (nums[mid] == target) return mid
        if (nums[left] <= nums[mid]) {
            if (nums[left] <= target && target < nums[mid])
                right = mid - 1
            else
                left = mid + 1
        }
        else {
            if (nums[mid] < target && target <= nums[right])
                left = mid + 1
            else
                right = mid - 1
        }
    }
    return -1
}