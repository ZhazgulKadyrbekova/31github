fun main() {
    val arr = intersect1(intArrayOf(1,2,2,1), intArrayOf(2,2))
//    val arr = intersect(intArrayOf(4,9,5), intArrayOf(9,4,9,8,4))
    for (i in arr) {
        println(i)
    }
}

fun intersect1(nums1: IntArray, nums2: IntArray): IntArray {
    val res = mutableListOf<Int>()
//    println(res)
    if (nums1.size < nums2.size) {
        for (i in nums1)
            if (contains1(i, nums2) && !contains1(i, res))
                res.add(i)
    }
    else {
        for (j in nums2)
            if (contains1(j, nums1) && !contains1(j, res))
                res.add(j)
    }
    return res.toIntArray()
}

fun contains1(num: Int, arr: IntArray): Boolean {
//    println("aaa\t$num\t${arr[0]}")
    for (i in arr)
        if (num == i) return true
    return false
}
fun contains1(num: Int, arr: List<Int>): Boolean {
//    println("bbb\t$num\t$arr")
    for (i in arr)
        if (num == i) return true
    return false
}
