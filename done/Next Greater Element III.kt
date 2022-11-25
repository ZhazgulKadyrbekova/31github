fun main() {
    println(nextGreaterElement(12443322))
    println(nextGreaterElement(21))
}

fun nextGreaterElement(tmp: Int): Int {
    var n: Long = tmp.toLong()
    val count = IntArray(10)
    var curRem: Int; var prevRem = -1

    while (n > 0) {
        curRem = (n % 10).toInt()
        n /= 10
        count[curRem]++
        if (prevRem > curRem) {
            var nmb = curRem + 1
            while (count[nmb] == 0) nmb++
            count[nmb]--
            n = n * 10 + nmb

            for (i in 0 until 10) {
                while (count[i]-- > 0) {
                    n = n * 10 + i
                }
            }
            return if (n > Int.MAX_VALUE) -1 else n.toInt()
        }
        prevRem = curRem
    }
    return -1
}
