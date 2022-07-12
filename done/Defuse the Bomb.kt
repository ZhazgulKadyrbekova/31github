fun main() {
    val arr = intArrayOf(3,4,9,1,5)
    val res = decrypt(arr, 2)
    for (i in res)
        println(i)
}

fun decrypt(code: IntArray, k: Int): IntArray {
    val size = code.size - 1
    var i = 0
    val resArr = IntArray(code.size)
    while (i <= size) {
        var sum = 0
        if (k > 0) {
            for (j in 1..k) {
                sum += code[(i+j) % (size+1)]
            }
        }
        else if (k < 0) {
            val tempSize = -k
            for (j in 1..tempSize) {
                val index = if (i-j < 0) size +1+ (i-j) else i-j
                sum += code[index]
            }
        }
        else sum = 0
        resArr[i] = sum
        i++
    }
    return resArr
}