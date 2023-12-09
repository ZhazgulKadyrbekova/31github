fun main() {
    println(maximumValue(arrayOf("alic3","bob","3","4","00000")))
}

fun maximumValue(strs: Array<String>): Int {
    var max = 0
    for (str in strs) {
        val value = getValue(str)
        if (value > max) max = value
    }
    return max
}

fun getValue(str: String): Int {
    return try {
        str.toInt()
    } catch (e: NumberFormatException) {
        str.length
    }
}