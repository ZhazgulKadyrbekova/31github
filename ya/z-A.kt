import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    val a = scanner.nextInt()
    val b = scanner.nextInt()
    val sum = sum(a,b)
    println(sum)
}

fun sum(a: Int, b: Int): Int {
    return a + b
}