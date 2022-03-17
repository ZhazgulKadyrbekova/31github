fun main() {
    val arr = buildArray(intArrayOf(1,2), 4)
    for (i in arr)
        println(i)
}

fun buildArray(target: IntArray, n: Int): List<String> {
    val res = mutableListOf<String>()
    var k = 0
    val size = target.size

    for (i in 1..n) {
        println("$k\t${target[k]}\t$i")
        if (i == target[k]) {
            res.add("Push")
            k++
        }
        else {
            res.add("Push")
            res.add("Pop")
        }
        if (k >= size) break
    }
    return res
}