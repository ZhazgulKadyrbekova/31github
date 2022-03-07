fun main() {
//    val arr = getAncestors(8, arrayOf(intArrayOf(0,3), intArrayOf(0,4), intArrayOf(1,3),intArrayOf(2,4),
//        intArrayOf(2,7),intArrayOf(3,5),intArrayOf(3,6),intArrayOf(3,7),intArrayOf(4,6)))
    val arr = getAncestors(6, arrayOf(intArrayOf(0,3), intArrayOf(5,0), intArrayOf(2,3),intArrayOf(4,3),
        intArrayOf(5,3),intArrayOf(1,3),intArrayOf(2,5),intArrayOf(0,1),intArrayOf(4,5), intArrayOf(4,2), intArrayOf(4,0),
        intArrayOf(2,1), intArrayOf(5,1)))
    for (i in arr)
        println(i)
}
/*
fun getAncestors(n: Int, edges: Array<IntArray>): List<List<Int>> {
    var k = 0
    val res: MutableList<List<Int>> = mutableListOf()
    while (k < n) {
        res.add(getListByK(k, edges))
        k++
    }
    return res
}

fun getListByK(k: Int, edges: Array<IntArray>): List<Int> {
    val set = mutableSetOf<Int>()
    for (i in edges) {
        if (i[1] == k) {
            set.addAll(getListByK(i[0], edges))
            set.add(i[0])
        }
    }
//    println("k: $k\tset: $set")
    return set.toList().sorted()
}
*/

fun getAncestors(n: Int, edges: Array<IntArray>): List<List<Int>> {
    val edges1 = mutableListOf<List<Int>>()
    for (i in edges)
        edges1.add(listOf(i[0],i[1]))

    println(edges1)
    var k = 0
    val res: MutableList<List<Int>> = mutableListOf()
    while (k < n) {
        val set = mutableSetOf<Int>()
        println("k:\t$k")
        for (i in edges1) {
            if (i[1] == k) {
                if (i[0] >= k) {
                    edges1.add(i)
                    continue
                }
                else
                    set.addAll(res[i[0]])
                set.add(i[0])
            }
        }

        res.add(set.toList().sorted())
        k++
        println("set:\t$set")
    }
    return res
}
