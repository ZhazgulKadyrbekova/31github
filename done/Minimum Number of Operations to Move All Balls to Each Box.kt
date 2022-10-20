fun main() {
    var arr = minOperations("110")
    for (i in arr)
        println(i)
    println()
    arr = minOperations("001011")
    for (i in arr)
        println(i)
}

private fun minOperations(boxes: String): IntArray {
    val size = boxes.length; val answer = IntArray(size)
    var i = 0; var j: Int
    while (i < size) {
        var count = 0; j = 0
        while (j < size) {
            if (i == j) {
                j++; continue
            }
            if (boxes[j] == '1') {
                count += Math.abs(i - j)
            }
            j++
        }
        answer[i] = count
        i++
    }
    return answer
}