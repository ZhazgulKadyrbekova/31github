fun main() {
    println(minDeletionSize(arrayOf("zyx","wvu","tsr")))
}

fun minDeletionSize(strs: Array<String>): Int {
    var count = 0
    var i = 0
    var j = 0
    var prev = '0'
    var isCount = true
    while (i <= strs[0].length - 1) {
        isCount = true
        while (j <= strs.size - 1) {
            // println("$prev\t${strs[j][i]}\t")
            if (strs[j][i].toInt() >= prev.toInt()) {
                prev = strs[j][i]
            } else {
                isCount = false
                break
            }
            j++
        }
        prev = '0'
        j = 0
        // println(isCount)
        i++
        if (!isCount) count++
    }
    return count
}