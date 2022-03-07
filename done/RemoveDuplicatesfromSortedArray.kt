fun main() {
//    val arr = intArrayOf(1,1,2)
    val arr = intArrayOf(0,0,1,1,1,2,2,3,3,4)
    val k = removeDuplicates(arr)
    println(k)
    for (i in 0..(k-1))
        print("${arr[i]}\t")
}

fun removeDuplicates(nums: IntArray): Int {
    if (nums.isEmpty()) return 0
    var size = nums.size - 1
    var count = 0
    var i = 1
    var prevVal = nums[0]
    while (i <= size) {
//        for (j in nums) print("$j\t")
//        println("remove\t$prevVal\t$i")

        var flag = false
        if (nums[i] == prevVal) {
            count++
            size--
            flag = true
            shiftLeft(nums, i, nums.size - 1)
        } else {
            prevVal = nums[i]
        }
        if (!flag) i++
    }
    return nums.size -count
}


fun shiftLeft(nums: IntArray, start: Int, end: Int) {
    for (i in start until end) {
        nums[i] = nums[i+1]
    }
//    for (j in nums) print("$j\t")
//    println("shift")
}