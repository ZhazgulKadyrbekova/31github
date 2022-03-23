fun main() {
//    val arr = nextGreaterElement(intArrayOf(4,1,2), intArrayOf(1,3,4,2))
//    val arr = nextGreaterElement(intArrayOf(2,4), intArrayOf(1,2,3,4))
    val arr = nextGreaterElement(intArrayOf(1,3,5,2,4), intArrayOf(5,4,3,2,1))
    for (i in arr)
        print("$i\t")
    println()
}

fun nextGreaterElement(nums1: IntArray, nums2: IntArray): IntArray {
    val res = IntArray(nums1.size)
    var k = 0
    var flag = false

    for (i in nums1) {
        flag = false
        val index = nums2.indexOf(i) + 1
        val size = nums2.size - 1
        println("$i\t$index\t$size\t${res.toList()}")
        if (size < index) {
            res[k++] = -1
            continue
        }
        for (j in index..size) {
            println("$j\t${nums2[j]}")
            if (nums2[j] > i) {
                res[k++] = nums2[j]
                flag = true
                break
            }
        }
        if (!flag)
            res[k++] = -1
    }

    return res
}