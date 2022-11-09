fun main() {
    println(beautySum("aabcb"))
}

fun beautySum(s: String): Int {
    var res = 0; val size = s.length
    var i = 0; var j: Int
    while (i < size) {
        j = i
        val list = IntArray(26) { 0 }
        while (j < size) {
            list[s[j].toInt() - 97]++
            res += beauty(list)
            j++
        }
        i++
    }
    return res
}
fun beauty(list: IntArray): Int {
    var mf = -1; var lf: Int = Int.MAX_VALUE; var i = 0
    while (i < 26) {
        mf = Math.max(mf, list[i])
        if (list[i] > 0) {
            lf = Math.min(lf, list[i])
        }
        i++
    }
    return mf - lf
}
