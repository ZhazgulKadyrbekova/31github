fun main() {
    println(majorityElement1(intArrayOf(3,2,3)))
    println(majorityElement1(intArrayOf(2,2,1,1,1,2,2)))
}

fun majorityElement1(nums: IntArray): Int {
    val size = nums.size
    val max = size/2
    val trueArr = BooleanArray(size)
    for (i in 0..size) {
        if (trueArr[i]) continue
        val a = getDigits1(nums[i], nums, trueArr)
        if (a > max) return nums[i]
    }
    return 0
}

fun getDigits1(num: Int, nums: IntArray, trueArr: BooleanArray): Int {
    var count = 0
    for (i in 0..(nums.size-1)) {
        if (nums[i] == num) {
            count++
            trueArr[i] = true
        }
    }
    return count
}