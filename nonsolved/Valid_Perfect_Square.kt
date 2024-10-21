package nonsolved

fun main() {
    println(isPerfectSquare(2147483647))
}
//2147483647
fun isPerfectSquare(num: Int): Boolean {
    if (num == 1) return true
    var i = 2
    while (i*i <= num) {
        if (i*i >= 2147483647) return false
        println("$i\t${i*i}\t$num")
        if (i*i == num) return true
        i++
    }
    return false
}