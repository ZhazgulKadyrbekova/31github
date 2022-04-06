fun main() {
    println(numberOfSteps(14))  //6
    println(numberOfSteps(8))  //4
    println(numberOfSteps(123))  //12
}

fun numberOfSteps(num: Int): Int {
    var n = num
    var count = 0
    while (n != 0) {
        val isEven = n and 1 != 1
//        println("$n\t$count\t$isEven")
        if (isEven) n = n shr 1
        else n -= 1
        count++
    }
    return count
}