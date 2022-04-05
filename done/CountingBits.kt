fun main() {
    val arr = countBits(5)
    for (i in arr)
        print("$i\t")
    println()
}

fun countBits(n: Int): IntArray {
    val arr = IntArray(n+1)
    for (i in 0..n) {
        arr[i] = hammingWeight(i)
    }
    return arr
}