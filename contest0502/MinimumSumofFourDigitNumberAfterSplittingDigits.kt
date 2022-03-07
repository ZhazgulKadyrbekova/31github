fun main() {
    println(minimumSum(2932))
    println(minimumSum(4009))
}

fun minimumSum(num: Int): Int {
    var n = num
    val arr = IntArray(4)
    for (i in 0..3) {
        arr[i] = n % 10
        n /= 10
    }
    arr.sort()
    val num1 = arr[0] * 10 + arr[2]
    val num2 = arr[1] * 10 + arr[3]
    return num1 + num2
}