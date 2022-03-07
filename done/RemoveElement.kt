fun main() {
    println(removeElement(intArrayOf(3,2,2,3),3))
//    println(removeElement(intArrayOf(0,1,2,2,3,0,4,2),2))
}

fun removeElement(nums: IntArray, `val`: Int): Int {
    var size = nums.size - 1
    var count = 0
    var i = 0
    while (i <= size) {
        var flag = false
        if (nums[i] == `val`) {
            count++
            size--
            flag = true
            shiftLeft(nums, i, nums.size - 1)
        }
        if (!flag) i++
    }
    return nums.size -count
}
