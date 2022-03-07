fun main() {
    println(intToRoman(14))
    println(intToRoman(3))
    println(intToRoman(58))
    println(intToRoman(1994))
}
fun intToRoman(num: Int): String {
    val numbers = listOf(1000, 900, 500,  400, 100,   90,  50,   40,  10,    9,   5,    4,  1)
    val rims    = listOf( "M","CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I")
    var nmb = num
    val stringBuilder = StringBuilder()
    var i = 0
    while (i < numbers.size) {
        while (nmb >= numbers[i]) {
            nmb -= numbers[i]
            stringBuilder.append(rims[i])
        }
        i++
    }

    return stringBuilder.toString()
}