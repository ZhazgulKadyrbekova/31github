fun main() {
//    val arr = smallestSubarrays(intArrayOf(8,10,8))
    val arr = smallestSubarrays(intArrayOf(1,0,2,1,3))
    for (i in arr) {
        println(i)
    }
}

//not solved
fun smallestSubarrays(nums: IntArray): IntArray {
    val res = mutableListOf<Int>()
    var i = 0
    while (i < nums.size) {
        println("i\tnums[i]\tcurrent\tmax\tcount")
        res.add(getCountMaxBOR(i,nums))
        println("------------------------------------------------------------------------------------------------")
        i++
    }
    return res.toIntArray()
}

fun getCountMaxBOR(index: Int, nums: IntArray): Int {
    var count = 1
    var current = nums[index]
    var max = current
    var i = index + 1
    while (i < nums.size) {
        current = current or nums[i]
        println("$i\t${nums[i]}\t\t$current\t\t$max\t$count")
        if (max < current) {
            max = current
            count = i - index + 1
        }
        i++
    }
    return count
}