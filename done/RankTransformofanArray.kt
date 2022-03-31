fun main() {
    val arr = arrayRankTransform(intArrayOf(40,10,20,30,20))
    for (i in arr)
        println(i)
}

fun arrayRankTransform(arr: IntArray): IntArray {
    val res = arr.clone().sorted().toMutableList()
    val map = hashMapOf<Int, Int>()
    for (i in res)
        map.putIfAbsent(i, map.size + 1)
    println("$res\n$map")

    for (i in arr.indices) {
        res[i] = map[arr[i]]!!
    }
    return res.toIntArray()
}