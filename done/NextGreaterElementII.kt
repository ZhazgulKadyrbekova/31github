fun main() {
//    val arr = nextGreaterElements(intArrayOf(1,2,1))
    val arr = nextGreaterElements(intArrayOf(1,2,3,4,5))
    for (i in arr)
        print("$i\t")
    println()
}

fun nextGreaterElements(nums: IntArray): IntArray {
    var size = nums.size
    val resList = IntArray(size)
    size -= 1
    var max = Int.MIN_VALUE
    for (i in nums)
        max = Math.max(i, max)
    var cur: Int

    for (i in 0..size) {
        cur = nums[i]
        if (cur == max) {
            resList[i] = -1
        }
        else {
            for (j in (i+1)..(size+i)) {
                val temp = nums[j % (size+1)]
//                println("$i\t$j\t$cur\t$temp\t${j%size}\t")
                if (temp > cur) {
                    resList[i] = temp
                    break
                }
            }
        }
    }
    return resList
}