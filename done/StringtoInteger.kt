fun main() {
//    println(myAtoi("42"))
//    println(myAtoi("    -42"))
//    println(myAtoi("words and 987"))
//    println(myAtoi("91283472332"))
//    println(myAtoi("-21474836480"))
//    println(myAtoi("   +0 123"))
//    println(myAtoi("+-12"))
//    println(myAtoi("010"))
//    println(myAtoi("2147483646"))
//    println(myAtoi("2147483648"))
//    println(myAtoi("-2147483647"))
//    println(myAtoi("2147483656"))
//    println(myAtoi("3147483656"))
    println(myAtoi("  +  413"))
}

fun myAtoi(s: String): Int {
    var res: Int? = null
    var sign: Boolean? = null
    val digits = "1234567890"

    for (i in s) {
        println("$i\t$sign\t$res")
        if (i == ' ') {
            if (res == null && sign == null) continue
            else break
        }
        else if (i == '+') {
            if (res == null && sign == null) sign = true
            else break
        }
        else if (i == '-') {
            if (res == null && sign == null) sign = false
            else break
        }
        else  {
            if (!digits.contains(i)) break
            else {
                val temp = checkAndMultiplyResultNumber(sign ?: true, res ?: 0, i.toInt() - 48)
                if (temp == -1) {
                    return if (sign == null || sign) Int.MAX_VALUE
                    else Int.MIN_VALUE
                }
                res = temp
                println("temp\t$temp\tres\t$res")
            }
        }
    }
    return  if (res == null) 0
            else if (sign == null || sign) res
            else -res
}
fun checkAndMultiplyResultNumber(sign: Boolean, res: Int, digit: Int): Int {
    val max = Int.MAX_VALUE / 10
    val remainder = if (sign) Int.MAX_VALUE % 10 else Int.MAX_VALUE % 10 + 1
    println("${max/10}\t$res\t${max%10}")
    return if (max > res) res * 10 + digit
    else if (max < res) -1
    else {
        if (remainder > digit) res * 10 + digit
        else -1
    }
}