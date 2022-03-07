fun main() {
//    val arr = intersect(intArrayOf(1,2,2,1), intArrayOf(2,2))
//    val arr = intersect(intArrayOf(4,9,5), intArrayOf(9,4,9,8,4))
    val arr = intersect(intArrayOf(1,2), intArrayOf(1,1))
    for (i in arr) {
        println(i)
    }
}

fun intersect(nums1: IntArray, nums2: IntArray): IntArray {
    val res = mutableListOf<Int>()
//    println(res)
    if (nums1.size < nums2.size) {
        for (i in nums1) {
//            println("vvvv\t$i")
            if (contains(i, nums2)) {
                res.add(i)
                continue
            }
        }
    }
    else {
        for (j in nums2) {
//            println("ffff\t$j")
            if (contains(j, nums1)) {
                res.add(j)
                continue
            }
        }
    }
    return res.toIntArray()
}

fun contains(num: Int, arr: IntArray): Boolean {
//    println("aaa\t$num\t${arr[0]}")
    val size = arr.size - 1
    for (i in 0..size)
        if (num == arr[i]) {
            arr[i] = -1
            return true
        }
    return false
}
