fun main() {
    val arr = smallerNumbersThanCurrent(intArrayOf(8,1,2,2,3))
    for (i in arr)
        println(i)
}

fun smallerNumbersThanCurrent(nums: IntArray): IntArray {
    val index = nums.size - 1
    val resArr = IntArray(nums.size)
    for (i in 0..index) {
        var count = 0
        for (j in 0..index) {
            if (i == j) continue
            if (nums[i] > nums[j]) count++
        }
        resArr[i] = count
    }
    return resArr
}