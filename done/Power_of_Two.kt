fun main() {
    println(isPowerOfTwo(-1))
}

fun isPowerOfTwo(n: Int): Boolean {
    return  if (n == 1) true
            else if (n == 0) false
            else if (n % 2 == 1) false
            else isPowerOfTwo(n/2)
}