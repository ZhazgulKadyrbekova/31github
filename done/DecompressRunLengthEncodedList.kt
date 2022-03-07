fun main() {
    val arr = decompressRLElist(intArrayOf(1,1,2,3))
    for (i in arr)
        println(i)
}

fun decompressRLElist(nums: IntArray): IntArray {
    val size = nums.size / 2 - 1
    val arr = mutableListOf<Int>()

    for (i in 0..size) {
        val range = nums[2*i]
        val value = nums[2*i+1]
        for (j in 1..range)
            arr.add(value)
    }

    return arr.toIntArray()
}