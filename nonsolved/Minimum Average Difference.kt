package nonsolved

fun main() {
    println(minimumAverageDifference(intArrayOf(2,5,3,9,5,3)))
}

fun minimumAverageDifference(nums: IntArray): Int {
    val sum = nums.sum(); val size = nums.size
    var minVal = Int.MAX_VALUE; var minIndex = 0
    var fir = 0; var sec = sum; var i = 0
    while (i < size) {
        fir += nums[i]
        sec -= nums[i]
        i++
        val value = if (size - i == 0) fir / i else Math.abs(fir / i - sec / (size - i))
        println("fir:\t$fir\t\tsec:\t$sec\t\tvalue:\t$value")
        if (minVal > value) {
            minVal = value; minIndex = i - 1
        }
    }
    return minIndex
}