fun main() {
    println(singleNumber(intArrayOf(2,2,3,2)))
    println(singleNumber(intArrayOf(0,1,0,1,0,1,99)))
//    println(singleNumber(intArrayOf(1)))
}

fun singleNumber(nums: IntArray): Int {
    for (i in nums) {
        if (containNumber(i, nums) == 1) return i
    }
    return 0
}

fun containNumber(num: Int, nums: IntArray): Int {
    var count = 0
    for (i in nums) {
        if (num == i)
            count++
    }
    return count
}