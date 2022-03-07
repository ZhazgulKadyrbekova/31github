fun main() {
//    val arr = pivotArray(intArrayOf(9,12,5,10,14,3,10), 10)
//    val arr = pivotArray(intArrayOf(-3,4,3,2), 2)
//    val arr = pivotArray(intArrayOf(19,15,12,-14,8,-7,-11), -7)
//    val arr = pivotArray(intArrayOf(18,-13,-19,-11,5,-17,0,-18,-12,-6,-20,-8,-20,-4,8), -20)
    val arr = pivotArray(intArrayOf(4,0,4,5,-11), 5)
    for (i in arr)
        print("$i\t")
}

fun pivotArray(nums: IntArray, pivot: Int): IntArray {
    var size = nums.size
    var i = 0
    var shiftedToEnd = 0
    while (i < size) {
        println("$i\t${nums[i]}\t$shiftedToEnd\t$size")
        var flag = false
        if (nums[i] > pivot) {
            shiftToEnd(nums, i)
            shiftedToEnd++
            flag = true
            size--
        } else if (nums[i] == pivot) {
            shiftedToEnd++
            shiftLeftAndAddToEnd(nums, i, nums.size - shiftedToEnd)
            flag = true
            size--
        }

        if (!flag) i++
    }
    return nums
}

fun shiftToEnd(nums: IntArray, index: Int) {
    val temp = nums[index]
    for (i in index until nums.size - 1) {
        nums[i] = nums[i+1]
    }
    nums[nums.size - 1] = temp

    for (j in nums) print("$j\t")
    println("shiftToEnd")
}

fun shiftLeftAndAddToEnd(nums: IntArray, start: Int, end: Int) {
    val temp = nums[start]
    for (i in start until end) {
        nums[i] = nums[i+1]
    }
    nums[end] = temp

    for (j in nums) print("$j\t")
    println("shift")
}