fun main() {
    val arr = createTargetArray(intArrayOf(0,1,2,3,4), intArrayOf(0,1,2,2,1))
    for (i in arr)
        println(i)
}

//[1,2,3,4,0], index = [0,1,2,3,0]
//[0,1,2,3,4], index = [0,1,2,2,1]

fun createTargetArray(nums: IntArray, index: IntArray): IntArray {
    var size = nums.size
    var target = IntArray(size) { -1 }
    size -= 1

    for (i in 0..size) {
//        for (i in target)
//            print("$i ")
//        println()
//        if (index[i] != 0 && i != 0)
        target = shiftArray(target, index[i])
        target[index[i]] = nums[i]
    }

    return target
}

fun shiftArray(target: IntArray, index: Int): IntArray {
    val size = target.size - 1
    for (i in size downTo index) {
        if (i != 0)
            target[i] = target[i-1]
    }
    return target
}