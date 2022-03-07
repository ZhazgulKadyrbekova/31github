fun main() {
//    val arr = targetIndices(intArrayOf(1,2,5,2,3),2)
//    val arr = targetIndices(intArrayOf(1,2,5,2,3),3)
    val arr = targetIndices(intArrayOf(1,2,5,2,3),5)
    for (i in arr)
        print("$i\t")
}

fun targetIndices(nums: IntArray, target: Int): List<Int> {
    nums.sort()
    val size = nums.size - 1
    val res = mutableListOf<Int>()
    for (i in 0..size) {
        if (nums[i] == target)
            res.add(i)
    }
//    res.removeAt()

    return res
}
