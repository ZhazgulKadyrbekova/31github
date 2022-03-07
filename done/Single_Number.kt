fun main() {
    println(singleNumber1(intArrayOf(2,2,1)))
    println(singleNumber1(intArrayOf(4,1,2,1,2)))
    println(singleNumber1(intArrayOf(1)))
}

fun singleNumber1(nums: IntArray): Int {
    for (i in nums) {
        if (containNumber(i, nums) != 2) return i
    }
    return 0
}

fun containNumber1(num: Int, nums: IntArray): Int {
    var count = 0
    for (i in nums) {
        if (num == i)
            count++
    }
    return count
}