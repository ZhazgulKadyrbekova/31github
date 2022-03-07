fun main() {
//    val arr = getAncestors(8, arrayOf(intArrayOf(0,3), intArrayOf(0,4), intArrayOf(1,3),intArrayOf(2,4),
//        intArrayOf(2,7),intArrayOf(3,5),intArrayOf(3,6),intArrayOf(3,7),intArrayOf(4,6)))
    val arr = getAncestors(6, arrayOf(intArrayOf(0,3), intArrayOf(5,0), intArrayOf(2,3),intArrayOf(4,3),
        intArrayOf(5,3),intArrayOf(1,3),intArrayOf(2,5),intArrayOf(0,1),intArrayOf(4,5), intArrayOf(4,2), intArrayOf(4,0),
        intArrayOf(2,1), intArrayOf(5,1)))
    for (i in arr)
        println(i)
}

fun getAncestors2(n: Int, edges: Array<IntArray>): List<List<Int>> {
    var k = 0
    val res: MutableList<List<Int>> = mutableListOf()
    while (k < n) {
        val set = mutableSetOf<Int>()
        for (i in edges) {
            if (i[1] == k) {
                if (i[0] <= k)
                    set.addAll(res[i[0]])
                set.add(i[0])
            }
        }
        res.add(set.toList().sorted())
        k++
    }
    return res
}