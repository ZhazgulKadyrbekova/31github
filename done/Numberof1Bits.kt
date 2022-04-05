fun main() {
    println(hammingWeight(521))
    println(hammingWeight(2097152))
//    println(hammingWeight(11111111111111111111111111111101))
}

fun hammingWeight(n:Int):Int {
    var count = 0
    var num = n
    while (num != 0) {
        num = num and (num - 1)
        count++
    }
    return count
}