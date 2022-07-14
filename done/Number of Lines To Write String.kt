fun main() {
    val arr = intArrayOf(10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10)
    println(numberOfLines(arr, "abcdefghijklmnopqrstuvwxyz"))
}

fun numberOfLines(widths: IntArray, s: String): IntArray {
    var rows = 0
    var rowSize = 0
    for (i in s.toCharArray()) {
        val index = i.toInt() - 97
        if (rowSize + widths[index] > 100) {
            rows++
            rowSize = widths[index]
        }
        else {
            rowSize += widths[index]
        }
    }
    return intArrayOf(rows+1, rowSize)
}