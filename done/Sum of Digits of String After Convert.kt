fun main() {
    println(getLucky("zbax", 2))
}

fun getLucky(s: String, k: Int): Int {
    val arr = arrayOf('a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z')
    val stringBuilder = StringBuilder()
    for (i in s) {
        stringBuilder.append(arr.indexOf(i) + 1)
    }
    var numb = stringBuilder.toString()
    for (i in 1..k) {
        numb = getSumOfDigits(numb).toString()
    }
    return numb.toInt()
}
fun getSumOfDigits(nm: String): Int {
    var sum = 0
    for (i in nm) {
        sum += i.toInt() - 48
    }
    return sum
}