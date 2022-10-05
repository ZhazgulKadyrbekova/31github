fun main() {
    val arr = construct2DArray(intArrayOf(1,2,3,4), 2,2)
    for (i in arr) {
        for (j in i)
            print("$j\t")
        println()
    }
}

fun construct2DArray(original: IntArray, m: Int, n: Int): Array<IntArray> {
    if (original.size != m * n) return emptyArray()

    val res = Array(m) { IntArray(n) }
    var i = 0; var j: Int; var k = 0
    while (i < m) {
        val intArray = IntArray(n)
        j = 0
        while (j < n) {
            intArray[j++] = original[k++]
        }
        res[i] = intArray
        i++
    }
    return res
}