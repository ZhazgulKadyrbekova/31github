fun main() {
    val res = licenseKeyFormatting("5F3Z3-2e-9-w", 4)
    println(res == "5-F3Z3-2E9W")
//    println(licenseKeyFormatting("2-5g-3-J", 2))
}

fun licenseKeyFormatting(s: String, k: Int): String {
    val charArr = s.toCharArray()
    val size = charArr.size - 1
    var builder = StringBuilder()
    val list = mutableListOf<String>()

    for (i in size downTo 0) {
        val char = charArr[i]
        if (char != '-')
            builder.insert(0, char.toUpperCase())
        if (builder.length >= k) {
            list.add(0, builder.toString())
            builder = StringBuilder()
        }
    }
    if (!builder.isEmpty())
        list.add(0, builder.toString())
    return list.joinToString("-")
}
