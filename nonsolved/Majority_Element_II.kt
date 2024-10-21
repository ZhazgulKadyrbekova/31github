package nonsolved

fun main() {
    println(majorityElement(intArrayOf(3,2,3)))
    println(majorityElement(intArrayOf(1)))
    println(majorityElement(intArrayOf(1,2)))
}

fun majorityElement(nums: IntArray): List<Int> {
    val res = mutableListOf<Int>()
    val max = nums.size / 3
    for (i in nums) {
        if (res.contains(i)) continue
        if (getDigits(i, nums) > max) res.add(i)
    }
    return res
}

fun getDigits(num: Int, nums: IntArray): Int {
    var count = 0
    for (i in nums) {
        if (num == i) count++
    }
    return count
}