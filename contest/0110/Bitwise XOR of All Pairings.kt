fun main() {
    println(xorAllNums(intArrayOf(2,1,3), intArrayOf(10,2,5,0)))
}

fun xorAllNums(nums1: IntArray, nums2: IntArray): Int {
    var temp: Int? = null
    for (num1 in nums1) {
        for (num2 in nums2) {
            temp = if (temp == null) {
                num1 xor num2
            } else {
                temp xor num1 xor num2
            }
        }
    }
    return temp!!
}