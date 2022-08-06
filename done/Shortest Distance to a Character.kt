fun main() {
    val arr = shortestToChar("aaba", 'b')
    for (i in arr)
        println(i)
}

fun shortestToChar(s: String, c: Char): IntArray {
    val size = s.length - 1
    val res = IntArray(size+1)
    val indexes = mutableListOf<Int>()
    for (i in 0..size) if (s[i] == c) indexes.add(i)
    var k = 0
    for (i in 0..size) {
        println("i: $i\tk: $k")
        if (k < indexes.size && i == indexes[k]) {
            res[i] = 0
            k++
        }
        else if (k != 0 && k < indexes.size) {
            res[i] = Math.min(Math.abs(indexes[k-1] - i), Math.abs(indexes[k] - i))
        }
        else if (k != 0) {
            res[i] = Math.abs(indexes[k-1] - i)
        }
        else res[i] = Math.abs(indexes[k] - i)
    }
    return res
}