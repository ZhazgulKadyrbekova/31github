fun main() {
    println(hammingDistance(1,4))
    println(hammingDistance(3,1))
}

fun hammingDistance(x: Int, y: Int): Int {
    var a = x xor y
    println(a)
    a = hammingWeight(a)
    println(a)
    return a
}