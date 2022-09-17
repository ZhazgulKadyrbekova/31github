fun main() {
    println(reformat("a10b1c2"))
}

fun reformat(s: String): String {
    val digits = mutableListOf<Char>()
    val letters = mutableListOf<Char>()
    for (i in s) {
        if (i in 'a'..'z')
            letters.add(i)
        else
            digits.add(i)
    }
    if (Math.abs(letters.size - digits.size) > 1)
        return ""
    val stringBuilder = StringBuilder()
    var i = 0
    while (i < letters.size && i < digits.size) {
        stringBuilder.append(letters[i]).append(digits[i])
        i++
    }
    if (i < letters.size) {
        stringBuilder.append(letters[i])
    }
    if (i < digits.size) {
        stringBuilder.insert(0, digits[i])
    }
    return stringBuilder.toString()
}