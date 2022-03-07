fun main() {
    println(addDigits(0))
}

fun addDigits(num: Int): Int {
    return  if (num >= 10) addDigits(getSumOfDigits(num))
            else num
}

fun getSumOfDigits(n: Int): Int {
    var sum = 0
    var num = n
    while (num > 0) {
        sum += num%10
        num /= 10
    }
    return sum
}