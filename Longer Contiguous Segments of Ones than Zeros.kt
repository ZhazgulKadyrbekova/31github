fun main() {
    println(checkZeroOnes("1"))         //true
    println(checkZeroOnes("100111"))    //true
    println(checkZeroOnes("0"))         //false
    println(checkZeroOnes("10"))        //false
    println(checkZeroOnes("110100010"))
}

fun checkZeroOnes(s: String): Boolean {
    if (s.length == 1 && s[0] == '1') return true
    val text = "${s}a"
    var ones = 0
    var zeros = 0
    var current = 0
    var prev = 'a'
    for (i in text) {
        if (i == prev) {
            current++
        }
        else {
            if (prev == '0') {
                zeros = if (zeros > current) zeros else current
            }
            if (prev == '1') {
                ones = if (ones > current) ones else current
            }
            prev = i
            current = 0
        }
    }
    return ones > zeros
}