fun main() {
    val arr = intArrayOf(1,2,3,0,0,0)
    merge(arr, 3, intArrayOf(2,5,6), 3)
    for (i in arr)
        print("$i\t")
}

fun merge(nums1: IntArray, m: Int, nums2: IntArray, n: Int): Unit {
    val size = nums1.size - 1
    var i = 0
    var k = 0
    while (i <= size) {
//        println("i:\t$i\t${nums1[i]}\tk:\t$k\t${nums2[k]}")
        if (k >= n) break
        if (nums1[i] > nums2[k]) {
            shiftRight(nums1, i, nums2[k])
            k++
//            i--
        }
        else if (i >= m) {
            shiftRight(nums1, i, nums2[k])
            k++
        }
        i++
//        k++
    }
}

fun shiftRight(nums: IntArray, start: Int, nmb: Int) {
    for (i in nums.size - 2 downTo start) {
        nums[i+1] = nums[i]
    }
    nums[start] = nmb

    for (j in nums) print("$j\t")
    println("shiftRight")
}

