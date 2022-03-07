fun main() {
    println(findMaxConsecutiveOnes(intArrayOf(1,1,0,1,1,1)))
    println(findMaxConsecutiveOnes(intArrayOf(1,0,1,1,0,1)))
}

fun findMaxConsecutiveOnes(nums: IntArray): Int {
    var count = 0
    var max = 0

    for (i in nums) {
        if (i == 1)
            count++
        else {
            if (max < count)
                max = count
            count = 0
        }
    }
    return  if (max > count) max
            else count
}
