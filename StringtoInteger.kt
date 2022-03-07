fun main() {
//    println(myAtoi("42"))
//    println(myAtoi("    -42"))
//    println(myAtoi("words and 987"))
//    println(myAtoi("-91283472332"))
//    println(myAtoi("-21474836480"))
//    println(myAtoi("   +0 123"))
//    println(myAtoi("+-12"))
//    println(myAtoi("010"))
//    println(myAtoi("2147483646"))
//    println(myAtoi("2147483648"))
    println(myAtoi("-2147483647"))
//    println(myAtoi("2147483656"))
//    println(myAtoi("3147483656"))
}

fun myAtoi(s: String): Int {
    var res = 0
    var sign: Boolean? = null
    val digits = "1234567890"
    var startedDigits = false

    for (i in 0..(s.length-1)) {
        if (s[i] == ' ' && !startedDigits)
            continue
        else if (s[i] == '-' && sign == null && !startedDigits)
            sign = false
        else if (s[i] == '+' && sign == null && !startedDigits)
            sign = true
        else if (digits.contains(s[i])) {
            val digit = s[i].toInt() - 48
            val max = Int.MAX_VALUE
            val min = Int.MIN_VALUE
            startedDigits = true
            if (sign == null) sign = true
            if (max/10 <= res && (max/10 < res || (max/10 == res && digit > 6)) && sign)
                return max
            if (min/10 > res || (min/10 == res && digit > 8))
                return min
            res *= 10
            res += digit
        } else break
    }
    return  if (sign == null || sign) res
            else res*(-1)
}