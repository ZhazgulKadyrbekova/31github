fun main() {
    val arr = sumZero(5)
    for (i in arr)
    println(i)
}

fun sumZero(n: Int): IntArray {
    val arr = IntArray(n)
    var temp = n
    for (i in 0 until n-1 step 2) {
        arr[i] = temp
        arr[i+1] = -temp
        temp -= 1
    }
    return arr
}